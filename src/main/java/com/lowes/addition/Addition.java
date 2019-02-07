package com.lowes.addition;

public class Addition {
	
	private int a,b;
	
	public Addition(int x,int y) {
		this.a=x;
		this.b=y;
	}
	
	public int add() {
		return this.a+this.b;
	}
	
	public int add(int x,int y) {
		return x+y;
	}

}
