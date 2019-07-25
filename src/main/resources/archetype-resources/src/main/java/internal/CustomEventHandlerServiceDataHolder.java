package ${package}.internal;

import org.osgi.framework.BundleContext;
import org.wso2.carbon.identity.governance.IdentityGovernanceService;

public class CustomEventHandlerServiceDataHolder {

    private static CustomEventHandlerServiceDataHolder instance = new CustomEventHandlerServiceDataHolder();
    private IdentityGovernanceService identityGovernanceService;
    private BundleContext bundleContext;

    private CustomEventHandlerServiceDataHolder() {
    }

    public static CustomEventHandlerServiceDataHolder getInstance() {

        return instance;
    }

    public IdentityGovernanceService getIdentityGovernanceService() {
        return identityGovernanceService;
    }

    public void setIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {
        this.identityGovernanceService = identityGovernanceService;
    }

    public BundleContext getBundleContext() {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }
}