package menu.global.validator;

import menu.global.exception.CustomException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static menu.global.exception.ErrorMessage.ERROR_COACH_COUNT_RANGE;
import static menu.global.exception.ErrorMessage.ERROR_DUPLICATED_COACH_NAME;

public class CoachGroupValidator {
    private static final Integer MIN_COACH_GROUP_RANGE = 2;
    private static final Integer MAX_COACH_GROUP_RANGE = 5;

    public static void validateCoachGroup(final List<String> names) {
        validateCoachGroupRange(names);
        validateDuplicatedName(names);
    }

    private static void validateDuplicatedName(List<String> names) {
        Set<String> setNames = new HashSet<>(names);
        if(setNames.size() != names.size()){
            throw new CustomException(ERROR_DUPLICATED_COACH_NAME);
        }
    }

    private static void validateCoachGroupRange(final List<String> names) {
        if(names.size() < MIN_COACH_GROUP_RANGE || names.size() > MAX_COACH_GROUP_RANGE){
            throw new CustomException(ERROR_COACH_COUNT_RANGE);
        }
    }
}
