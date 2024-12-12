package menu.service;

import menu.domain.*;

public class MenuService {

    public CategoryRecommend recommendMenu(final CoachGroup coachGroup) {
        CategoryRecommend categoryRecommend = new CategoryRecommend();
        for (Day day : Day.values()) {
            Category category = categoryRecommend.recommendCategoryByDay(day);
            coachGroup.getCoaches().stream()
                    .forEach(coach -> recommendMenuByCoach(coach, category));
        }
        return categoryRecommend;
    }

    private void recommendMenuByCoach(final Coach coach, final Category category) {
        String menuName = category.recommendMenu();
        if (!coach.canRecommendMenu(menuName)) {
            recommendMenuByCoach(coach, category);
            return;
        }
        coach.registerMenu(menuName);
    }
}
