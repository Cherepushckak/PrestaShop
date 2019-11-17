package main.java.pages.product;

import main.java.pages.common.ParentPage;

/**
 *class that describes product page
 */
public class ProductPage extends ParentPage {

    /**
     * fields
     */
    private ProductInfo productInfo;

    /**
     * Default constructor
     */
    public ProductPage() {
        super();
        initProductPage();
    }

    /**
     * initialisation of fields
     */
    public void initProductPage() {
        productInfo = new ProductInfo();
    }

    /**
     * getters
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }


    //Added by Roman Shamakhin
    public ProductTabs initProductTabs() {
        return new ProductTabs();
    }
    //Added by Roman Shamakhin

}