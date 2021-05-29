import java.util.Scanner;

class product{
  int price,qty,qty2;
  void setdate(int a, int b, int c)
  {
    price = a;
    qty =b;
    qty2 =c;
  }

}


class mall{
  product lap = new product();
}

class ipv{
  public static void main(String []args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    product ref = new product();
    mall ref2 = new mall();

    ref.setdate(n,n,n);
    System.out.println(ref.price*ref.qty*ref.qty2);
    ref2.lap.setdate(n,n,n);
    System.out.println(ref2.lap.price*ref2.lap.qty*ref2.lap.qty2);


}
}
