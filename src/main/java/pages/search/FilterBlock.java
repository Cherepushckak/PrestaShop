package main.java.pages.search;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;

/**
 * 
 */
public class FilterBlock {

    private String blockName;
    private ArrayList<WebElement> checkBoxes;

    /**
     * Default constructor
     */
    public FilterBlock(String blockName) {
        setBlockName(blockName);
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public void addCheckBox(WebElement checkBox) {
        checkBoxes.add(checkBox);
    }
}