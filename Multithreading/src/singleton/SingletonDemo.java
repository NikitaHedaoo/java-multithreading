package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton object1 = Singleton.getSingletonInstance();
		System.out.println("Object 1 hashcode : " + object1.hashCode());
		Singleton object2 = Singleton.getSingletonInstance();
		System.out.println("Object 2 hashcode : " + object2.hashCode());
		Singleton object3 = Singleton.getSingletonInstance();
		System.out.println("Object 3 hashcode : " + object3.hashCode());
	}

}
