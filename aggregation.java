import java.util.Scanner;

class customer{
  String name;
  int number;
  int money;

  void setinfo(String name, int number, int money)
  {
    this.name = name;
    this.number = number;
    this.money = money;
  }
}

class type{
  String type;
  String branch;

  void typeinfo(String type, String branch)
  {
    this.type = type;
    this.branch = branch;
  }
}

class bank{
  public static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);

    customer c = new customer();
    c.setinfo.name = s.nextLine();
    c.setinfo.number = s.nextInt();
    c.setinfo.money = s.nextInt();

    type t = new type();
    t.typeinfo.type =s.nextLine();
    t.typeinfo.branch =s.nextLine();

    bank b = new bank();
    System.out.println(b.c.setinfo.name);
    System.out.println(b.c.setinfo.number);
    System.out.println(b.c.setinfo.money);

    System.out.println(b.t.typeinfo.type);
    System.out.println(b.t.typeinfo.branch);


  }
}
