package aw1.ui;

import java.time.Year;

import org.linkki.framework.ui.application.ApplicationInfo;

public class aw1Info implements ApplicationInfo {

    public static final String APPLICATION_NAME = "aw1";

    @Override
    public String getApplicationName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getApplicationVersion() {
        return "1.0";
    }

    @Override
    public String getApplicationDescription() {
        return "aw1";
    }

    @Override
    public String getCopyright() {
        return "© Faktor Zehn " + Year.now();
    }
}