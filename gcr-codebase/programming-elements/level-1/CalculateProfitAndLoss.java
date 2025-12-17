//Calculate Profit and Loss
public class CalculateProfitAndLoss{
    public static void main(String[]args){
          
       //declare cost price and selling price
       int costPrice=129;
       int sellingPrice=191;
       
       //calculating the profit
        double profit=sellingPrice-costPrice;
        
      //calculating profitpercentage
       double profitPercentage=profit/(costPrice*100);

      System.out.print("The Cost Price is INR "+costPrice+" and the Profit Percentage is "+sellingPrice+"\nThe Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercentage);
  
   }
 }