package awt;

import java.awt.*;

public class Fl {

	Fl() {
		Frame ff = new Frame("FlowLayout");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,10,20);
		ff.setLayout(fl);
		ff.add(b1);
		ff.add(b2);
		ff.add(b3);
		ff.add(b4);
		ff.setSize(300,300);
		ff.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		Fl obj = new Fl();
		
	}
	
}
