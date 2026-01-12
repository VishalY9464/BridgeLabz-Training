package com.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

public class CallCenterManager {

	//Normal customer 
	Queue<Customer> normalQueue=new LinkedList<>();
	
	//VIP customer
	Queue<Customer> vipQueue= new LinkedList<>();
	
	//Hashmap to count the call
	HashMap<Integer,Integer> callCountMap=new HashMap<>();
	
	//method to recieve call
	void recieveCall(Customer customer) {
		
		if(customer.isVIP) {
			vipQueue.offer(customer);
		}else {
			normalQueue.offer(customer);
		}
		
		
		if(callCountMap.containsKey(customer.id)) {
			int count= callCountMap.get(customer.id);
			callCountMap.put(customer.id, count+1);	
		}else {
			callCountMap.put(customer.id, 1);
		}
		
		System.out.println("Call recieved from: "+ customer.name);
		
	}
	
	//method to handle the calls
	void handleCall() {
		if(!vipQueue.isEmpty()) {
			Customer customer = vipQueue.poll();
			System.out.println("Handling VIP customer:"+ customer.name);
		}
		else if(!normalQueue.isEmpty()) {
			Customer customer= normalQueue.poll();
			System.out.println("Handling Normal customer: "+ customer.name);
		}
		else {
			System.out.println("No call handles");
		}
	}
	
	//method to show call detail
	void showCallDetails() {
		System.out.println("\n Customer call count:");
		
		for(Entry<Integer, Integer> entry:callCountMap.entrySet()) {
			System.out.println("Customer Id:"+entry.getKey()+" Called "+ entry.getValue()+" times");
		}
	}
	
	
}
