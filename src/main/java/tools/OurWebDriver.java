package main.java.tools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OurWebDriver {
    static public ChromeDriver driver;
    private static WebDriverWait wait;



    public OurWebDriver() {

        if ((System.getProperty("os.name")).contains("Mac OS")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty ( "macDriver" ));
       } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty ( "winDriver" ));
        }


        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize test browser window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(System.getProperty ( "prestaUrl" )); // GoTo startURL
        wait = new WebDriverWait(driver, 5);
        
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public void closeDriver() { driver.quit(); } // Close test browser windows to release hardware resources
}
