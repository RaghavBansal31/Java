import java.util.Scanner;

class poro2d{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the [n][m] dimesnsions of the array: ");
    int n = s.nextInt();
    int m = s.nextInt();

    PORO AmnRef = new PORO();
    int [][]a =  AmnRef.setval(n,m,s);

    PORO RmnRef = new PORO();
    int [][]b =  RmnRef.setval(n,m,s);

     PORO CmnRef = new PORO();
     int [][]c = CmnRef.party2(a,b,n,m);
     CmnRef.show(c,n,m);

  }
}

class PORO{
  int[][] setval(int n, int m, Scanner s)
  {
    int [][]l = new int[n][m];
    for(int i= 0;i<l.length;i++)
    {
      for(int j = 0;j<l[i].length;j++)
      {
        System.out.print("Enter your value: ");
        l[i][j] = s.nextInt();
      }
    }
    return l;


  }

int [][] party2(int [][]a,int [][]b, int n, int m)
{
  int[][] pitaji = new int[n][m];
  for(int i = 0;i<pitaji.length;i++)
  {
     for(int j =0;j<pitaji[i].length;j++)
     {
       pitaji[i][j]=a[i][j]+b[i][j];
     }
  }
  return pitaji;

}
  void show(int[][]c,int n, int m)
  {

    for(int i = 0;i<c.length;i++)
    {
      for(int j =0;j<c[i].length;j++)
      {
        System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
  }
}
