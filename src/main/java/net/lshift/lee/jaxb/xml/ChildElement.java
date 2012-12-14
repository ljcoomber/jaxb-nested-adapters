package net.lshift.lee.jaxb.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ChildElement {
  
  @XmlAttribute(name = "child-name")
  private String childName;
  
  @XmlElement
  private GrandchildElement grandchild;

  public ChildElement() {}
  
  public String getChildName() {
    return childName;
  }
  
  public GrandchildElement getGrandchild() {
    return grandchild;
  }
}
