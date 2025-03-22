package aw1.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.linkki.framework.ui.component.Headline;
import aw1.ui.aw1Layout;

@PageTitle("aw1")
@Route(value = "", layout = aw1Layout.class)
public class aw1View extends VerticalLayout {

    private static final long serialVersionUID = 1L;

    public aw1View() {
        add(new Headline("aw1"));
        setSizeFull();
        aw1Page page = new aw1Page();
        page.init();
        add(page);
    }
}