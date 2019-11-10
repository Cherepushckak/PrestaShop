package main.java.tools;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    static public ChromeDriver driver;

    static public final String startURL = "http://3.124.147.74";  //Default URL for site
    

    public WebDriver (){

        System.setProperty ( "webdriver.chrome.driver" ,
                "src\\main\\java\\data\\chromedriver.exe" );

        driver = new ChromeDriver (  );
        driver.get ( startURL );
    }
    public void closeDriver(){
        driver.quit ();
    }
}
