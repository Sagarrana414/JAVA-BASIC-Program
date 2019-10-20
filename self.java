import java.util.Scanner;
class student
{
String n,c;
int r;

void input()
{
Scanner ox=new Scanner(System.in);

System.out.print("\nEnter the name");
          n=ox.next();
System.out.print("\nEnter the class ");
          c=ox.next();
System.out.print("\nEnter the RollNO ");
          r=ox.nextInt();
}
void disp()
{
System.out.print("\nName="+n);
System.out.print("\nClass="+c);
System.out.print("\nRollNo-="+r);
}

}
class marks 
{
int h,e,m;
void input()
{

Scanner ob=new Scanner(System.in);

System.out.print("\n\nEnter the Hindi marks ");
       h=ob.nextInt();

System.out.print("\nEnter the english marks ");
       e=ob.nextInt();

System.out.print("\nEnter the Math marks ");
       m=ob.nextInt();
}
void disp()
{
System.out.print("\nhindi marks="+h);
System.out.print("\neng marks="+e);
System.out.print("\nmath marks="+m);
}

}



class callme
{
public static void main(String arg[])
{
student ox=new student();
marks ob=new marks();
ox.input();
ox.disp();
ob.input();
ob.disp();
}
}



