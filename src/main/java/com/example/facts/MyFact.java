package com.example.facts;

public class MyFact<T> {
	
	private T myT;

	public MyFact(){
	}

	public MyFact(T t) {
		this.myT = t;
	}

	public T getMyT() {
		return myT;
	}
}
