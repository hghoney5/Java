package work;
import java.awt.*;
import javax.swing.*;
class Ccc extends JFrame
{
Ccc()
{
Color bg = JColorChooser.showDialog(this,
               "Choose background color", Color.white);
getContentPane().setBackground(bg);
setSize(400,400);
setVisible(true);
}
public static void main(String ar[])
{
Ccc oo=new Ccc();
}
}

