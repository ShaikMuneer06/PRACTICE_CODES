package com;
//IO
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Bus implements Serializable{
	int i;
	int j;
	public Bus(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
}
public class Deser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "abc.txt";
		Bus c = null;
		try{
			FileInputStream i = new FileInputStream(file);
			ObjectInputStream o = new ObjectInputStream(i);
			c = (Bus) o.readObject();
			o.close();
			i.close();
			System.out.println(c.i+""+c.j);	
		}
		catch(Exception e ){
			System.out.println();
		}
	}

}
