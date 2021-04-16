package com;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Itr4 {

	public static void main(String[] args) {
		Map<Integer,String> m = new TreeMap();
		m.put(1, "Deepya");
		m.put(2, "Likith");
		m.put(3, "Muneer");
		m.put(4, "Tresa");
		m.put(5, "Tarun");
		System.out.println(m);
		Iterator<Map.Entry<Integer,String>> it = m.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer,String> ent = it.next();
			System.out.println(ent.getKey()+"   "+ent.getValue());
			if(ent.getKey()>3){
				it.remove();
			}
		}
		System.out.println(m);

	}

}
