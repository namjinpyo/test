package test;

public class Car {
    static String className = "Car";    // Ŭ���� ����
    String instanceName;                // �ν��Ͻ� ����

    static void printClassName () {     // Ŭ���� �޼���
        System.out.println(className);
    }

    void setInstanceName(String instanceName) {  // �ν��Ͻ� �޼���
        this.instanceName = instanceName;
    }

    void printInstanceName() {              // �ν��Ͻ� �޼���
        System.out.println(instanceName);
    }
}