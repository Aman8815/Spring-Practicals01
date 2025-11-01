package com.rays.collaction;

import java.util.Queue;
import java.util.Set;

public class MyBean1 {
	
	private Queue<String> queue;
	private Set<String> set;
   
	
	public MyBean1(Queue<String> queue ,Set<String> set) {
		this.queue = queue;
		this.set = set;
	}
	

	
	 
	public void DisplayData() {
		System.out.println("queue =" +queue);
		System.out.println("SET"+set);
	}

}
