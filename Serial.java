package com;
//IO
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cab implements Serializable{
	int no;
	int code;

	public Cab(int no, int code) {
		this.no = no;
		this.code = code;
	}
	
}
public class Serial{
	public static void main(String [] args){
		Cab c = new Cab(1,1);
		String file = "abc.txt";
		try{
			FileOutputStream f = new FileOutputStream(file);
ObjectOutputStream out = new ObjectOutputStream(f); 
out.writeObject(c); 
out.close(); 
f.close(); 
System.out.println("Object has been serialized\n"
       + "Data before Deserialization."); 
		}
		catch(Exception e){
			System.out.println("x");
		}
		c = null;
		try{
			FileInputStream i = new FileInputStream(file);
			ObjectInputStream o = new ObjectInputStream(i);
			c = (Cab) o.readObject();
			o.close();
			i.close();
			System.out.println(c.code+""+c.no);	
		}
		catch(Exception e){
			System.out.println("e");
		}
	}
}