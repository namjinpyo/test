public class Calculator1 extends Calculator {
  public void calculator1(int a, char b, int c){
    add(a, c);    // protected�� ���� ��Ű���� ���� ����
    minus(a, c);  // default�� ���� ��Ű���� ���� ����
    calculate(a, b, c); // public�̶� ���� ����
  }
}