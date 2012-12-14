package net.lshift.lee.jaxb.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import net.lshift.lee.jaxb.pojo.Parent;

@XmlRootElement(name = "wrapper")
public class WrapperElement {
  
  @XmlElement
  private Parent parent;

  public WrapperElement() {}

  public Parent getParent() {
    return parent;
  }

  public static WrapperElement load(String filename) throws JAXBException, FileNotFoundException {
    JAXBContext context = JAXBContext.newInstance(WrapperElement.class);
    Unmarshaller um = context.createUnmarshaller();
    return (WrapperElement) um.unmarshal(new FileReader(filename));
  }
}
