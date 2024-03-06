package sleepMethod;

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
