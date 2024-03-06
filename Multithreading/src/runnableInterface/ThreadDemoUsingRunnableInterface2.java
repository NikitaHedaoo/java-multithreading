package runnableInterface;

class MyThread2 implements Runnable{

	//constructor for MyThread2 which creates an instance of thread
	//and passes Runnable instance(this),followed by start()method call
	//"this" represents the current thread which is an instance of MyThread2 child class of Runnable instance
	MyThread2()
	{
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + " printing " +i);
		}
		
	}
}
public class ThreadDemoUsingRunnableInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 mt2= new MyThread2();//call to the constructor of MyThread2 class
	

}

}
