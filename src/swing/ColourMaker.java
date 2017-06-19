package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ColourMaker implements ChangeListener {

	int rValue=100,gValue=100,bValue=100;
	
	
	// Labels
	JLabel heading = new JLabel("Colour Maker");
	JLabel rLabel = new JLabel("R:");
	JLabel gLabel = new JLabel("G:");
	JLabel bLabel = new JLabel("B:");
	JLabel rValueLabel = new JLabel(String.valueOf(rValue));
	JLabel gValueLabel = new JLabel(String.valueOf(gValue));
	JLabel bValueLabel = new JLabel(String.valueOf(bValue));
	Label showColor = new Label();
	
	// RGB Sliders
	JSlider rSlider = new JSlider(0,255,100);
	JSlider gSlider = new JSlider(0,255,100);
	JSlider bSlider = new JSlider(0,255,100);
	
	// Panel
	Panel p = new Panel();
	
	public ColourMaker() {
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
		rSlider.setBounds(x+240,y+s+5,w,h);
		gSlider.setBounds(x+240,y+(2*s)+5,w,h);
		bSlider.setBounds(x+240,y+(3*s)+5,w,h);
		rValueLabel.setBounds(x+400,y+s,w-120,h);
		gValueLabel.setBounds(x+400,y+(2*s),w-120,h);
		bValueLabel.setBounds(x+400,y+(3*s),w-120,h);
		
		// Adding Change listeners
		rSlider.addChangeListener(this);
		gSlider.addChangeListener(this);
		bSlider.addChangeListener(this);
		
		// Sliders
		rSlider.setPaintTicks(true);
	    rSlider.setMajorTickSpacing(50);
	    rSlider.setMinorTickSpacing(10);
	    gSlider.setPaintTicks(true);
	    gSlider.setMajorTickSpacing(50);
	    gSlider.setMinorTickSpacing(10);
	    bSlider.setPaintTicks(true);
	    bSlider.setMajorTickSpacing(50);
	    bSlider.setMinorTickSpacing(10);
		
		
		// Adding components to panel
		p.add(showColor);
		p.add(heading);
		p.add(rLabel);
		p.add(gLabel);
		p.add(bLabel);
		p.add(rSlider);
		p.add(gSlider);
		p.add(bSlider);
		p.add(rValueLabel);
		p.add(gValueLabel);
		p.add(bValueLabel);
		
		
		// adding to JFrame
		frame.getContentPane().add(p);
		
		showColor();
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showColor() {
		showColor.setBackground(new Color(rValue,gValue,bValue));
	}
	
	 public void stateChanged(ChangeEvent e) {
		 JSlider slider = (JSlider) e.getSource();
		 if(slider == rSlider)
		 {
			 rValue = rSlider.getValue();
			 rValueLabel.setText(String.valueOf(rValue));
			 showColor();
		 }
		 else if(slider == gSlider)
		 {
			 gValue = gSlider.getValue();
			 gValueLabel.setText(String.valueOf(gValue));
			 showColor();
		 }
		 else if(slider == bSlider)
		 {
			 bValue = bSlider.getValue();
			 bValueLabel.setText(String.valueOf(bValue));
			 showColor();
		 }
	 }

	public static void main(String[] args) {
		ColourMaker cm = new ColourMaker();
	}

}
