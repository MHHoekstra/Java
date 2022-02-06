package com.mhhoekstra.factory;

import com.mhhoekstra.buttons.Button;
import com.mhhoekstra.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
