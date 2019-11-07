package pages.Main;


import pages.Search.Product;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class PopularProducts {
    /**
     * List with product items, uses class pages.Product from package pages.Search (it`s the same class we use in main page)
     */
    List <Product> popularProducts = new ArrayList<Product>();

    private WebElement allProducts;

    /**
     * Default constructor
     */
    public PopularProducts() {
        initPopularProducts();
    }

    /**
     * method to create list of products
     */

    public void initPopularProducts () {
        for (int i = 0; i < popularProducts.size(); i++) {
            popularProducts.add(i, new Product());
        }
    }





}