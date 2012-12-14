package net.lshift.lee.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.lshift.lee.jaxb.pojo.Child;
import net.lshift.lee.jaxb.pojo.Grandchild;
import net.lshift.lee.jaxb.xml.ParentElement;

import org.junit.Test;


public class TestUnmarshalling {
  @Test
  public void test() throws Exception {
    ParentElement parent = ParentElement.load("src/test/resources/test.xml");
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