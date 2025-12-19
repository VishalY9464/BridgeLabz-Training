//program to check student can vote depending on their age


import java.util.Scanner;
public class CheckAge{
       public static void main(String[]args){
         
        //declare variables
          int sizeOfArray;
         
        //create scanner object
          Scanner input=new Scanner(System.in);
       
        //take arraySize from user
          System.out.print("\nEnter size of array:");
          sizeOfArray=input.nextInt();
      
       //Create array name as age with size sizeOfArray
          int[]age=new int[sizeOfArray];
        
       //Take input age from user in age
         System.out.print("\nEnter age in array:");
         for(int i=0;i<sizeOfArray;i++){
              age[i]=input.nextInt();
        }
       
       //work on the age array to check age are valid to vote or not
         for(int i=0;i<sizeOfArray;i++){
                //check age negative or not
               if(age[i]<0){
                    System.out.println("Invalid age!!");
               }else{
               //check age can vote or not
        
                if(age[i]>18 || age[i]==18){
                      System.out.println("The student with the age "+ age[i] +" can vote.");   
               }else{
                       System.out.println("The student with the age "+ age[i] +" cannot vote");
                    }
               }    
            }

      }
}