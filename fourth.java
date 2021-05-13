import java.util.Scanner;
class fourth {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char a = str.charAt(0);

        if(a>='a'&&a<='z')
            System.out.println(0);
        else if(a>='A'&&a<='Z')
            System.out.println(1);
        else
            System.out.println(-1);

    }
}
