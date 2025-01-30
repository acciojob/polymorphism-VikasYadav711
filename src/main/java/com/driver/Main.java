package com.driver;

class Product{
  public int product(int x, int y) {
    return x+y;
  }

  public int product(int x, int y, int z) {
    return x+y+z;
  }

  public double product(double x, double y) {
    return x+y;
  }
}

public class Main {
  public static void Main(String args[])
  {
  Product p=new Product();
  
  System.out.println(p.product(10,20));
  //System.out.println(p.product(10,20,30));
  //System.out.println(p.product(5.5, 6.5));
}
}
