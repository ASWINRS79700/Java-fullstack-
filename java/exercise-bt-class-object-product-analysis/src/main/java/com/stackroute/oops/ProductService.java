package com.stackroute.oops;

import java.util.Arrays;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        for(Product product:ProductRepository.getProducts())
            if(product.productCode==productCode)
                return product.name;


        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        double max=0;
        Product maximum= null;
        for(Product product:ProductRepository.getProducts()) {
            if(product.category .equals (category)){
                if (max < product.getPrice()) {
                    max = product.getPrice();
                    maximum = product;
                }
            }
        }
        return maximum;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        Product arr[]=new Product[8];
        int i=0;
        for(Product product:ProductRepository.getProducts()){
            if(product.category .equals(category)){
                arr[i]=product;
                i++;
            }
        }if(i==0)
            return null;
        else{
            return Arrays.copyOf(arr,i);
        }

    }
}







