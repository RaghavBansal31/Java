import java.util.Scanner;

class prime{

  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int div = 2;
    boolean isPrime;

    isPrime = true;

    if(n==2)
    isPrime =true;

    while(div<n-1)
    {
      if(n%div==0)
      {
        isPrime =false;
        System.out.println(n+" is not prime");
        return;

      }
      div=div+1;
    }
      System.out.println(n+" is prime");


    //
    // if(isPrime==true)
    // System.out.println(n+" is prime");
    // else
    // System.out.println(n+" is not prime");



  }
}
