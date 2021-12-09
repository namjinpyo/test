package test;

public class Calculator {   // Calculator 클래스 정의
  public void calculate(int a, char b, int c) {  // calculate 메서드 정의
    if( b == '+' ) {
      add(a, c);
    } else if ( b == '-' ) {
      minus(a, c);
    } else {
      System.out.println("지원하지 않는 연산자입니다!");
    }
  }

  protected void add(int a, int c) {
    System.out.println(a + c);
  }

  void minus(int a, int c) {
    System.out.println(a - c);
  }
}



