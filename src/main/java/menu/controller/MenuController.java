package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    public void run(){
        OutputView.printStartMessage();
        List<String> names = InputView.inputCoachNames();
    }
}
