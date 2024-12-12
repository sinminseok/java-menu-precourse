package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.global.utils.Converter;

import java.util.List;

import static menu.global.constants.ViewMessage.INPUT_COACH_NAMES_MESSAGE;
import static menu.global.constants.ViewMessage.INPUT_PICKY_EATING_MESSAGE;

public class InputView {

    private InputView(){
    }

    public static List<String> inputCoachNames(){
        System.out.println(INPUT_COACH_NAMES_MESSAGE);
        String input = Console.readLine();
        //todo 검증
        return Converter.splitDelimiter(input);
    }

    public static List<String> inputPickyEating(String coachName){
        System.out.println(coachName + INPUT_PICKY_EATING_MESSAGE);
        String input = Console.readLine();
        return Converter.splitDelimiter(input);
    }
}
