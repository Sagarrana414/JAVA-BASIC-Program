class pix
{
void disp()
{
System.out.print("this is sagar");
}

}

class mypix extends pix
{
void disp()
{
super.disp();
System.out.print("\nSoftware engineer ");
}

}

class callme
{
public static void main(String arg[])
{
mypix ob=new mypix();
ob.disp();
}

}

