import java.util.Scanner;

public class parallogram {

	public static void main(String[] args) {
		// Write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(int a=1;a<=n;a++)
    {
      for(int b = 0;b<a-1;b++)
      {
      System.out.print(" ");
      }
      for(int c = 1;c<=n;c++)
      {
      System.out.print("*");
      }
      System.out.println();

    }

	}
}
