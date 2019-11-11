package main.java.tools;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurWebDriver {
    static public ChromeDriver driver;
    private static final String startURL = "http://3.124.147.74"; // Default URL for site
    

    public OurWebDriver() {

        if ((System.getProperty("os.name")).contains("Mac OS")) {
            System.setProperty("webdriver.chrome.driver", "../Webdriver/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "..\\Webdriver\\chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize test browser window
        driver.get(startURL); // GoTo startURL
    }

    public void closeDriver() { driver.quit(); } // Close test browser windows to release hardware resources
}
