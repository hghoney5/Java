package work;

class A implements Runnable {
	
	public void run() {
		try {
			for (int a = 1; a<=5; a++) {
				System.out.println("a = "+a);
				Thread.sleep(0);
			}
		}
		catch(Exception e) {
			
		}
	}
	
}

class B implements Runnable {
	
	public void run() {
		try {
			for (int b = 1; b<=5; b++) {
				System.out.println("b = "+b);
				Thread.sleep(0);
			}
		}
		catch(Exception e) {
			
		}
	}
	
}

public class Threading {

	public static void main(String args[]) {
		A obj = new A();
		B obj1 = new B();
		Thread th1 = new Thread(obj);
		Thread th2 = new Thread(obj1);
		th1.setPriority(9);
		th2.setPriority(5);
		th1.start();
		th2.start();
	}
	
}
