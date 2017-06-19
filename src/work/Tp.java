package work;
import java.awt.*;
import javax.swing.*;
class Tp extends JFrame
{
JTabbedPane tp=new JTabbedPane();
Panel p1=new Panel();
Panel p2=new Panel();
Tp()
{
p1.add(new TextField(20));
p1.add(new Label("Personal Tab"));
p2.add(new Label("Official Tab"));
p2.add(new Button("Save"));
tp.addTab("Personal",p1);
tp.addTab("Official",p2);

getContentPane().add(tp);
setSize(400,400);
setVisible(true);
}
public static void main(String ar[])
{
Tp oo=new Tp();
}
}

