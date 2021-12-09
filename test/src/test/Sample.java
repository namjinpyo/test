package test;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display1 = new Display(new Number(){
			public void DisplayNumber()
			{
				System.out.println("12345");
			}
		});

		display1.display();
	}
}
