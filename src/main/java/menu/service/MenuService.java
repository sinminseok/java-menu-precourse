package menu.service;

import menu.domain.*;

public class MenuService {

    public CategoryRecommend recommendMenu(CoachGroup coachGroup) {
        CategoryRecommend categoryRecommend = new CategoryRecommend();
        for (Day day : Day.values()) {
            Category category = categoryRecommend.recommendCategoryByDay(day);
            coachGroup.getCoaches().stream()
                    .forEach(coach -> recommendMenuByCoach(coach, category));
        }
        return categoryRecommend;
    }

    private void recommendMenuByCoach(Coach coach, Category category){
        String menuName = category.recommendMenu();
        if(coach.isExistPickyEating(menuName)){
            recommendMenuByCoach(coach, category);
            return;
        }
        coach.registerMenu(menuName);
    }
}
