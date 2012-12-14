package net.lshift.lee.jaxb.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import net.lshift.lee.jaxb.pojo.Grandchild;

public class ChildElement {
  
  @XmlAttribute(name = "child-name")
  private String childName;
  
  @XmlElement
  private Grandchild grandchild;

  public ChildElement() {}
  
  public String getChildName() {
    return childName;
  }
  
  public Grandchild getGrandchild() {
    return grandchild;
  }
}
