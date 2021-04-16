package inner;
class Outs{
	public void output(){
		class Ins{
			public void inner(){
				System.out.println("YOU ARE IN AN METHOD LOCAL INNER CLASS");
			}
		}
		Ins i = new Ins();
		i.inner();
	}
}
public class Method_Local {
public static void main(String[]args){
	Outs o = new Outs();
	o.output();
}
}
