package com;
//METHOD OVERRIDING
class Cd{
	public void specifications(){
		System.out.println("Cd can be writable");
	}
}
class Cds extends Cd{
	public void specifications(){
		System.out.println("Cd can be readable");
	}
}
public class Efg {
	public static void main(String[] args) {
		Cd a = new Cd();
		Cd b = new Cds();
		a.specifications();
		b.specifications();

	}

}
