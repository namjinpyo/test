package suheang;

public class Main1 {

	public static void main(String[] args) {
		Student student = new Student();
	    System.out.println("이름 : " + student.name);
	    System.out.println("점수 : " + student.score);

	    student.setScore();
	    System.out.println("이름 : " + student.getName());
	    System.out.println("점수 : " + student.score);
	    
	}

}
