package test;
public class smartPhone {
  // ����(Variable)
  String color;  // ����
  boolean power; // ���� ���� (on/off)
  int volume;    // ����

  smartPhone() { } // ������(Constructor)
  
  // �޼���(Method)
  void setColor(String set_color) { // ���� ����
    color = set_color;
  }

  String getColor() { // ���� ��������
    return color;
  }
  
  void power() { // ���� on/off
    power = !power;
  }
  
  void volumeUP() { // ���� ���̱�
    ++volume;
  }
  
  void volumeDown() { // ���� ���߱�
    --volume;
  }
}
