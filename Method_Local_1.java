package inner;
class Outer{
	final int n =100;
	public void output(){
		class Ins{
			public void inner(){
				System.out.println(n);
			}
		}
		Ins i = new Ins();
		i.inner();
	}
}
public class Method_Local_1 {
public static void main(String[]args){
	Outer o = new Outer();
	o.output();
}
}
