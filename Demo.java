package com;

import java.util.Map;
import java.util.TreeMap;

public class Demo {
public static void main(String[] args){
    { 
        Map<Integer, String> map = new TreeMap<>(); 
  
        map.put(1,"Auddi"); 
        map.put(2, "Safari");
        map.put(3, "Creta");
        map.put(54, "Piaggio");
        map.put(13, "Tata");
        
  
        for (Map.Entry< Integer,String> e : map.entrySet()) 
            System.out.println(e.getKey() + " "+ e.getValue()); 
    } 

}
}
