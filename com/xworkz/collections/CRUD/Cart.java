package com.xworkz.collections.CRUD;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart{
    int id;
    double subtotal;
    double gst;
    int discountPercent;
    double total;
    ArrayList<Item> itemList = new ArrayList<Item>();
    //Creating
    void addItemToCart(Item item) {  
    	itemList.add(item);
    	subtotal = subtotal + item.price * item.quantity;
 
    }
    //Reading
    void readItemsInCart() throws Exception {  
    	if(itemList.isEmpty()) {
    		throw new Exception("No items in cart");
    	} else {
    		System.out.println("The items in the cart are: ");
    		for(Item i : itemList) {
    			System.out.println("Item Name:" + i.name);
    			System.out.println("Item quantity:" + i.quantity);
    			System.out.println("Item Size:" + i.size);
    			System.out.println("Item price:" + i.price);
    		}
    		
    	}
    }
    //Updating
    void increaseQuantityBy1(Item item) { 
    	Iterator<Item> itr = itemList.iterator();
    	while(itr.hasNext()) {
    		Item i = itr.next();
    		if(item.itemId == i.itemId) {
    			i.quantity += 1;
    		}
    	}
    	
    }
    //deleting
    void deleteItem(Item item) {
    	Iterator<Item> itr = itemList.iterator();
    	while(itr.hasNext()) {
    		Item i = itr.next();
    		if(item.itemId == i.itemId) {
    			itr.remove();
    		}
    	}
    	
    }
    
    
}