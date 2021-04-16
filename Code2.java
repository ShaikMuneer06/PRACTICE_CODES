package exception;

public class Code2 {

	public static void main(String[] args) {
		try{
			int v[] = new int[5];
			System.out.println(v[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
