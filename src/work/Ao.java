package work;

import java.awt.*;
class Ao extends Frame
{
Button b[]=new Button[13];
Ao()
{
for(int x=0;x<13;x++)
b[x]=new Button(String.valueOf(x+1));
setLayout(new GridLayout(3,3));
for(int x=0;x<13;x++)
add(b[x]);
setSize(400,400);
setVisible(true);
}
public static void main(String arg[])
{
Ao obj=new Ao();
}
}
