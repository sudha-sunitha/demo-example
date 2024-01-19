/**
 * @author Sudha.b@tadigital.com
 */
package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
       
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
        Long noOfElements = productsList.stream()  
                .collect(Collectors.counting()); 
        System.out.println("no of elements"+noOfElements);
       
        List<Float> productPriceList1=productsList.stream()
        		.filter(x->x.price>25000f)
        		.map(x->x.price)
        		.collect(Collectors.toList());
        System.out.println("no of elements whose price is greater that 25000"+productPriceList1);
        
        Float totalprice=productsList.stream()
        		.filter(x->x.price>25000f)
        		.map(x->x.price)
        		.reduce(0.0f,(sum,price)->sum+price);
        System.out.println("total price is "+totalprice);
    }
    }