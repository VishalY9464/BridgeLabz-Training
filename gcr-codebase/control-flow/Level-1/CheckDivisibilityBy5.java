//program to check if a number is divisible by 5

import java.util.Scanner;

public class CheckDivisibilityBy5{
 public static void main(String[]args){
     
      //initialise variable
        int number;
        Scanner input=new Scanner(System.in);
        
      //Take Input from users
        System.out.print("Enter Number:");
        number=input.nextInt();

      //check number divisible by 5 or not

        if(number%5==0){
              System.out.println("Is the number "+number+" divisible by 5? Yes");
           }else{
              System.out.println("Is the number "+number+" divisible by 5? No");
                }
      //Closing the scanner stream
        input.close();

   }
}