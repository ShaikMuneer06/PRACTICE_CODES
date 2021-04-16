package com;
//IO
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Book implements Externalizable{
	String name;
	int pages;
	

	public Book() {
		System.out.println("yes");
	}

	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	@Override
	public void readExternal(ObjectInput i) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String) i.readObject();
		pages = i.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput o) throws IOException {
		// TODO Auto-generated method stub
		o.writeObject(name);
		o.writeInt(pages);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	
	
}
public class External {

	public static void main(String[] args) {
		Book b = new Book("Wings of fire",390);
		String file = "library.txt";
		try{
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(f);
			out.writeObject(b);
			out.flush();
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		Book n = null;
		try{
			FileInputStream f = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(f);
			n  = (Book)in.readObject();
			System.out.println(n);
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}

}
