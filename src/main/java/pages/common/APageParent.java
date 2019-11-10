package main.java.pages.common;

import main.java.pages.header.Header;
import main.java.pages.header.HeaderFull;

/**
 *
 */
public abstract class APageParent {

    private HeaderFull headerFull;
    private Header header;
    /**
     * Default constructor
     */
    public APageParent() {
    }

    /**
     * Юзайте той метод створення  хедера який вам потрібен
     */

    //Create pages.Header Simple
    public void createHeaderSimple() {
        this.header = new Header();
    }

    //Create pages.Header Full
    public HeaderFull createHeader() {
        return new HeaderFull ();
    }











}