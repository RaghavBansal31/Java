import java.util.Scanner;
public class diamond
{
      public static void  main(String[] args)
      {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int n1= (n+1)/2;
        int n2 = n1-1;

          for (int k = 1;k<=n1; k++)
          {
            for (int c = 1;c<=n1-k; c++)
            {
              System.out.print(" ");
            }

            for ( int d = 1; d <=(2*k)-1; d++)
            {
              System.out.print("*");
            }

            System.out.println();
          }


          for (int k =n2;k>0;k--)
          {
            for (int c = 1;c<=n2-k+1;c++)
            {
              System.out.print(" ");
            }

            for (int d = 1;d<=(2*k)-1;d++)
            {
            System.out.print("*");
             }

            System.out.println();
          }
        }

    }
