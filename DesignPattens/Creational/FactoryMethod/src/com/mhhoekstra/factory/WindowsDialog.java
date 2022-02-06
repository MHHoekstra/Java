package com.mhhoekstra.factory;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
