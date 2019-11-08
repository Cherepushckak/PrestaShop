package main.java.pages.Common;

import main.java.pages.Header.Header;
import main.java.pages.Header.HeaderFull;

/**
 *
 */
public abstract class APageParent {

    protected HeaderFull headerFull;
    protected Header header;
    /**
     * Default constructor
     */
    public APageParent() {
    }

    /**
     * Юзайте той метод створення  хедера який вам потрібен
     */

    //Create pages.Header Simple
    public void createHeaderSimple(){
        this.header = new Header();
    }

    //Create pages.Header Full
    public void createHeader(){
        this.headerFull = new HeaderFull();
    }











}