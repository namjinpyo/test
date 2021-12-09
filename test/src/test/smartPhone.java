package test;
public class smartPhone {
  // 변수(Variable)
  String color;  // 색상
  boolean power; // 전원 상태 (on/off)
  int volume;    // 볼륨

  smartPhone() { } // 생성자(Constructor)
  
  // 메서드(Method)
  void setColor(String set_color) { // 색상 설정
    color = set_color;
  }

  String getColor() { // 색상 가져오기
    return color;
  }
  
  void power() { // 전원 on/off
    power = !power;
  }
  
  void volumeUP() { // 볼륨 높이기
    ++volume;
  }
  
  void volumeDown() { // 볼륨 낮추기
    --volume;
  }
}
