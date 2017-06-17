package work;

import java.io.*;

public class UI {

	public static void main(String args[]) throws IOException
	{
		DataInputStream ds = new DataInputStream(System.in);
		int x,y,z;
		System.out.println("Enter First No. ");
		x = Integer.valueOf(ds.readLine());
		System.out.println("Enter Second No. ");
		y = Integer.valueOf(ds.readLine());
		z = x+y;
		System.out.println("the Sum is: " + z);
	
	}
	
}
