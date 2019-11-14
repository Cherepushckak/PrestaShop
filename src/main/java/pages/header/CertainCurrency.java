package main.java.pages.header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import main.java.tools.OurWebDriver;

public class CertainCurrency {
    private WebElement EUR;
    private WebElement UAH;
    private WebElement USD;
    private final By dropDownItemLocator =
            By.xpath("//div[@id='_desktop_currency_selector']//" +
                    "div[@class='currency-selector dropdown js-dropdown open']//a[@class='dropdown-item']/text()");
    private final By EURLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[1]/a");
    private final By UAHLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[2]/a");
    private final By USDLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[3]/a");

    public org.openqa.selenium.WebElement getEur() {
        return EUR;
    }
}
