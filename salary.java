import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		// Write your code here
    int basicSalary;
    double totalSalary;
    double hra,da,pf;

   Scanner s = new Scanner(System.in);

   System.out.println("Enter Salary and grade in capital form");
   basicSalary = s.nextInt();
   String str = s.next();
   char grade = str.charAt(0);

   hra = 0.20* basicSalary;
   da = 0.50* basicSalary;
   pf = 0.11* basicSalary;

   if(grade == 'A')
   {
       totalSalary = (basicSalary + hra + da + 1700 - pf);
       System.out.println("The salary is: "+ Math.round(totalSalary));
   }
   else if(grade == 'B')
   {
       totalSalary = (basicSalary + hra + da + 1500 - pf);
       System.out.println("The salary is: "+ Math.round(totalSalary));
   }
   else if(grade>='C'&& grade<='Z')
   {
       totalSalary = (basicSalary + hra + da + 1300 - pf);
       System.out.println("The salary is: "+ Math.round(totalSalary));
   }



	}
}
