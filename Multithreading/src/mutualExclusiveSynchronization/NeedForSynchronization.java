package mutualExclusiveSynchronization;

class Counter {
	int count = 0;
	void increment() {
		count++;
	}
}

public class NeedForSynchronization{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		Thread mT1 = new Thread(new Runnable() {
			public void run() {				
				for(int i=0; i<10000; i++)
				c.increment();
			}
		});		
		Thread mT2 = new Thread(new Runnable() {
			public void run() {	
				for(int i=0; i<10000; i++)
				c.increment();
			}
		});
		mT1.start();
		mT2.start();
		mT1.join();
		mT2.join();
		System.out.println("Value of count : "+ c.count);
	}
}
//Output of above program
//Value of count : 19621 (might vary every time it runs)
//Value of count : 13169
