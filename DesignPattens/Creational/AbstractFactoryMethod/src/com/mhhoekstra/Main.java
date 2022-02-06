package com.mhhoekstra;

import com.mhhoekstra.factories.GUIFactory;
import com.mhhoekstra.factories.MacOSFactory;
import com.mhhoekstra.factories.WindowsFactory;
import org.jetbrains.annotations.NotNull;

public class Main {

    private static @NotNull
    Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return  app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
