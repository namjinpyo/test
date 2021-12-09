public class Calculator1 extends Calculator {
  public void calculator1(int a, char b, int c){
    add(a, c);    // protected도 같은 패키지라서 접근 가능
    minus(a, c);  // default는 같은 패키지라서 접근 가능
    calculate(a, b, c); // public이라 접근 가능
  }
}