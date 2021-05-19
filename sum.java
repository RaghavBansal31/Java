import java.util.Scanner;
public class sum{

	public static void main(String[] args) {
		// Write your code here
    int c=0;
    int d;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(int a = 1;a<=n;a++)
    {
      d=0;
      for(int b=1;b<=a;b++)
      {
        d=d+b;
        System.out.print(b);
        if(b==a)
        System.out.print("=");
        else
        System.out.print("+");

      }
      
      System.out.print(d);
      System.out.println();

    }
	}
}
