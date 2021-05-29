import java.util.Scanner;

class R{
  int l=4, b=5;
}

class rect{
   public static void main(String []args)
   {
     R r1 = new R();
     R r2 = new R();
     R  r3 = new R();

     System.out.println(r1.equals(r2));
     System.out.println(r2.equals(r3));
     r1 = r2 = r3;
     System.out.println(r1.equals(r2));
     System.out.println(r2.equals(r3));

    System.out.println(r1==r2);
    System.out.println(r3==r2);

    System.out.println(r1.l==r2.l);
    System.out.println(r3.l==r2.l);

   }
}
