import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i< 11;i++)
        {
            System.out.println(n*i);
        }


	}
}
