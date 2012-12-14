package net.lshift.lee.jaxb.xml.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.lshift.lee.jaxb.pojo.Child;
import net.lshift.lee.jaxb.xml.ChildElement;

public class ChildAdapter extends XmlAdapter<ChildElement, Child> {

  @Override
  public Child unmarshal(ChildElement v) throws Exception {
    return new Child(v.getChildName(), v.getGrandchild());
  }

  @Override
  public ChildElement marshal(Child v) throws Exception {
    throw new Exception("Not implemented");
  }

}