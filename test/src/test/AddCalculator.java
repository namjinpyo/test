package test;

public class AddCalculator {
  int a;
  int b;
  // ������ : a�� b�� ���� �ʱ�ȭ
  public AddCalculator (int pa, int pb) {
    a = pa;
    b = pb;
  }
  
  public void add() {
    System.out.println(a + b);
  }
}
