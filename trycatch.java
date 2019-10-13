class pix
{
public static void main(String arg[])
{
int arr[]=new int[5];
int a,b,c;
a=10;
b=0;

try
{
c=a/b;
System.out.print("Reult="+c);
}

catch(ArithmeticException e)
{
System.out.print("Division");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.print("Array error");
}

}
}