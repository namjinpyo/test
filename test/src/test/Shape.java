package test;

public class Shape {
	  private int height;
	  public Shape() {
	    System.out.println("Shape �⺻ ������");
	  }
	  public Shape(int h) {
	    System.out.println("Shape ���̰� ������ ������");
	    this.height = h;
	  }
	  public void setHeight(int h) {
	    this.height = h;
	  }
	  public int getHeight() {
	    return this.height;
	  }
}
