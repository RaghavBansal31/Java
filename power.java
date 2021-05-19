import java.util.Scanner;
public class power {

    public static void main(String[] args) {
        // Write your code here
        int i = 1;
        int a= 1;

        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int n= s.nextInt();


        if(x==0&&n==0)
        {
            System.out.println(1);
          }
        else
        {

            while( i <= n )
            {
                a = x * a;
                i++;
            }
        System.out.println(a);
      }
    }
}
