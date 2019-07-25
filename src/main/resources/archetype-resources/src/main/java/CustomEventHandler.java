package $package;

#if($IdentityConnectorConfig.toLowerCase() == "y")
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

#end
import org.wso2.carbon.identity.core.bean.context.MessageContext;
import org.wso2.carbon.identity.event.IdentityEventException;
import org.wso2.carbon.identity.event.event.Event;
import org.wso2.carbon.identity.event.handler.AbstractEventHandler;
#if($IdentityConnectorConfig.toLowerCase() == "y")

import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.core.handler.InitConfig;
import org.wso2.carbon.identity.governance.IdentityGovernanceException;
import org.wso2.carbon.identity.governance.common.IdentityConnectorConfig;
import org.wso2.custom.constant.CustomEventHandlerConstants;
#end

public class CustomEventHandler extends AbstractEventHandler #if($IdentityConnectorConfig.toLowerCase() == "y")implements IdentityConnectorConfig #end{

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
         */
    }

    @Override
    public String getName() {
        // TODO: change the handler name
        return "customeventhandler";
    }

    @Override
    public int getPriority(MessageContext messageContext) {
        // TODO: change the priority
        return 50;
    }
    #if($IdentityConnectorConfig == "Y" || $IdentityConnectorConfig == "y")

    @Override
    public String getCategory() {
        // TODO: change the category name
        return "customeventhandler";
    }

    @Override
    public Properties getDefaultPropertyValues(String arg0) throws IdentityGovernanceException {
        // TODO: implement body

        Map<String, String> defaultProperties = new HashMap<>();
        defaultProperties.put(CustomEventHandlerConstants.CUSTOM_PROP, configs.getModuleProperties()
                .getProperty(CustomEventHandlerConstants.CUSTOM_PROP));
        
        Properties properties = new Properties();
        properties.putAll(defaultProperties);
        return properties;
    }

    @Override
    public Map<String, String> getDefaultPropertyValues(String[] arg0, String arg1) throws IdentityGovernanceException {
        // TODO: implement body
        return null;
    }

    @Override
    public String getFriendlyName() {
        // TODO: change the friendly name
        return "customeventhandler";
    }

    @Override
    public int getOrder() {
        // TODO: change order
        return 0;
    }

    @Override
    public Map<String, String> getPropertyDescriptionMapping() {
        // TODO: implement body

        Map<String, String> descriptionMapping = new HashMap<>();
        descriptionMapping.put(CustomEventHandlerConstants.CUSTOM_PROP, "value goes here");

        return descriptionMapping;
    }

    @Override
    public Map<String, String> getPropertyNameMapping() {
        // TODO: implement body

        Map<String, String> nameMapping = new HashMap<>();
        nameMapping.put(CustomEventHandlerConstants.CUSTOM_PROP, "value goes here");
        
        return nameMapping;
    }

    @Override
    public String[] getPropertyNames() {
        // TODO: implement body

        List<String> properties = new ArrayList<>();
        properties.add(CustomEventHandlerConstants.CUSTOM_PROP);

        return properties.toArray(new String[properties.size()]);
    }

    @Override
    public String getSubCategory() {
        return "DEFAULT";
    }

    @Override
    public void init(InitConfig configuration) throws IdentityRuntimeException {
        super.init(configuration);
        
        // TODO: register Identity Connector Config service

        // CustomEventHandlerServiceDataHolder.getInstance().getBundleContext().registerService
        //         (IdentityConnectorConfig.class.getName(), this, null);
    }
    #end

}
