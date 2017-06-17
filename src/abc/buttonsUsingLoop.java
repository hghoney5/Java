package abc;

import java.awt.*;
import java.awt.event.*;

public class buttonsUsingLoop {
	
	String[] buttons = {"btn0","btn1","btn2","btn3","btn4","btn5","btn6","btn7","btn8","btn9","btnDecimal","btnPlusMinus"};
	
	
	public buttonsUsingLoop() {
		Frame frame = new Frame("Buttons Using Loop");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400,400);
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(5,4));
	}
	
	public static void main(String[] args) {
		new buttonsUsingLoop();
	}
}
