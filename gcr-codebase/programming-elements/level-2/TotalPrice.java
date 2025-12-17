//Program for Calculate total price of an item

import java.util.Scanner;
public class TotalPrice{
 public static void main(String[]args){
      //declare variable
        double unitPrice;
        int quantity;
        
        Scanner input=new Scanner(System.in);
     // Take unitPrice from user
        unitPrice=input.nextDouble();
     
    //  Take quantity from user
        quantity=input.nextInt();
    
    //  Calculate total price
        double totalPrice= unitPrice*quantity;

    //Display the result
        System.out.print("The total purchase price is INR "+totalPrice+
                         " if the quantity "+unitPrice+ 
                         " and unitprice is INR "+quantity);
       
        input.close();

  }
}