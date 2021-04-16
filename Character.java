package io;

import java.io.FileReader;
import java.io.FileWriter;

public class Character {

	public static void main(String[] args) {
		FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("input.txt");
	         out = new FileWriter("output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }
	      catch(Exception e){
	    	  System.out.println(e);
	      }
	      }
	   }

	


