package singleton;

public class SingletonDemoWithMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t1 = new Thread(new Runnable(){
			
			public void run() {
				SynchronizedSingleton object1 = SynchronizedSingleton.getSynchronizedSingletonInstance();
				System.out.println("Object 1 hashcode : " + object1.hashCode());
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
			
				SynchronizedSingleton object2 = SynchronizedSingleton.getSynchronizedSingletonInstance();
				System.out.println("Object 2 hashcode : " + object2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
//The current implementation of Singleton fails when multiple threads call getSingletonInstance()method of
//Singleton class