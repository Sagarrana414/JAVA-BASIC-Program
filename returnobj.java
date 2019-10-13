class pix
 {
   int x;
   pix()
 {
   x=10;
 }

   pix disp()
 {
   pix ob=new pix();
   return ob;
 }

   public static void main(String arg[])
 {
   pix ox=new pix();
   pix om=ox.disp();
   System.out.print(om.x);
 }

 }