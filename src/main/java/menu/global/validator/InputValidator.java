package menu.global.validator;


import menu.global.exception.CustomException;

import static menu.global.exception.ErrorMessage.ERROR_EMPTY_INPUT;

public class InputValidator {

    private InputValidator(){
    }

    public static void validateInputCoachNames(final String input){
        if (input.isBlank()) {
            throw new CustomException(ERROR_EMPTY_INPUT);
        }
    }
}
