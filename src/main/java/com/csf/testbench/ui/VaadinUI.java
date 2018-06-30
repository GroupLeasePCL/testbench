package com.csf.testbench.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
public class VaadinUI extends UI{
  private FormComponent formComponent;

  @Autowired
  public VaadinUI(FormComponent formComponent) {
    this.formComponent = formComponent;
  }

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    HorizontalLayout horizontalLayout = new HorizontalLayout();
    Label label = new Label("Form registration");
    horizontalLayout.addComponents(label, formComponent);
    setContent(formComponent);
  }
}
