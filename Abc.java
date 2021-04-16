package com;

public class Abc {
	//METHOD OVERLOADING
public  String pen(String blue,String black){
	System.out.println("pencolour");
	return "pencolor";
} 
public  void pen(String flair,String hauser, String reynolds){
	System.out.println("pencompany");
}
	public static void main(String[] args) {
		Abc a = new Abc();
		a.pen("blue", "black");
		a.pen("flair","hauser","reynolds");
	}

}		



