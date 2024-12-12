package menu.global.validator;

import menu.global.exception.CustomException;

import java.util.List;

import static menu.global.exception.ErrorMessage.ERROR_COACH_NAME_RANGE;
import static menu.global.exception.ErrorMessage.ERROR_PICKY_EATING_COUNT_RANGE;

public class CoachValidator {
    private static final Integer MIN_NAME_RANGE = 2;
    private static final Integer MAX_NAME_RANGE = 4;
    private static final Integer MIN_PICKY_EATING_RANGE = 0;
    private static final Integer MAX_PICKY_EATING_RANGE = 2;

    public static void validateNameRange(final String name) {
        if (name.length() < MIN_NAME_RANGE || name.length() > MAX_NAME_RANGE) {
            throw new CustomException(ERROR_COACH_NAME_RANGE);
        }
    }

    public static void validatePickyEatingRange(final List<String> menus){
        if(menus.size() < MIN_PICKY_EATING_RANGE || menus.size() > MAX_PICKY_EATING_RANGE){
            throw new CustomException(ERROR_PICKY_EATING_COUNT_RANGE);
        }
    }
}
