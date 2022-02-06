package com.mhhoekstra.factories;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.buttons.MacOSButton;
import com.mhhoekstra.checkboxes.Checkbox;
import com.mhhoekstra.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
