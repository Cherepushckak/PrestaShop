package main.java.helperInstrument;

import main.java.pages.search.Product;
import main.java.pages.search.Products;

import java.util.ArrayList;

public class SortHelper {

    private Products productsContainer;
    private ArrayList<Product> products = new ArrayList<Product>();

    public SortHelper(){
        productsContainer = new Products();
        products.addAll(productsContainer.getProducts());
    }

    public boolean checkNameSort(boolean asc){
        boolean result=true;

        if (asc) {
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).getNameProductText().charAt(0) < products.get(i - 1).getNameProductText().charAt(0)) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        else{
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).getNameProductText().charAt(0) > products.get(i - 1).getNameProductText().charAt(0)) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }

        return result;
    }

    public boolean checkPriceSort(boolean asc){
        boolean result=true;

        if (asc) {
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).getProductPrice() > products.get(i - 1).getProductPrice()) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        else{
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).getProductPrice() < products.get(i - 1).getProductPrice()) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
