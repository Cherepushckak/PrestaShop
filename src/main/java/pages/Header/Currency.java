package pages.Header;

/**
 * Currency:  EUR, UAH, USD
 */
public class Currency {

    private WebElement EUR;
    private WebElement UAH;
    private WebElement USD;

    /**
     * Default constructor
     */
    public Currency() {
        //EUR = driver.find...
        //UAH = driver.find...
        //USD = driver.find...
    }

    public void clickEUR () {
        EUR.click();
    }

    public void clickUAH () {
        UAH.click();
    }

    public void clickUSD () {
        USD.click();
    }

}