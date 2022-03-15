package dxc.streamexamples.basic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.*;  
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
public class JavaStreamExample2 {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>(); 
        
         
        
        
        productsList.stream()  
        .filter(product -> product.price == 30000)  
        .forEach(product -> System.out.println(product.name));  
        
        
        
        List<String> placesToVisit= new ArrayList<String>();
        placesToVisit.add("Chicago");
        placesToVisit.add("Venice");
        placesToVisit.add("Tokyo");
        placesToVisit.add("San Francisco");
        placesToVisit.add("Kyoto");
        placesToVisit.add("Abu Dhabi");

         
        placesToVisit.stream()  
        .filter(e -> e.startsWith("A"))  
        .forEach(e -> System.out.println(e));  
        
        
        
        
        // Creating a list of Integers
     	List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
     	
     	
     	
     	
     	
     	
     	
     	List<Integer> list2  = 
     			list.stream().map( e -> e*e ).collect(Collectors.toList());
     	
     	
        
        
    }  
    
    

}  