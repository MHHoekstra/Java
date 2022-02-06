package com.mhhoekstra;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.checkboxes.Checkbox;
import com.mhhoekstra.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
