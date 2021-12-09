package test;

class OverLoading {
  void printout(int a) {
    System.out.println(a);
  }
  
  void printout(int a, int b) {
	    System.out.println(a + ", " + b);
	  }
}

public class Main {
  public static void main(String[] args) {
	  OverLoading overLoading = new OverLoading();
	  overLoading.printout(1);
	  overLoading.printout(1, 2);
  }
}

