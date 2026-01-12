package com.callcenter;

public class CallCenterApp {
	
	public static void main(String[] args) {
		
		
		CallCenterManager manager=new CallCenterManager();
		Customer c1=new Customer(1,"Vishal", false);
		Customer c2=new Customer(2,"Vikash", true);
		Customer c3=new Customer(3,"Anuj",false);
		
        manager.recieveCall(c1);
        manager.recieveCall(c2);
        manager.recieveCall(c3);
        manager.recieveCall(c2);
        
        
        System.out.println("\nHandle calls:");
        
        manager.handleCall();
        manager.handleCall();
        
        manager.showCallDetails();
	}

}
