package test;

public class Circle extends Shape{
	  private int radious;
	  
	  public Circle(int r, int h) {
	    super(h); // super.setHeight(h);
	    this.radious = r;
	    System.out.println("Circle ������");
	    System.out.println(super.getHeight());
	  }

}
