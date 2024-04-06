package singleton;

public class SingletonUsingDoubleCheckedLockingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				
				SingletonUsingDoubleCheckedLocking object1 = SingletonUsingDoubleCheckedLocking.getSynchronizedSingletonInstance();
				System.out.println("Object1 hashcode : "+ object1.hashCode());
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			public void run(){
				SingletonUsingDoubleCheckedLocking object2 = SingletonUsingDoubleCheckedLocking.getSynchronizedSingletonInstance();
				System.out.println("Object2 hashcode : "+ object2.hashCode());
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
