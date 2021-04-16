package mt;

public class Multi2 implements Runnable {
public void run(){
	try{
		for(int i=0;i<2;i++){
			System.out.println(i);
		}

			
	}
	catch(Exception e){
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		Multi2 m = new Multi2();
		m.run();
		int b = 9;
		for(int j = 0;j<b;j++){
			Thread t1 = new Thread(new Multi2());
			t1.start();
		}
	}

}
