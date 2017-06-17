package car;

import java.io.IOException;
import java.io.*;

abstract class Test {
	public abstract void get();
}

class Test1 extends Test{

	@Override
	public void get() {
		
	}
	
}

class Zoo {
	public static String printline() {
		return "Zoo class print";
	}
}

class MyExp extends Exception 
{
	MyExp(String arg)
	{
		super(arg);
	}
}

class Moo extends Zoo {
	
	public static void main(String args[]) throws IOException 
	{
//		System.out.println("This says" + printline());
//		System.out.println("hello");
		int age;
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Enter your age: ");
		age = Integer.valueOf(ds.readLine());
		try {
			if(age<18) {
				throw new MyExp("Less than 18");
			}
			else {
				System.out.println("welcome");
			}
		}
		catch(MyExp m) {
			System.out.println(m.getMessage());
		}
	}
	
	
}