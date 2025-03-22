package aw1.ui;

import org.linkki.framework.ui.application.ApplicationConfig;
import org.linkki.framework.ui.application.menu.ApplicationMenuItemDefinition;
import org.linkki.util.Sequence;

public class aw1Config implements ApplicationConfig {

    @Override
    public aw1Info getApplicationInfo() {
        return new aw1Info();
    }

    @Override
    public Sequence<ApplicationMenuItemDefinition> getMenuItemDefinitions() {
        return Sequence.empty();
    }

}