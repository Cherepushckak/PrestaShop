package Common;

import org.openqa.selenium.chrome.ChromeDriver;
import Header.*;
/**
 *
 */
public abstract class APageParent {

    protected final String startURL = "http://3.124.147.74/";  //Default URL for site
    protected ChromeDriver driver;
    protected HeaderFull headerFull;
    protected Header header;
    /**
     * Default constructor
     */
    public APageParent() {
        driver = new ChromeDriver();
    }

    /**
     * Юзайте той метод створення  хедера який вам потрібен
     */

    //Create Header Simple
    public void createHeaderSimple(){
        this.header = new Header();
    }

    //Create Header Full
    public void createHeader(){
        this.headerFull = new HeaderFull();
    }











}