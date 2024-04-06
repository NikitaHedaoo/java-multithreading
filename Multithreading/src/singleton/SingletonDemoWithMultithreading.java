package singleton;

public class SingletonDemoWithMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t1 = new Thread(new Runnable(){
			
			public void run() {
				Singleton object1 = Singleton.getSingletonInstance();
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
			
				Singleton object2 = Singleton.getSingletonInstance();
			}
		});
		
		t1.start();
		t2.start();
	}

}
//The current implementation of Singleton fails when multiple threads call getSingletonInstance()method of
//Singleton class