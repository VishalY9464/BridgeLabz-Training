package com.artify;

public class ArtWork {
	
	//create instance variable
	private String title;
	private String artist;
	private double price;
	protected String licenseType;
	
	//create constructor to initialise variable
	
	ArtWork(String title,String artist, double price){
		this.title=title;
		this.artist=artist;
		this.price=price;
	}
	
	//constructor without preview
	 public ArtWork(String title,String artist, double price, boolean preview) {
		 this(title,artist,price);
		 if(preview) {
			 System.out.println("Preview enabled for artwork:" + title);
		 }
	 }
	 
	 public double getPrice() {
		 return price;
	 }
	 
	 public String getTitle() {
		 return title;
	 }
	
	
	
	//create a display method
	
	public void displayInfo() {
		System.out.println("title: "+this.title);
		System.out.println("artist: "+this.artist);
		System.out.println("price: "+this.price);
		System.out.println("licenseType: "+this.licenseType);

	}

}
