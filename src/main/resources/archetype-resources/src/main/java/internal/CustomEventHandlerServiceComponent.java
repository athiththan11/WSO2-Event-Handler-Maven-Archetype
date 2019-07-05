package ${package}.internal;

import ${package}.CustomEventHandler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.wso2.carbon.identity.event.handler.AbstractEventHandler;

@Component(name = "${package}.internal.component", service = CustomEventHandlerServiceComponent.class, immediate = true)
public class CustomEventHandlerServiceComponent {

    private static final Log log = LogFactory.getLog(CustomEventHandlerServiceComponent.class);

    @Activate
    protected void activate(ComponentContext context) {
        // TODO: activate event-handler

        try {
            context.getBundleContext().registerService(AbstractEventHandler.class.getName(),
                    new CustomEventHandler(), null);
        } catch (Throwable e) {
            log.error("Error occured while initializing service component", e);
        }
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        // TODO: deactivate
    }
}