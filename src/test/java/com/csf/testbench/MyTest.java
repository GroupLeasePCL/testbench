package com.csf.testbench;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TextFieldElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class MyTest extends TestBenchTestCase {

  private static final Logger logger = Logger.getLogger(MyTest.class.getName());

  @Before
  public void setUp() {
    try {
      setDriver(DriverUtil.getPhantomjsDriver());
    } catch (Exception e) {
      logger.info("Error => " + e.getMessage());
    }
  }

  @After
  public void tearDown() {
    try {
      getDriver().quit();
    } catch (Exception e) {
      logger.info("Error => " + e.getMessage());
    }
  }

  @Test
  public void getMyTest() {
    getDriver().get("http://localhost:8080");
    $(ButtonElement.class).caption("Submit").first().click();
    Assert.assertTrue($(TextFieldElement.class).id("firstNameTextField").getValue().equals(""));
  }
}
