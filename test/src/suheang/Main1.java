package suheang;

public class Main1 {

	public static void main(String[] args) {
		Student student = new Student();
	    System.out.println("�̸� : " + student.name);
	    System.out.println("���� : " + student.score);

	    student.setScore();
	    System.out.println("�̸� : " + student.getName());
	    System.out.println("���� : " + student.score);
	    
	}

}
