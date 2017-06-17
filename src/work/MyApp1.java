package work;
import java.awt.*;
import java.applet.*;
public class MyApp1 extends Applet
{
TextField tf=new TextField(20);
Button b=new Button("Click Me");
Panel p=new Panel();
public void init()
{
p.add(tf);
p.add(b);
add(p);
setVisible(true);
}
}