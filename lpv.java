import java.util.Scanner;

class lpv{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    // x ix the local primitive variable

    product ref = new product();
    int b = ref.product(x,x);
    // ref is the local reference variable
    System.out.println("The product is: "+ b);
  }
}
class product{
  int product(int a, int b) // Instance method
  {                // a and b are local primitive variable of product function
    return a*b;
  }
}
