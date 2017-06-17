package work;
import java.awt.*;
class Gbl extends Frame
{
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("            4                ");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");

Gbl()
{
GridBagLayout gbl=new GridBagLayout();
GridBagConstraints gbc=new GridBagConstraints();
setLayout(gbl);
gbc.fill=GridBagConstraints.BOTH;
gbc.gridheight=1;
gbc.gridwidth=GridBagConstraints.REMAINDER;
gbl.setConstraints(b1,gbc);
add(b1);
gbc.gridwidth=1;
gbl.setConstraints(b2,gbc);
add(b2);
gbc.gridwidth=2;
gbl.setConstraints(b3,gbc);
add(b3);
gbc.gridwidth=GridBagConstraints.REMAINDER;
gbl.setConstraints(b4,gbc);
b8.setLabel("Ram");
add(b4);
gbc.gridwidth=1;
gbl.setConstraints(b5,gbc);
add(b5);
gbc.gridwidth=1;
gbl.setConstraints(b6,gbc);
add(b6);
gbc.gridwidth=1;
gbl.setConstraints(b7,gbc);
add(b7);
gbc.gridwidth=GridBagConstraints.REMAINDER;;
gbl.setConstraints(b8,gbc);
add(b8);


setSize(400,400);
setVisible(true);
}
public static void main(String ar[])
{
Gbl oo=new Gbl();
}
}

