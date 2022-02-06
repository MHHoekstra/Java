package com.mhhoekstra.factory;

import com.mhhoekstra.buttons.Button;

public abstract class Dialog {
    public void  renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
