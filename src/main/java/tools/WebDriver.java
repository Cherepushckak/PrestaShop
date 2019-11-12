package main.java.tools;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    static public ChromeDriver driver;
    private static final String startURL = "http://3.124.147.74"; // Default URL for site

    public WebDriver() {

        if ((System.getProperty("os.name")).contains("Mac OS")) {
            System.setProperty("webdriver.chrome.driver", "../Webdriver/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "..\\Webdriver\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize test browser window
        driver.get(startURL); // GoTo startURL
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void closeDriver() { driver.quit(); } // Close test browser windows to release hardware resources
}
