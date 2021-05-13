import java.util.Scanner;
class fifth{


	public static void main(String[] args) {

		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
    int result;
    Scanner s = new Scanner(System.in);

    double S = s.nextDouble();
    double E = s.nextDouble();
    double W = s.nextDouble();

    while(S<=E)
    {
        result = (int)((S - 32) * (0.5556));
        System.out.println(S+" "+result);
        S=S+W;
      }



	}

}
