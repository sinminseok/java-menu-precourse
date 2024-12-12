package menu.controller;

import menu.domain.CategoryRecommend;
import menu.domain.Coach;
import menu.domain.CoachGroup;
import menu.dto.CoachMapper;
import menu.global.utils.Retry;
import menu.service.CoachService;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final CoachService coachService;
    private final MenuService menuService;

    public MenuController(final CoachService coachService, final MenuService menuService) {
        this.coachService = coachService;
        this.menuService = menuService;
    }

    public void run(){
        OutputView.printStartMessage();
        CoachGroup coachGroup = Retry.retryOnExceptionWithResult(() -> saveCoaches());
        for(Coach coach : coachGroup.getCoaches()){
            Retry.retryOnExceptionWithoutResult(() -> registerPickyEating(coach));
        }
        recommendMenus(coachGroup);
    }

    private CoachGroup saveCoaches(){
        List<String> names = InputView.inputCoachNames();
        return coachService.saveCoachGroup(names);
    }

    private void registerPickyEating(final Coach coach){
            List<String> menus = InputView.inputPickyEating(coach.getName());
            coachService.registerPickyEating(coach, menus);
    }

    private void recommendMenus(final CoachGroup coachGroup){
        CategoryRecommend categoryRecommend = menuService.recommendMenu(coachGroup);
        OutputView.printMenuRecommendResult(categoryRecommend.getHistory(), CoachMapper.toCoachResponses(coachGroup));
    }
}
