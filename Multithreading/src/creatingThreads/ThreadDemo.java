package creatingThreads;
//As Thread class belongs to java.lang package,there is no need to import anything to use Threads

 class MyThread1 extends Thread{
	
	 public void run() {
		 System.out.println("MyThread1 is running");
	 }
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 newThread = new MyThread1(); //instantiating object of Thread class
		//In order to execute this thread,start()method should be called
		
		newThread.start();
		
	}

}
