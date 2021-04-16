package inner;
class Out{
	class In{
		public void output(){
			System.out.println("YOU ARE IN NESTED INNER CLASS");
		}
	}
}
public class Nested_Inner_Class {

	public static void main(String[] args) {
		Out.In j = new Out().new In();
		j.output();
	}

}
