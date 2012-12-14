package net.lshift.lee.jaxb.pojo;

public class Parent {

  private final String parentName;
  
  private final Child child;
  
  public Parent(String parentName, Child child) {
    this.parentName = parentName;
    this.child = child;
  }
  
  public String getParentName() {
    return parentName;
  }

  public Child getChild() {
    return child;
  }
}
