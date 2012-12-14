package net.lshift.lee.jaxb.xml.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.lshift.lee.jaxb.pojo.Grandchild;
import net.lshift.lee.jaxb.xml.GrandchildElement;

public class GrandchildAdapter extends XmlAdapter<GrandchildElement, Grandchild> {

  @Override
  public Grandchild unmarshal(GrandchildElement v) throws Exception {
    return new Grandchild(v.getGrandchildName());
  }

  @Override
  public GrandchildElement marshal(Grandchild v) throws Exception {
    throw new Exception("Not implemented");
  }

}