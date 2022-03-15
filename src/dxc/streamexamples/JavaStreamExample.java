package dxc.streamexamples;

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
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>(); 
        
        
        
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price > 30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        
        
        System.out.println(productPriceList);   // displaying data  
        
        
        
        List<Float> productPriceList2 =productsList.stream()  
        		.filter((p -> p.name.indexOf("Laptop" ) >= 0))
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
        
        System.out.println(productPriceList2);  


        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
          .stream()
          .reduce(0, (subtotal, element) -> 
          {
        	  System.out.println(subtotal);  
        	  return subtotal + element;
        	  
          });
        
        System.out.println(result);  

       
        
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
        
        System.out.println(result);  

        
    }  
    
    

}  