package test;

public class Outer {
  int outer_a = 10; // �ʵ�
  public void local_test(int x) {
    int local_a = 20;
    class Inner {
      int inner_a;
      public void print() {
        System.out.println("outer ���� : " + outer_a);
        System.out.println("local ���� : " + local_a);
        System.out.println("inner ���� : " + inner_a);
        System.out.println("parameter ���� : " + x);
      }
    }
    Inner in = new Inner();
    in.inner_a = 30;
    in.print();
  }
}