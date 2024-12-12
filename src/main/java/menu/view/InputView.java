package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.global.utils.Converter;
import menu.global.validator.InputValidator;

import java.util.List;

import static menu.global.constants.ViewMessage.*;

public class InputView {

    private InputView(){
    }

    public static List<String> inputCoachNames(){
        System.out.println(INPUT_COACH_NAMES_MESSAGE);
        String input = Console.readLine();
        InputValidator.validateInputCoachNames(input);
        return Converter.splitDelimiter(input);
    }

    public static List<String> inputPickyEating(String coachName){
        System.out.println(NEXT_LINE + coachName + INPUT_PICKY_EATING_MESSAGE);
        String input = Console.readLine();
        return Converter.splitDelimiter(input);
    }
}
