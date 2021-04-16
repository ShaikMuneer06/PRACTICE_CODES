package mt;

public class Multi3 extends Thread {
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
		Multi3 m = new Multi3();
		m.run();//We can call run method directly
		m.start();//We can call both run and start  at a time
		m.run();// We can call run method more than one time
		m.start();//We cannot call start more than one time
	}

}

