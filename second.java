import java.util.Scanner;

class second{

  public static void main(String args[])
  {
    System.out.println("Enter the two numbers: ");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int sum = a + b;
    System.out.println("The sum is: "+ sum);
  }
}
