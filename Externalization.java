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

public class Externalization implements Externalizable{

	 

    int gears;
    String car;
   
public Externalization() {
		super();
		// TODO Auto-generated constructor stub
	}

public Externalization (int gears, String car){
   this.gears = gears;
   this.car = car;
}

  @Override
public String toString() {
   return "Externalization [gears=" + gears + ", car=" + car + "]";
}
@Override
public void readExternal(ObjectInput in ) throws IOException, ClassNotFoundException{
      gears = in.readInt();
      car = (String) in.readObject();
  }
@Override
     public void writeExternal(ObjectOutput out) throws IOException{
        out.writeInt(gears);
        out.writeObject(car);
     }
public static void main(String[] args)  {
       Externalization ex = new Externalization(5, "Honda");
       try{
     FileOutputStream fos = new FileOutputStream("tarun.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(ex);
       }
       catch(Exception e){
    	   System.out.println(e);
       }
            try{
      FileInputStream fis = new FileInputStream("tarun.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
       Externalization exe = (Externalization)ois.readObject();
       System.out.println(exe);
            }
            catch(Exception e){
            	System.out.println(e);
            }
     }
}
