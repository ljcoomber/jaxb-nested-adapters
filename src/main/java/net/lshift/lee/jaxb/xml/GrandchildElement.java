package net.lshift.lee.jaxb.xml;

import javax.xml.bind.annotation.XmlAttribute;

public class GrandchildElement {
  
  @XmlAttribute(name = "grandchild-name")
  private String grandchildName;
  
  public GrandchildElement() {}
  
  public String getGrandchildName() {
    return grandchildName;
  }
}
