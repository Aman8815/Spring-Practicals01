package com.rays.collaction;

import java.util.Queue;
import java.util.Set;

public class MyBean1 {

	private Queue<String> queue;
	private Set<String> set;

	public Queue<String> getQueue() {
		return queue;
	}

	public void setQueue(Queue<String> queue) {
		this.queue = queue;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void DisplayData() {
		System.out.println("queue =" + queue);
		System.out.println("SET" + set);
	}

}
