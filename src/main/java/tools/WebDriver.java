package main.java.tools;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    static public ChromeDriver driver;

    static public final String startURL = "http://3.124.147.74";  //Default URL for site
    
<<<<<<< HEAD
    public WebDriver (){


       System.setProperty ( "webdriver.chrome.driver" ,
=======
    public WebDriver(){
        System.setProperty ( "webdriver.chrome.driver" ,
>>>>>>> 65ee89be081872134b3e076fc2c32a7fcaca8ea4
                "src\\main\\java\\data\\chromedriver.exe" );

        driver = new ChromeDriver (  );
        driver.get ( startURL );
    }
    public void closeDriver(){
        driver.quit ();
    }
}
