package test;

public class Display
{
	private Number number;

	public Display(Number object)
	{
		this.number = object;
	}

	public void display()
	{
		this.number.DisplayNumber();
	}

}