package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itr2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Muneer");
		l.add("Muneer");
		l.add("Tarun");
		l.add("Tresa");
		l.add("Likith");
		l.add("Deepya");
		l.add("Swathi");
		System.out.println(l);
		Iterator it = l.iterator();
		while(it.hasNext()){
			String i = (String) it.next();
			System.out.println(i);
			if(i.equals("muneer")){
				it.remove();
			}
			
		}
System.out.println(l);
	}

}
