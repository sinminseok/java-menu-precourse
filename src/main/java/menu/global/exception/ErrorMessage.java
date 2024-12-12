package menu.global.exception;

public enum ErrorMessage {
    ERROR_COACH_NAME_RANGE("코치 이름은 2~4글자 입니다.");

    private static final String PREFIX = "[ERROR] ";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
