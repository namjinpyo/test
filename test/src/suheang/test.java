package suheang;

public class test {
	private String a1;
	
	test() {
		a1 = "abc";
	}
	
	public void getV() {
		System.out.println("value = " + a1);
	}
	
	public void setV(String b1) {
		a1 = a1 + b1;
	}
	
	public void setV(String b1, String c1) {
		a1 = b1 + c1;
	}
	
	public void setV() {
		a1 = "kor";
	}
}
