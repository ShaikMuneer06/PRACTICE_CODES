package com;
class Car implements Cloneable 
{ 
    int num; 
    String name; 
    Car(int num, String name) 
    { 
        this.num = num; 
        this.name = name; 
    }
    //Shallow cloning
   /* public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  */
    //Deep Cloning
    public Object clone()throws CloneNotSupportedException{  
		Car c = (Car) super.clone(); 
		return c;
	}       
    } 
public  class Cl {
	public static void main(String [] args) throws CloneNotSupportedException {
		Car c1 = new Car(1, "Auddi"); 
        Car c2 = (Car) c1.clone(); 
        System.out.println(c1.name+""+c1.num);
        System.out.println(c2.name+""+c2.num);
	}
}
