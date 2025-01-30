package com.driver;

class Product{
  public int product(int x, int y) {}

  public int product(int x, int y, int z) {}

  public double product(double x, double y) {}
}

public class Main {
  Product p=new Product();
  p.product(10,20);
  p.product(10,20,30);
  p.product(5.5, 6.5);
}
