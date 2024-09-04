
package javaapp_victorillo;
 
import java.util.Scanner;

public class Sales {
    public void getSales(){
     Scanner input = new Scanner(System.in);
        
        String name_customer,product_name;
        float price,cash;
        int qty;
        System.out.print("Enter Customer Name: ");
        name_customer = input.nextLine();
        System.out.print("Enter Product Name: ");
        product_name = input.nextLine();
        System.out.print("Enter Quantity: ");
        qty = input.nextInt();
        System.out.print("Enter Price: ");
        price = input.nextFloat();
        System.out.print("Enter Cash: ");
        cash = input.nextFloat();
        
        System.out.println("----------------------");
        System.out.println("RECEIPT: ");
        System.out.println("----------------------");
        
        System.out.println("Name: "+name_customer);
        System.out.println("Item Name: "+product_name);
        System.out.println("Quantity: "+qty);
        System.out.println("----------------------");
        System.out.println("Total Due: "+(qty*price));
        System.out.println("Cash: "+cash);
        System.out.println("----------------------");
        System.out.println("Change: "+(cash-(qty-price)));
             
        
     }
    
}
    

