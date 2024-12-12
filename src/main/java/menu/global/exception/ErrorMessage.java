package menu.global.exception;

public enum ErrorMessage {
    ERROR_DUPLICATED_COACH_NAME("중복되는 코치 이름을 허용하지 않습니다."),
    ERROR_DUPLICATED_PICKY_EATING("못 먹는 메뉴 중 중복되는 메뉴가 있습니다."),
    ERROR_COACH_COUNT_RANGE("코치는 최소2명, 최대5명이여야 합니다."),
    ERROR_COACH_NAME_RANGE("코치 이름은 2~4글자 입니다."),
    ERROR_PICKY_EATING_COUNT_RANGE("코치 이름은 2~4글자 입니다."),
    ERROR_CATEGORY_ORDER_RANGE("1부터 5까지의 숫자만을 허용합니다."),
    ERROR_EMPTY_INPUT("공백은 허용하지 않습니다."),
    ERROR_MENU_NAME("존재하지 않는 메뉴 이름입니다.");

    private static final String PREFIX = "[ERROR] ";

    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
