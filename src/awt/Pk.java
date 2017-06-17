package awt;

import java.awt.*;

public class Pk extends Frame {
	Pk() {
		super("Welcome");
		TextField tf = new TextField(20);
		
		TextArea ta = new TextArea(5,20);
		
		Button b1 = new Button("save");
		Button b2 = new Button("close");
		
		Checkbox c = new Checkbox("Car");
		
		Choice ch = new Choice();
		ch.addItem("Sunam");
		ch.addItem("Sangrur");
		ch.addItem("Chandigarh");
		
		List L = new List();
		L.add("One");
		L.add("Two");
		L.add("Three");
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox g1 = new Checkbox("Male",false,cbg);
		Checkbox g2 = new Checkbox("Female",false,cbg);
		
		Font ff = new Font("Arial",Font.BOLD,18);
		
		Label la = new Label("Name of Student");
		
		Color co = new Color(71,177,236);
		
		la.setFont(ff);
		la.setForeground(co);
		
		Panel p = new Panel();
		p.add(la);
		p.add(tf);
		p.add(ta);
		p.add(b1);
		p.add(b2);
		p.add(c);
		p.add(ch);
		L.setFont(ff);
		p.add(L);
		p.add(g1);
		p.add(g2);
		
		add(p);
		setSize(600,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Pk obj = new Pk();
	}
}
