/*
<applet code="layout1.class"height="700"width="600">
</applet>
*/

import java.applet.*;
import java.awt.*;

public class layout1 extends Applet
{

public void flow()
{
FlowLayout t=new FlowLayout();
setLayout(t);
setSize(500,400);
add(new Button("One"));
add(new Button("Two"));
add(new Button("Three"));
add(new Button("Four"));
add(new Button("Five"));
}

public void gflow()
{
GridLayout f=new GridLayout(3,2);
setForeground(Color.blue);
setLayout(f);
setSize(300,200);
add(new Button("One"));
add(new Button("Two"));
add(new Button("Three"));
add(new Button("Four"));
add(new Button("Five"));
}

public void gbag()
{
GridBagLayout gridbag=new GridBagLayout();
setLayout(gridbag);
GridBagConstraints c=new GridBagConstraints();
c.gridx=0;
c.gridy=0;
add(new Button("One"),c);
c.gridx=1;
c.gridy=0;

add(new Button("Two"),c);
c.gridx=3;
c.gridy=2;

add(new Button("Three"),c);
}

public void blayout()
{
BorderLayout b=new BorderLayout();
setLayout(b);
setSize(300,400);
setForeground(Color.blue);
add(new Button("Center"),b.CENTER);
add(new Button("EAST"),b.EAST);
add(new Button("WEST"),b.WEST);
add(new Button("SOUTH"),b.SOUTH);
add(new Button("NORTH"),b.NORTH);
}

public void init()
{
gflow();
}


}





