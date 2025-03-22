package aw1.view;

import org.linkki.core.binding.manager.BindingManager;
import org.linkki.core.binding.manager.DefaultBindingManager;
import org.linkki.core.vaadin.component.page.AbstractPage;
import org.linkki.framework.ui.dialogs.ConfirmationDialog;
import org.linkki.util.handler.Handler;

public class aw1Page extends AbstractPage {

    private static final long serialVersionUID = 1L;

    private final BindingManager bindingManager;

    public aw1Page() {
        this.bindingManager = new DefaultBindingManager();
    }

    @Override
    public void createContent() {
        addSection(new HelloPmo(this::createOwnDialog));
    }

    @Override
    protected BindingManager getBindingManager() {
        return bindingManager;
    }

    public void createOwnDialog() {
        new ConfirmationDialog("Now try to create your own linkki web application!", Handler.NOP_HANDLER).open();
    }

}
