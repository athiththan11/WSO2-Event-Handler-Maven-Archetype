package $package;

import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.core.handler.InitConfig;
import org.wso2.carbon.identity.event.event.Event;
import org.wso2.carbon.identity.event.handler.AbstractEventHandler;
import org.wso2.carbon.identity.event.IdentityEventException;
import org.wso2.carbon.identity.governance.common.IdentityConnectorConfig;
import org.wso2.carbon.identity.password.policy.internal.IdentityPasswordPolicyServiceDataHolder;

public class CustomEventHandler extends AbstractEventHandler {

    @Override
    public void handleEvent(Event event) throws IdentityEventException {
        // TODO: implement handle event body

        /**
         * couple of registered events
         * 
         * 01. PRE_AUTHENTICATION 
         * 02. POST_AUTHENTICATION
         * 03. PRE_SET_USER_CLAIM
         * 04. POST_SET_USER_CLAIM
         * 05. PRE_ADD_USER
         * 06. POST_ADD_USER
         * 07. PRE_UPDATE_CREDENTIAL
         * 08. POST_UPDATE_CREDENTIAL
         * 09. PRE_UPDATE_CREDENTIAL_BY_ADMIN
         * 10. POST_UPDATE_CREDENTIAL_BY_ADMIN
         * 
         * for more check on here
         */
    }

    @Override
    public String getName() {
        // TODO: change the handler name
        return "customeventhandler";
    }

    @Override
    public void init(InitConfig configuration) throws IdentityRuntimeException {
        // TODO: register handler as a service when and if using `IdentityConnectorConfig`
        super.init(configuration);
        IdentityPasswordPolicyServiceDataHolder.getInstance().getBundleContext()
                .registerService(IdentityConnectorConfig.class.getName(), this, null);
    }
}
