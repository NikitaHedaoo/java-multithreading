package runnableInterface;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("Printing from thread " + Thread.currentThread().getName() +" " +i);
		}
		
	}
	
}
public class ThreadDemoUsingRunnableInterface {

	public static void main(String[] args) {

		MyThread mT1 = new MyThread();
		
		//we cannot invoke start() method by object of MyThread class as it doesn't contain this method
		//nor it is extending the Thread class which contains this method
		
		//mT1.start();// ERROR: the method start() is undefined for the Type MyThread
		
		Thread th = new Thread(mT1);// to invoke start() method we need the obj of type Thread
		//Thread class provides us with a constructor which takes the instance of RUnnable as an argument
		//As runnable is an interface and cant be instantiated so by "instance of RUnnable"
		//we mean instance of the class implementing it(child class)

		th.start();
		//as we have provided the instance of runnable while instantiating thread
		//run() method of our child class overriding the runnable run() method will be called internally from the start() method
	}

}
