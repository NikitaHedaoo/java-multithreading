package joinMethod;

class MyThread extends Thread{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread mT1 = new MyThread();
		mT1.start();
		mT1.join(); //The join() method is associated with 2 threads
		//main thread which is executing this statement & object of MyThread class calling the join() method
		//Using join() method, the current thread "main" goes into sleep its execution 
		//until the thread whose reference is calling the method completes its execution
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
		
	}

}
