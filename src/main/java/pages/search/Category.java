package main.java.pages.search;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Category {

    private WebElement self;
    private String categoryName;
    private ArrayList<WebElement> subCategory;
    private WebElement collapse;
    private boolean isCollapsed;

    public Category(WebElement self){
    }

    private void initCategory(WebElement self) {
        this.self = self;
        categoryName = self.getText();
        isCollapsed = false;
    }

    /*
     * Add sub category to list
     */
    public void addSubCategory(WebElement subCategory){
        this.subCategory.add(subCategory);
    }

    public void setCollapse(WebElement collapse){
        this.collapse = collapse;
    }

    public SearchPage clickCategory(){
        self.click();
        return new SearchPage();
    }

    public SearchPage clickSubCategory(int index){
        subCategory.get(index).click();
        return new SearchPage();
    }

}
