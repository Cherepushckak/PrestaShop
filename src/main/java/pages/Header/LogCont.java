package pages.Header;

/**
 * Class contains webElement: logo and Contact Us
 */
public class LogCont {

    /** element 'MyStore' on the pages.Header */
    public WebElement logo;

    /** element 'ContactUS' on pages.Header*/
    public WebElement contactUS;
    /**
     * Default constructor
     */
    public LogCont() {
        logo = driver.findElement(By.cssSelector("h1>a>img"));
        contactUs = driver.findElement(By.cssSelector("#contact-link"));
    }

    /** method opens homePage */
    public void clickLogo() {
        logo.click();
    }

    /** method opens Contact Us form*/
    public void clickContactUS() {
        contactUS.click();
    }
}