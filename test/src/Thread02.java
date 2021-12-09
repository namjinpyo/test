public class Thread02 {
	public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10); // ① Thread-1의 우선순위를 10으로 변경함.
        thread1.start(); // ② Thread-0 실행
        thread2.start(); // ③ Thread-1 실행

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
	}
}
