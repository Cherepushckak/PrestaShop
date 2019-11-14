package main.java.test;


import io.qameta.allure.Attachment;
import main.java.helperInstrument.EnviromentHelper;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class test implements ITestListener {

    @Override
    public void onTestFailure ( ITestResult result ) {
        saveScreenshot ();
    }
    
    @Attachment ( value = "Page screenshot", type = "image/png" )
    public byte[] saveScreenshot () {
        return ( ( TakesScreenshot ) OurWebDriver.driver ).getScreenshotAs ( OutputType.BYTES );
    }
    
    
    @BeforeTest
    protected void setUpWebDriver () {
        OurWebDriver webDriver = new OurWebDriver ();
        
    }

    @AfterTest ( alwaysRun = true )
    protected void closeWebDriver () {
        OurWebDriver.driver.quit ();
    }
}