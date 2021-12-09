package test;

public class Shape {
	  private int height;
	  public Shape() {
	    System.out.println("Shape 기본 생성자");
	  }
	  public Shape(int h) {
	    System.out.println("Shape 높이가 정해진 생성자");
	    this.height = h;
	  }
	  public void setHeight(int h) {
	    this.height = h;
	  }
	  public int getHeight() {
	    return this.height;
	  }
}
