package com;
interface Do{
	public void Done();
}
interface Boon{
	default void move(){	
	}
}
public class Coding implements Boon,Do{
	public void Done(){
		System.out.println("Free to go");
	}
	public static void main(String args[]){
		Coding d = new Coding();
		d.move();
		d.Done();
	}
	
}
