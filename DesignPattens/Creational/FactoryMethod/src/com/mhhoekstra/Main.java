package com.mhhoekstra;

import com.mhhoekstra.factory.Dialog;
import com.mhhoekstra.factory.HtmlDialog;
import com.mhhoekstra.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }
        else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
