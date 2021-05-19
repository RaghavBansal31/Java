import java.util.Scanner;
public class alphabetpattern3 {
	public static void main(String[] args) {
		//Your code goes here

                  char a;
                Scanner s = new Scanner(System.in);
                             int n = s.nextInt();

                            for(int i=n;i>0;i--)
                            {

                                for(int j=i;j<=n;j++)
                                {
                                    a = (char)(64+j);
                                    System.out.print(a);
                                }
                                System.out.println();
                            }
	}
}
