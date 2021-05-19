import java.util.Scanner;
public class odd {

	public static void main(String[] args) {
		// Write your code here
  int a;
  int d;
  int c=1;
  int b=0;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for(a=1;a<n;a++)
    {
      while(b<n)
      {
        if(c%2!=0)
        {
        b=b+1;
        d=c;
        System.out.print(d);
        }

        c=c+1;
      }
      System.out.println();
    }
	}
}
