
import Header.Header;
import Header.HeaderFull;

import java.util.*;

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

    //Create Header Simple
    public Header createHeaderSimple(){
        Header header = new Header();
        return header;
    }

    //Create Header Full
    public HeaderFull createHeader(){
        HeaderFull header = new HeaderFull();
        return header();
    }











}