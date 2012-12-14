package net.lshift.lee.jaxb.pojo;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.lshift.lee.jaxb.xml.adapter.ParentAdapter;

@XmlJavaTypeAdapter(ParentAdapter.class)
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
