package com;

import java.util.*;


public class Example {
public static void main(String[]args){
	TreeSet<Integer> li = new TreeSet<Integer>();
	li.add(1);
	li.add(30);
	li.add(4);
	/*for(Integer i : li){
		System.out.println(i);
	}*/
	Iterator<Integer> it = li.iterator();
	while(it.hasNext()) {
		  System.out.println(it.next());
		}
	
}
}
