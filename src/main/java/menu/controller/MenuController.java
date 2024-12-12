package menu.controller;

import menu.domain.CategoryRecommend;
import menu.domain.Coach;
import menu.domain.CoachGroup;
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

        CoachGroup coachGroup = coachService.saveCoachGroup(names);

        List<Coach> coaches = coachGroup.getCoaches();

        for(Coach coach : coaches){
            List<String> menus = InputView.inputPickyEating(coach.getName());
            coachService.registerPickyEating(coach, menus);
        }

        CategoryRecommend categoryRecommend = menuService.recommendMenu(coachGroup);
        OutputView.printMenuRecommendResult(categoryRecommend, coachGroup);
    }
}
