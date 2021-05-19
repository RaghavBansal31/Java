import java.util.Scanner;
public class inverted {

	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = n;i>0;i--)
        {
            for(int z = 1;z<=i;z++)
            {
                System.out.print(i);
            }
            System.out.println();


        }

	}

}
