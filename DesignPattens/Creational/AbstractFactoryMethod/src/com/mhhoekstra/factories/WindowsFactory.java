package com.mhhoekstra.factories;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.buttons.WindowsButton;
import com.mhhoekstra.checkboxes.Checkbox;
import com.mhhoekstra.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
