package main.java.test.testok;

import main.java.tools.OurWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This class only for test my classes code
 */
public class Testing {
    @BeforeClass
    private void initDriver(){
        OurWebDriver webDriver = new OurWebDriver ();
    }

    @AfterClass (alwaysRun = true)
    private void quitDriver(){
        OurWebDriver.driver.quit ();
    }

    @Test
    public void testing(){
        System.out.println("Hello World!");
    }

}
