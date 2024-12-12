package menu.global.validator;

import menu.global.exception.CustomException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static menu.global.exception.ErrorMessage.*;

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

    public static void validatePickyEating(final List<String> menus){
        validatePickyEatingRange(menus);
        validateDuplicateMenus(menus);
    }

    private static void validateDuplicateMenus(List<String> menus) {
        Set<String> setNames = new HashSet<>(menus);
        if(setNames.size() != menus.size()){
            throw new CustomException(ERROR_DUPLICATED_PICKY_EATING);
        }
    }

    private static void validatePickyEatingRange(final List<String> menus){
        if(menus.size() < MIN_PICKY_EATING_RANGE || menus.size() > MAX_PICKY_EATING_RANGE){
            throw new CustomException(ERROR_PICKY_EATING_COUNT_RANGE);
        }
    }
}
