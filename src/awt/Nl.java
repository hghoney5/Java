package awt;

import java.awt.*;

public class Nl {
	
	Nl() {
		Frame ff = new Frame("Null Layout");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		ff.setLayout(null);
		b1.setBounds(100,100,80,30);
		b2.setBounds(100,200,80,30);
		b3.setBounds(200,100,80,30);
		b4.setBounds(200,200,80,30);
		ff.add(b1);
		ff.add(b2);
		ff.add(b3);
		ff.add(b4);
		ff.setSize(300,300);
		ff.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Nl obj = new Nl();
		
	}
	
}
