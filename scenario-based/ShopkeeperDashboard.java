
//program for discount of given by Shopkeeper according to price
import java.util.Scanner;
public class ShopkeeperDashboard{
	
	static double totalAmount=0.0;
	public static void BillGenerator(int[]prices){
		int item=0;
		
		for(int i=0;i<prices.length;i++){
			if(prices[i]>1000){
				double discount=prices[i]*50/100;
				double discountPrice=prices[i]-discount;
				System.out.println("Price Of item: "+prices[i]+"   "+" Discount Price: "+ discountPrice );
				totalAmount+=discountPrice;
				item++;
			}
			else if(prices[i]>500 && prices[i]<1000){
				double discount=prices[i]*25/100;
				double discountPrice=prices[i]-discount;
				System.out.println("Price Of item: "+ prices[i] +"   "+"Discount Price: "+ discountPrice );
				totalAmount+=discountPrice;
				item++;
			}
			else{
			    System.out.println("Price of Item:  "+prices[i] +"   "+" Discount Price:"+ 0);
				totalAmount+=prices[i];
				item++;
			}
		}
		
		System.out.println("Total item:"+ item + "   "+"Total Amount:"+ totalAmount);
		
	}
    public static void main(String[]args){
	    //create scanner object
		Scanner input=new Scanner(System.in);
		
        // take number of item from users
		System.out.println("Enter Number Of Items:");
        int numberOfItems =input.nextInt();
		
		//create an array to store each item along with prices
		int[]price=new int[numberOfItems];
		
		//take input prices from Shopkeeper
		System.out.println("Enter prices of items:");
		for(int i=0;i<price.length;i++){
			System.out.println("Enter item "+ i +": " );
			price[i]=input.nextInt();
		}
		
		//call bill generator method
		BillGenerator(price);
		
	    //close the Scanner class 
		input.close();
	}
}