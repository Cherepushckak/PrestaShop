package pages;

import pages.Header.Header;
import pages.Header.HeaderFull;

/**
 * Only for make diagram reading easier.
 */
public abstract class APageParent {

    protected HeaderFull headerFull = new HeaderFull();
    /**
     * Default constructor
     */
    public APageParent() {

    }

    //Create pages.Header Simple
    public Header createHeaderSimple(){
        Header header = new Header();
        return header;
    }

    //Create pages.Header Full
    public HeaderFull createHeader(){
        HeaderFull header = new HeaderFull();
        return header;
    }











}