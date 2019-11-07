package Common;

import Header.*;

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

    //Create Header Simple
    public void createHeaderSimple(){
        this.header = new Header();
    }

    //Create Header Full
    public void createHeader(){
        this.headerFull = new HeaderFull();
    }











}