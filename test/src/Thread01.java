public class Thread01 {
	public static void main(String[] args) {
		ThreadWithClass thread1 = new ThreadWithClass();       // Thread Ŭ������ ��ӹ޴� ���
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable �������̽��� �����ϴ� ���
        
        thread1.start(); // �������� ����
        thread2.start(); // �������� ����
	}
}
