package work;
import java.awt.*;
import java.awt.event.*;
class Win extends Frame implements WindowListener
{
TextField tf=new TextField(20);
Panel p=new Panel();
Win()
{
p.add(tf);
add(p);
setSize(400,400);
setVisible(true);
addWindowListener(this);
}
public static void main(String ar[])
{
Win oo=new Win();
}
public void windowOpened(WindowEvent we)
{
tf.setText("Opened");
}
public void windowActivated(WindowEvent we)
{
tf.setText(tf.getText()+"Activated");
}
public void windowDeactivated(WindowEvent we)
{
tf.setText("Deactivated");
}
public void windowIconified(WindowEvent we)
{
tf.setText("Iconified");
}
public void windowDeiconified(WindowEvent we)
{
tf.setText("Deiconified");
}
public void windowClosed(WindowEvent we)
{
tf.setText("Closed");
}
public void windowClosing(WindowEvent we)
{
System.exit(1);
}
}