package net.lshift.lee.jaxb.pojo;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.lshift.lee.jaxb.xml.adapter.GrandchildAdapter;

@XmlJavaTypeAdapter(GrandchildAdapter.class)
public class Grandchild {

  private final String grandchildName;

  public Grandchild(String grandchildName) {
    this.grandchildName = grandchildName;
  }

  public String getGrandchildName() {
    return grandchildName;
  }
}
