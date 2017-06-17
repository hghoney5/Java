package awt;

import java.awt.*;

public class Gl {
	
	Gl() {
		Frame ff = new Frame("GridLayout");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		GridLayout gl= new GridLayout(2,3);
		ff.setLayout(gl);
		ff.add(b1);
		ff.add(b2);
		ff.add(b3);
		ff.add(b4);
		ff.add(b5);
		ff.add(b6);
		ff.setSize(300,300);
		ff.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Gl obj = new Gl();
		
	}
}
