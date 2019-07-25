package ${package}.exception;

import org.wso2.carbon.identity.base.IdentityException;

public class CustomEventHandlerException extends IdentityException {

    public CustomEventHandlerException(String errorDescription) {
        super(errorDescription);
    }

    public CustomEventHandlerException(String errorDescription, Throwable cause) {
        super(errorDescription, cause);
    }
}