package menu.global.exception;

public enum ErrorMessage {
    ERROR_COACH_NAME_RANGE("코치 이름은 2~4글자 입니다."),
    ERROR_CATEGORY_ORDER_RANGE("1부터 5까지의 숫자만을 허용합니다."),
    ERROR_MENU_NAME("존재하지 않는 메뉴 이름입니다.");

    private static final String PREFIX = "[ERROR] ";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
