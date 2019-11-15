package main.java.helperinstrument;
import main.java.pages.main.MainPage;
import main.java.pages.product.ProductTabs;
import org.testng.Assert;


public class ProductPageHelper {


    private ProductTabs productTabs;


    public ProductPageHelper() {
        initProductTabs();
    }


    public void initProductTabs() {
        productTabs = new MainPage()
                .getPopularProducts()
                .getProductByPartialName("HUMMINGBIRD PRINTED SWEATER")
                .goToProductPage()
                .initProductTabs();
    }


    public ProductTabs getProductTabs() {
        return productTabs;
    }


}