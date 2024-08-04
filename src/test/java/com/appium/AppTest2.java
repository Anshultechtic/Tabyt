package com.appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class AppTest2 {

    public static void main(String[] args) {
        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        
//        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 3a API 30");
        options.setApp(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\app-release (2).apk");

        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            System.out.println("Chalu ho gaya");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
//                driver.quit();
            }
//            service.stop();
        }
    }
}
