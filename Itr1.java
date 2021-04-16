package com;

import java.util.Enumeration;
import java.util.Vector;

public class Itr1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector();	
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			int i = (int) e.nextElement();
			System.out.println(i);
		}
		
	}

}
