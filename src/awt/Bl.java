package awt;

import java.awt.*;
public class Bl {

	Bl() {
		Frame ff = new Frame("BorderLayout");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		BorderLayout bl = new BorderLayout(10,10);
		ff.setLayout(bl);
		ff.add(b1, BorderLayout.NORTH);
		ff.add(b2, BorderLayout.SOUTH);
		ff.add(b3, BorderLayout.EAST);
		ff.add(b4, BorderLayout.WEST);
		ff.add(b5, BorderLayout.CENTER);
		ff.setSize(300,300);
		ff.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Bl ob = new Bl();
	}
	
}



