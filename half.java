import java.util.Scanner;
public class half {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int n1 = n+1;
        int n2 = n;
        int g=0;

        for(int a=1;a<=n1;a++)
        {
          for(int b=0;b<2*a-1;b++)
          {
            if(b==0||b==2*a-2)
            System.out.print("*");
            else if(b<2*a-1)
            System.out.print("1");

          }
          for(int c = 1;c<=n1-2*(a-1);c++)
          {
            System.out.print(" ");
          }
          System.out.println();
        }

        for(int a=n2;a>0;a--)
        {
          for(int b=0;b<2*a-1;b++)
          {
            if(b==0||b==2*a-2)
            System.out.print("*");
            else if(b<2*a-1)
            System.out.print("1");
          }
          g=g+2;
          for(int c = 1;c<=g;c++)
          {
            System.out.print(" ");
          }
          System.out.println();
        }

    }
}
