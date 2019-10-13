class pix
{
int x,y,z;
pix(int a,int b)
{
x=a;
y=b;
}
pix(int a)
{

x=a;
y=20;
}

pix()
{
x=10;
y=20;
}

void disp()
{
z=x+y;
System.out.print("\nTotal"+z);
}

public static void main(String arg[])
{
pix ob=new pix(4,5);
pix ot=new pix(5);
pix ox=new pix();
ob.disp();
ot.disp();
ox.disp();
}
}
