import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b;
        int c=1;
        for(int i = 1;i<=n;i++)
        {
            for(int spaces = 1;spaces<=n-i;spaces++)
            {
                System.out.print(" ");
            }
            b=a;
            for(int z = 1;z<=i;z++)
            {

              System.out.print(b);
              b=b+1;

            }
            a=a+1;
            c=b-2;
            for(int j=1;j<i;j++)
            {

              System.out.print(c);
               c=c-1;
            }

            System.out.println();


        }

	}

}
