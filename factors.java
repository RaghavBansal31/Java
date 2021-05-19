import java.util.Scanner;
public class factors {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int div = 2;

        while(div <= n-1)
        {
            if(n % div == 0)
            {
                System.out.println(div);
              }
            div = div + 1;
        }


       //  int n = s.nextInt();
       // // int div = 2;
       //
       // for(int i=2;i<n;i++){
       //     if(n%i == 0){
       //         System.out.print(i+" ");
       //     }
       // }
       // if(n == 2){
       //      System.out.print(n);
       // }
    }
}
