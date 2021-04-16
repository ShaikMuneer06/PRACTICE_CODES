package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Itr5 {

	public static void main(String[] args) {
		List<Integer> k = new ArrayList<Integer>();
		for(int i=0;i<11;i++){
			k.add(i);
		}
		System.out.println(k);
		ListIterator l = k.listIterator();
		while(l.hasNext()){
			int i = (int) l.next();
			System.out.println(i);
			if(i>5){
				l.set(6);
				l.add(5);
			}
		}
		System.out.println(k);
		while(l.hasPrevious()){
			int j = (int) l.previous();
			System.out.println(j);
		}
		}

}
