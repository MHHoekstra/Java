package com.mhhoekstra.factories;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
