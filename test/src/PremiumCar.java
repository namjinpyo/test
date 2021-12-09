public class PremiumCar extends Car{
  public String owner = "이순신";
  public void goForward() {
    System.out.println("네비게이션 작동");
    super.goForward();
  }
  public void goBackward() {
    System.out.println("후방 모니터 작동");
    super.goBackward();
  }
}