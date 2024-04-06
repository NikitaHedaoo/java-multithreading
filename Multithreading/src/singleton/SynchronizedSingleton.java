package singleton;

public class SynchronizedSingleton {
	
	private static SynchronizedSingleton synchronizedSingletonInstance = null;
	
	private SynchronizedSingleton() {
	
		System.out.println("INSTANCE CREATED ! ");
	}
	
	public static synchronized SynchronizedSingleton getSynchronizedSingletonInstance() {
		
		if(synchronizedSingletonInstance==null) {
			synchronizedSingletonInstance = new SynchronizedSingleton();
		}
		
		return synchronizedSingletonInstance;
	}

}
