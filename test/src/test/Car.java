package test;

public class Car {
    static String className = "Car";    // 클래스 변수
    String instanceName;                // 인스턴스 변수

    static void printClassName () {     // 클래스 메서드
        System.out.println(className);
    }

    void setInstanceName(String instanceName) {  // 인스턴스 메서드
        this.instanceName = instanceName;
    }

    void printInstanceName() {              // 인스턴스 메서드
        System.out.println(instanceName);
    }
}