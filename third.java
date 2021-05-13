import java.util.Scanner;

class third{

  public static void main(String args[])
  {
    System.out.println("Enter the number for it's table: ");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    for(int i=1;i<11;i++)
    {
      System.out.println(a+" * "+i+" = "+(a*i));
    }
    }
  }
