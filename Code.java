package com;

import java.util.List;
import java.util.Vector;

public class Code{ 
public static void main(String [] args){
	List<String>li=new Vector<String>();
	li.add("r");
	li.remove("r");
	for(String i : li){
		System.out.println(i);
	}
}
}
