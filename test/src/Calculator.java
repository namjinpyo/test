public class Calculator {
  public void calculate(int a, char b, int c){
    if( b == '+' ) {
      add(a, c);
    } else if ( b == '-' ) {
      minus(a, c);
    } else {
      System.out.println("�������� �ʴ� �������Դϴ�!");
    }
  }

  protected void add(int a, int c) {
    System.out.println(a + c);
  }

  void minus(int a, int c) {
    System.out.println(a - c);
  }
}
