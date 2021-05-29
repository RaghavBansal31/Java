
import java.util.Scanner;
public class intro{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    product ref = new product();
    int b = ref.area(n,n);
    System.out.println("The area is: "+b);

  }
}
class product{
  int area(int a, int b)
  {
    return a*b;
  }
}
