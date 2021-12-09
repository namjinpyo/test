package test;

public class Outer {
  int outer_a = 10; // 필드
  public void local_test(int x) {
    int local_a = 20;
    class Inner {
      int inner_a;
      public void print() {
        System.out.println("outer 변수 : " + outer_a);
        System.out.println("local 변수 : " + local_a);
        System.out.println("inner 변수 : " + inner_a);
        System.out.println("parameter 변수 : " + x);
      }
    }
    Inner in = new Inner();
    in.inner_a = 30;
    in.print();
  }
}