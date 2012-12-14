package net.lshift.lee.jaxb.xml.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.lshift.lee.jaxb.pojo.Parent;
import net.lshift.lee.jaxb.xml.ParentElement;

public class ParentAdapter extends XmlAdapter<ParentElement, Parent> {

  @Override
  public Parent unmarshal(ParentElement v) throws Exception {
    return new Parent(v.getParentName(), v.getChild());
  }

  @Override
  public ParentElement marshal(Parent v) throws Exception {
    throw new Exception("Not implemented");
  }
}