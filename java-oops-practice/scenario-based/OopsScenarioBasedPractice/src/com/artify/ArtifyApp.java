package com.artify;

public class ArtifyApp {
	public static void main(String[] args) {
		
		User user1=new User("Vikash",4000);
		User user2=new User("Anuj",5000);
		

        IPurchasable digitalArt =
                new DigitalArt("AI Sunset", "anupam", 1500);

        IPurchasable printArt =
                new PrintArt("Nature Sketch", "vishal", 2000);
        
        digitalArt.purchase(user1);
        
        System.out.println("------------------------------");
        
        printArt.purchase(user1);
        
        System.out.println("------------------------------");
        
        digitalArt.purchase(user2);
        
        System.out.println("------------------------------");
        
        printArt.purchase(user2);
      
	}

}
