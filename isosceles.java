import java.util.Scanner;
public class isosceles {

	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1;i<=n;i++)
        {
            for(int spaces = 1;spaces<=n-i;spaces++)
            {
                System.out.print(" ");
            }

            for(int z = 1;z<=i;z++)
            {
              System.out.print("*");
            }

            for(int j=1;j<i;j++)
            {
              System.out.print("*");
            }

            System.out.println();


        }

	}

}
