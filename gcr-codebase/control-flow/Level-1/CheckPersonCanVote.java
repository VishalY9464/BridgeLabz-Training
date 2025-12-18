//program to check whether a person can vote

import java.util.Scanner;

public class CheckPersonCanVote{
    public static void main(String[]args){
        //initialize variable
          int age;
        
          Scanner input=new Scanner(System.in);
       //Take input from users
         System.out.print("\nEnter Age:");
         age=input.nextInt();
       
       //Check person can vote or not
         
         if(age>=18){
                System.out.println("The person's age is " + age +" and can vote.");

           } else{
                  System.out.println("The person's age is "+age+" and cannot vote");
                 }   


  }
}
     