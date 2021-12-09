package test;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Car myCar = new Car();                      // 객체의 선언 및 생성

	    Car.printClassName();                         // 클래스 메서드 호출
        myCar.setInstanceName("My 두번째 Car");    // 인스턴스 메서드 호출
        myCar.printInstanceName();                   // 인스턴스 메서드 호출
        Circle circ = new Circle(30, 40);
	}

}
