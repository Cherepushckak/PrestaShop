package pages.Header;

/**
 *
 */
public class Language {

    private WebElement english;
    private WebElement ukrainian;
    /**
     * Default constructor
     */
    public Language() {
        //english = driver.find...
        //ukrainian = driver.find...
    }

    public void clickEnglish () {
        english.click();
    }

    public void clickUkrainian () {
        ukrainian.click();
    }
}