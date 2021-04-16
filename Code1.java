package exception;

public class Code1 {

	public static void main(String[] args) {
		try{int a = 5;
		int b=0;
		int c= a/b;
		System.out.println(c);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
