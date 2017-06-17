package work;
import java.awt.*;
import java.applet.*;
//<applet code="MyApp" height=400 width=400></applet>
public class MyApp extends Applet
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