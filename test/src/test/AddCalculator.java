package test;

public class AddCalculator {
  int a;
  int b;
  // 생성자 : a와 b의 값을 초기화
  public AddCalculator (int pa, int pb) {
    a = pa;
    b = pb;
  }
  
  public void add() {
    System.out.println(a + b);
  }
}
