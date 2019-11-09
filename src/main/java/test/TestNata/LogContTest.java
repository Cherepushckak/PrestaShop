package main.java.test.TestNata;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

//public class LogContTest {

//    public void setProperties() {
//           System.setProperty("webdriver.chrome.driver", "C:\\Users\\AppData\\Local\\Google\\Chrome\\Application\\chromeDriver\\chromedriver.exe");
//    }
//
//    @BeforeMethod
//    public void beforeClass() {
//         setProperties();
//    }
//
//    @Test
//    public void goToMainPage() {
//
//        driverNata.driver.get("http://3.124.147.74/index.php");
//        System.out.println("HomePage");
//        WebElement actual = webDriver.findElement(By.xpath("//div[@class='header-top']//img[@class='logo img-responsive']"));
//        Assert.assertTrue(actual.isDisplayed());
//
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        driverNata.driver.quit();
//    }
//}