package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColourMakerSpinner implements ChangeListener {

	int rValue=100,gValue=100,bValue=100;
	
	
	// Labels
	JLabel heading = new JLabel("Colour Maker");
	JLabel rLabel = new JLabel("R:");
	JLabel gLabel = new JLabel("G:");
	JLabel bLabel = new JLabel("B:");
	Label showColor = new Label();
	
	// RGB Spinners
	SpinnerModel rColor =  
            new SpinnerNumberModel(100, //initial value  
               0, //minimum value  
               255, //maximum value  
               1); //step  
	SpinnerModel gColor = new SpinnerNumberModel(100,0,255,1);
	SpinnerModel bColor = new SpinnerNumberModel(100,0,255,1); 
	JSpinner rSpinner = new JSpinner(rColor);
	JSpinner gSpinner = new JSpinner(gColor);
	JSpinner bSpinner = new JSpinner(bColor);
	
	// Panel
	Panel p = new Panel();
	
	public ColourMakerSpinner() {
		JFrame frame = new JFrame("Colour Maker");
		p.setLayout(null);
		Font fontBold = new Font("Arial",Font.BOLD,20);
		heading.setFont(fontBold);
		
		// Setting Positions
		int x=20,y=10,w=150,h=30,s=50;
		
		heading.setBounds(x+150,y,w+100,h);
		showColor.setBounds(x,y+s,w+50,h+150);
		rLabel.setBounds(x+220,y+s,w-80,h);
		gLabel.setBounds(x+220,y+(2*s),w-80,h);
		bLabel.setBounds(x+220,y+(3*s),w-80,h);
		rSpinner.setBounds(x+240,y+s+5,w,h);
		gSpinner.setBounds(x+240,y+(2*s)+5,w,h);
		bSpinner.setBounds(x+240,y+(3*s)+5,w,h);
		
		// Adding Change listeners
		rSpinner.addChangeListener(this);
		gSpinner.addChangeListener(this);
		bSpinner.addChangeListener(this);
		
		
		
		// Adding components to panel
		p.add(showColor);
		p.add(heading);
		p.add(rLabel);
		p.add(gLabel);
		p.add(bLabel);
		p.add(rSpinner);
		p.add(gSpinner);
		p.add(bSpinner);
		
		
		// adding to JFrame
		frame.getContentPane().add(p);
		
		showColor();
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showColor() {
		showColor.setBackground(new Color(rValue,gValue,bValue));
	}
	
	 public void stateChanged(ChangeEvent e) {
		 JSpinner Spinner = (JSpinner) e.getSource();
		 if(Spinner == rSpinner)
		 {
			 rValue = (int) rSpinner.getValue();
			 showColor();
		 }
		 else if(Spinner == gSpinner)
		 {
			 gValue = (int) gSpinner.getValue();
			 showColor();
		 }
		 else if(Spinner == bSpinner)
		 {
			 bValue = (int) bSpinner.getValue();
			 showColor();
		 }
	 }

	public static void main(String[] args) {
		ColourMakerSpinner cm = new ColourMakerSpinner();
	}

}
