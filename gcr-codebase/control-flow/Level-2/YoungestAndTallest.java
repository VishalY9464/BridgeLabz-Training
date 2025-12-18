// program to find youngest and tallest among Amar, Akbar and Anthony

import java.util.Scanner;

public class YoungestAndTallest{
   public static void main(String[]args){
       
       //Initialize variables
         int amarAge, akbarAge, anthonyAge;
         double amarHeight, akbarHeight, anthonyHeight;
       
         Scanner input=new Scanner(System.in);
         
      // Take age input
         amarAge=input.nextInt();
         akbarAge=input.nextInt();
         anthonyAge=input.nextInt();
         
      // Take height input
         amarHeight=input.nextDouble();
         akbarHeight=input.nextDouble();
         anthonyHeight=input.nextDouble();
         
      // find youngest
         if(amarAge<=akbarAge && amarAge<=anthonyAge){
             System.out.println("Amar is the youngest");
         }
         else if(akbarAge<=amarAge && akbarAge<=anthonyAge){
             System.out.println("Akbar is the youngest");
         }else{
             System.out.println("Anthony is the youngest");
         }
         
      // find tallest
         if(amarHeight>=akbarHeight && amarHeight>=anthonyHeight){
             System.out.println("Amar is the tallest");
         } 
         else if(akbarHeight>=amarHeight && akbarHeight>=anthonyHeight){
             System.out.println("Akbar is the tallest");
         }else{
             System.out.println("Anthony is the tallest");
         }
         //close the scanner
         input.close();
  }
}
