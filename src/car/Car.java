package car;

import abc.firstClass;

public class Car {
	
	public interface Bounceable {
		
		
		void bounce();
		void setBounceFactor(int bf);
		
	}
	
	public static void main(String[] args){
		firstClass obj = new firstClass();
		System.out.print(obj.getName());
		System.out.print("working");
	}
	
}
