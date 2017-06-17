package awt;

import java.awt.*;

public class New {

	New() {
		
		Frame frame = new Frame("New Frame");
		
		Panel p1 = new Panel();
		p1.setBounds(100, 100, 400, 400);
		p1.setBackground(Color.darkGray);
		Button b1 = new Button("Save");
		b1.setBounds(00,450,50,50);
		p1.add(b1);
		
		frame.add(p1);
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		New obj = new New();
	}
	
}
