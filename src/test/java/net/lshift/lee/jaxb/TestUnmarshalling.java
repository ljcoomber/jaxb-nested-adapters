package net.lshift.lee.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.lshift.lee.jaxb.pojo.Child;
import net.lshift.lee.jaxb.pojo.Grandchild;
import net.lshift.lee.jaxb.pojo.Parent;
import net.lshift.lee.jaxb.xml.WrapperElement;

import org.junit.Test;


public class TestUnmarshalling {
  @Test
  public void test() throws Exception {
    WrapperElement wrapper = WrapperElement.load("src/test/resources/test.xml");
    assertNotNull(wrapper);
    
    Parent parent = wrapper.getParent();
    assertNotNull(parent);
    assertEquals("TEST_PARENT_NAME", parent.getParentName());
    
    Child child = parent.getChild();
    assertNotNull(child);
    assertEquals("TEST_CHILD_NAME", child.getChildName());
    
    Grandchild grandchild = child.getGrandchild();
    assertNotNull(grandchild);
    assertEquals("TEST_GRANDCHILD_NAME", grandchild.getGrandchildName());
  }
}