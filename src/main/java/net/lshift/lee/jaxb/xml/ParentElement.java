package net.lshift.lee.jaxb.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import net.lshift.lee.jaxb.pojo.Child;

public class ParentElement {
  
  @XmlAttribute(name = "parent-name")
  private String parentName;
  
  @XmlElement
  private Child child;

  public ParentElement() {}
  
  public String getParentName() {
    return parentName;
  }
  
  public Child getChild() {
    return child;
  }
}
