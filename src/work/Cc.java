package work;
import java.awt.*;
import java.awt.event.*;
class Cc extends Frame implements ActionListener
{
int ch;
	Double a,b,c;

TextField tf=new TextField(20);
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("+");
Button b5=new Button("=");
Cc()
{
	a=(double)0;
	b=(double)0;
	c=(double)0;

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setLayout(new FlowLayout(FlowLayout.RIGHT));
add(tf);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
setVisible(true);
setSize(400,400);
}
public static void main(String ar[])
{
Cc oo=new Cc();
}
public void actionPerformed(ActionEvent ae)
{

	if(ae.getSource()==b1)
	{
	tf.setText(tf.getText()+"1");
	}
	if(ae.getSource()==b2)
	{
	tf.setText(tf.getText()+"2");
	}
	if(ae.getSource()==b3)
	{
	tf.setText(tf.getText()+"3");
	}
	if(ae.getSource()==b4)
	{
	a=Double.valueOf(tf.getText());
	tf.setText("");
	ch=1;
	}
	if(ae.getSource()==b5)
	{
	b=Double.valueOf(tf.getText());

	switch(ch)
	{
	case 1:
		c=a+b;
		break;
	case 2:
		c=a-b;
		break;
	}
	tf.setText(String.valueOf(c));
	}



}
}


