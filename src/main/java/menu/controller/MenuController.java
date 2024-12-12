package menu.controller;

import menu.service.CoachService;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final CoachService coachService;
    private final MenuService menuService;

    public MenuController(CoachService coachService, MenuService menuService) {
        this.coachService = coachService;
        this.menuService = menuService;
    }

    public void run(){
        OutputView.printStartMessage();
        List<String> names = InputView.inputCoachNames();
    }
}
