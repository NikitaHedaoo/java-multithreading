package singleton;

public class SingletonUsingDoubleCheckedLocking {

	private static SingletonUsingDoubleCheckedLocking synchronizedSingletonInstance = null;

	private SingletonUsingDoubleCheckedLocking() {

		System.out.println("INSTANCE CREATED !!");
	}

	public static SingletonUsingDoubleCheckedLocking getSynchronizedSingletonInstance() {

		// using synchronized block instead of synchronized method
		// because in some cases there might be other lines of code that do not need to
		// be synchronized
		if (synchronizedSingletonInstance == null) {

			synchronized (SingletonUsingDoubleCheckedLocking.class) {
				if (synchronizedSingletonInstance == null) {
					synchronizedSingletonInstance = new SingletonUsingDoubleCheckedLocking();
				}
			}
		}
		return synchronizedSingletonInstance;
	}
}
