package sleepMethod;

//Thread.sleep causes the current thread to suspend execution for a specified period. 
//This is an efficient means of making processor time available to the other threads 
//of an application or other applications that might be running on a computer system.

class MyThread1 extends Thread{
	
	public void run() {
		for(int i=1; i<=10 ; i++) {
			try{
				Thread.sleep(250);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class TestSleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mT1 = new MyThread1();
		mT1.start();
		MyThread1 mT2 = new MyThread1();
		mT2.start();
		for(int i=1; i<=10 ; i++) {
			try{
				Thread.sleep(250);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

}
