package mt;
public class Multi1 implements Runnable{
	public void run() {
		try{
		System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++){
			Thread t1 = new Thread(new Multi1());
			t1.start();
		}

	}

	
}
