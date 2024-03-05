package creatingThreads;
//As Thread class belongs to java.lang package,there is no need to import anything to use Threads

class MyThread1 extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(currentThread().getName() + " "+i);
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		// instantiating object of Thread class
		MyThread1 myThread1 = new MyThread1();
		MyThread1 myThread2 = new MyThread1();
		
		// In order to execute this thread,start()method should be called
		System.out.println("Name of 1st thread " +myThread1.getName());
		System.out.println("Name of 1st thread " +myThread2.getName());
		myThread1.start();
		myThread2.start();

	}

}
