package mutualExclusiveSynchronization;

class MyThread1 implements Runnable{

	MyThread1(){
		
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		
		Table t1= new Table();
		t1.display(5);
	}
	
}
class MyThread2 implements Runnable{

	MyThread2(){
		
		Thread th2 = new Thread(this);
		th2.start();
	}
	@Override
	public void run() {
		
		Table t2= new Table();
		t2.display(6);
	}
	
}

class Table{
	
	void display(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println("Printting " + n + " * " + i + " = " + n*i);
		}
	}
}
public class NeedForSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 mT1 = new MyThread1();
		MyThread2 mT2 = new MyThread2();
	}

}
//Output of above program

//Printting 5 * 1 = 5
//Printting 5 * 2 = 10
//Printting 6 * 1 = 6
//Printting 5 * 3 = 15
//Printting 6 * 2 = 12
//Printting 6 * 3 = 18
//Printting 6 * 4 = 24
//Printting 6 * 5 = 30
//Printting 6 * 6 = 36
//Printting 5 * 4 = 20
//Printting 5 * 5 = 25
//Printting 5 * 6 = 30
//Printting 5 * 7 = 35
//Printting 5 * 8 = 40
//Printting 5 * 9 = 45
//Printting 5 * 10 = 50
//Printting 6 * 7 = 42
//Printting 6 * 8 = 48
//Printting 6 * 9 = 54
//Printting 6 * 10 = 60
