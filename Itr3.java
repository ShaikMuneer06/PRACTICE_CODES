package com;

import java.util.HashSet;
import java.util.Iterator;

public class Itr3 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<10;i++){
			h.add(i);
		}
       System.out.println(h);
       Iterator it = h.iterator();
       while(it.hasNext()){
    	   int i = (int) it.next();
    	   System.out.println(i);
    	   if(i<5){
    		   it.remove();
    	   }
       }
       System.out.println(h);
	}

}
