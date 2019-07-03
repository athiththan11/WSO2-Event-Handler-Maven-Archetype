package ${package}.internal;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(name = "${package}.component", service = CustomEventHandlerServiceComponent.class, immediate = true)
public class CustomEventHandlerServiceComponent {

    @Activate
    protected void activate(ComponentContext context) {
        // TODO: activate event-handler
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        // TODO: deactivate
    }
}