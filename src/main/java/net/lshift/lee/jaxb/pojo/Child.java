package net.lshift.lee.jaxb.pojo;

public class Child {

  private final String childName;
  
  private final Grandchild grandchild;

  public Child(String childName, Grandchild grandchild) {
    this.childName = childName;
    this.grandchild = grandchild;
  }

  public String getChildName() {
    return childName;
  }

  public Grandchild getGrandchild() {
    return grandchild;
  }
}
