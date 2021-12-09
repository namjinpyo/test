package test;

public class ParentChild {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();
    parent.greet();
    child.greet();
  }
}

class Parent {
  public void greet() {
    System.out.println("æ»≥Á!");
  }
}

class Child extends Parent {
  public void greet() {
    System.out.println("æ»≥Á«œººø‰!");
  }
}


