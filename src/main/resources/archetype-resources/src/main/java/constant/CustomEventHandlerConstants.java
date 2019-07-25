package ${package}.constant;

public class CustomEventHandlerConstants {

    public static final String CUSTOM_PROP = "custom.property";

    public enum ErrorMessages {

        ERROR_CODE_VIOLATE("11190", "You have been locked. Please change the error message");

        private final String code;
        private final String message;

        ErrorMessages(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public String toString() {
            return code + " - " + message;
        }
    }
}