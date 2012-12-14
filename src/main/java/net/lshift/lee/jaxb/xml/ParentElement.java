package net.lshift.lee.jaxb.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import net.lshift.lee.jaxb.pojo.Child;

@XmlRootElement(name = "parent")
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
  
  public static ParentElement load(String filename) throws JAXBException, FileNotFoundException {
    JAXBContext context = JAXBContext.newInstance(ParentElement.class);
    Unmarshaller um = context.createUnmarshaller();
    return (ParentElement) um.unmarshal(new FileReader(filename));
  }
}
