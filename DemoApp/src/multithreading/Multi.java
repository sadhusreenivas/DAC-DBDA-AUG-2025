package multithreading;
public class Multi extends Thread {
	@Override
	public void run() {
	for(int i=1; i<=25;i=i+2)
		System.out.println(i);
	}

	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
		
		Multi t2 = new Multi();
		t2.start();
		
	}

}
