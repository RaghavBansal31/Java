import java.util.Scanner;
public class alphabetpattern2 {

	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
    char a;
                Scanner s = new Scanner(System.in);
                             int n = s.nextInt();

                            for(int i=0;i<n;i++)
                            {

                                for(int j=i;j<((2*i)+1);j++)
                                {
                                    a = (char)(65+j);
                                    System.out.print(a);
                                }
                                System.out.println();
                            }

	}

}
