package exception;

public class Code3 {

	public static void main(String[] args) {
		int v[] = new int[5];
		try{
			
			System.out.println(v[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			 v[0] = 10;
			 System.out.println(v[0]);
			 System.out.println("FINNALY BLOCK HAS EXECUTED");
		}
		

	}

}
