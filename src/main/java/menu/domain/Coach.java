package menu.domain;

import menu.global.exception.CustomException;

import static menu.global.exception.ErrorMessage.ERROR_COACH_NAME_RANGE;

public class Coach {
    private static final Integer MIN_NAME_RANGE = 2;
    private static final Integer MAX_NAME_RANGE = 4;

    private final String name;

    private Coach(final String name) {
        this.name = name;
    }

    public static Coach from(final String name){
        validateNameRange(name);
        return new Coach(name);
    }

    private static void validateNameRange(final String name){
        if(name.length() < 2 || name.length() >4){
            throw new CustomException(ERROR_COACH_NAME_RANGE);
        }
    }
}
