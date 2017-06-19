package work;
import java.awt.*;
import javax.swing.*;
class Sw extends JFrame
{
JButton b=new JButton("Save");
JTextField tf=new JTextField(20);

Panel p=new Panel();
JRadioButton rb1=new JRadioButton("Male");
JRadioButton rb2=new JRadioButton("Female");
JPasswordField pf=new JPasswordField(20);
ButtonGroup bg=new ButtonGroup();
ImageIcon ico=new ImageIcon("1.jpg");
JLabel ll=new JLabel(ico);
JProgressBar pb=new JProgressBar();
JSlider sl=new JSlider();
JLabel sliderLabel = new JLabel(String.valueOf(sl.getValue()));
JSpinner sp=new JSpinner();
Sw()
{

p.add(b);
p.add(tf);
bg.add(rb1);
bg.add(rb2);
p.add(rb1);
p.add(rb2);
p.add(pf);
//p.add(ll);
pb.setValue(50);
p.add(pb);
p.add(sl);
sp.setValue(20);
p.add(sp);

getContentPane().add(p);
setSize(400,400);
setVisible(true);
}
public static void main(String ar[])
{
Sw oo=new Sw();
}
}

