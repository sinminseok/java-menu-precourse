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
        CoachGroup coachGroup = saveCoaches();
        registerPickyEating(coachGroup.getCoaches());
        recommendMenus(coachGroup);
    }

    private CoachGroup saveCoaches(){
        List<String> names = InputView.inputCoachNames();
        return coachService.saveCoachGroup(names);
    }

    private void registerPickyEating(List<Coach> coaches){
        for(Coach coach : coaches){
            List<String> menus = InputView.inputPickyEating(coach.getName());
            coachService.registerPickyEating(coach, menus);
        }
    }

    private void recommendMenus(CoachGroup coachGroup){
        CategoryRecommend categoryRecommend = menuService.recommendMenu(coachGroup);
        OutputView.printMenuRecommendResult(categoryRecommend, coachGroup);
    }
}
