package work;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="Mou" height=400 width=400></applet>
public class Mou extends Applet implements MouseListener,MouseMotionListener
{
String str;
int x,y;
public void paint(Graphics g)
{
g.drawString(str,x,y);
}
public void init()
{
x=y=100;
str="Start";
addMouseListener(this);
addMouseMotionListener(this);
setVisible(true);
}
public void mouseEntered(MouseEvent me)
{
str="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
str="Mouse Exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
str="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
str="Mouse Released";
repaint();
}
public void mouseClicked(MouseEvent me)
{
str="Mouse Clicked";
repaint();
}
//Mouse Motion Listener
public void mouseMoved(MouseEvent me)
{
str=String.valueOf(me.getX())+"-"+String.valueOf(me.getY());
repaint();
}
public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
repaint();
}

}