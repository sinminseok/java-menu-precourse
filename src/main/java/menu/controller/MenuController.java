package menu.controller;

import menu.view.InputView;

import java.util.List;

public class MenuController {

    public void run(){
        List<String> names = InputView.inputCoachNames();
    }
}
