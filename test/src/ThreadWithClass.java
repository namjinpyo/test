public class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.
            try {
                Thread.sleep(10);          // 0.01�ʰ� �����带 ����.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
