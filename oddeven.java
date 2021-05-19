import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		// Write your code here
     Scanner s = new Scanner(System.in);
        int odd=0,even=0;
        int a,b=0,c=0;

        int n = s.nextInt();
        int length = (int)(Math.log10(n)+1);
        // System.out.println(length);

        while(n>0)
        {
          a = n % 10;
          if(a%2==0)
          {
            b=b+a;

          }
          else
          {
            c=c+a;
          }
          n=n/10;
        }
        System.out.println("The even sum is: "+ b);
        System.out.println("The odd sum is: "+ c);

	}
}
