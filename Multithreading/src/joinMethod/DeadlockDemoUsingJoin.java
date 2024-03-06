package joinMethod;

class MyThread2 extends Thread{
	
	public void run() {
		
		try {
			System.out.println("This seems to be a deadlock if nothing else is printed on console by " + Thread.currentThread().getName() +" and the program continues running");
			this.join(); //here the thread executing this statement is thread-0
			//and the thread calling join() method is also thread-0
			//hence this statement means thread-0 will be in sleep state until thread-0 completes
			//its execution, hence causing deadlock
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " printed " + i);
		}
	}
}

public class DeadlockDemoUsingJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 mT1 = new MyThread2();
		mT1.start();
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " printed " + i);
		}
	}

}
