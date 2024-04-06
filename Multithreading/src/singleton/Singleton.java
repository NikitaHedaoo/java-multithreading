package singleton;

public class Singleton {
	
	//private -> so that no other class can directly access 
	//static -> so that only one instance for the class is created
	//null -> lazy initialization so it doesn't get memory allocated unless actually been called
	private static Singleton singletonInstance = null;
	
	//private constructor to ensure instance of the class can't be created using 'new' keyword 
	//from outside this class
	private Singleton() {
		
	}
	
	//public -> to allow access from outside the class
	//static -> to allow access by class name
	//returns an instance of Singleton class, hence return type is Singleton
	public static Singleton getSingletonInstance() {
		
		//check if singletonInstance exists already or is null
		if(singletonInstance==null) {
			singletonInstance = new Singleton(); //create instance only of its null
		}
		return singletonInstance;
	}
	

}
