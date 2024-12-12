package menu.global.validator;

import menu.global.exception.CustomException;

import static menu.global.exception.ErrorMessage.ERROR_COACH_NAME_RANGE;

public class CoachValidator {
    private static final Integer MIN_NAME_RANGE = 2;
    private static final Integer MAX_NAME_RANGE = 4;

    public static void validateNameRange(final String name) {
        if (name.length() < MIN_NAME_RANGE || name.length() > MAX_NAME_RANGE) {
            throw new CustomException(ERROR_COACH_NAME_RANGE);
        }
    }
}
