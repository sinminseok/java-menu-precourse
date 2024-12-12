package menu.global.validator;

import menu.global.exception.CustomException;

import java.util.List;

import static menu.global.exception.ErrorMessage.ERROR_COACH_COUNT_RANGE;

public class CoachGroupValidator {
    private static final Integer MIN_COACH_GROUP_RANGE = 2;
    private static final Integer MAX_COACH_GROUP_RANGE = 5;

    public static void validateCoachGroupRange(final List<String> names) {
        if(names.size() < MIN_COACH_GROUP_RANGE || names.size() > MAX_COACH_GROUP_RANGE){
            throw new CustomException(ERROR_COACH_COUNT_RANGE);
        }
    }
}
