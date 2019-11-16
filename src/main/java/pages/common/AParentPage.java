package main.java.pages.common;

import main.java.pages.header.Header;
import main.java.pages.header.HeaderFull;

public abstract class AParentPage {

    public Header initHeader () {
        return new Header();
    }

    public HeaderFull initHeaderFull () {
        return new HeaderFull();
    }
}
