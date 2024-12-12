package menu.service;

import menu.domain.CategoryRecommend;
import menu.domain.CoachGroup;
import menu.domain.Day;

public class MenuService {

    public CategoryRecommend recommendMenu(CoachGroup coachGroup) {
        CategoryRecommend categoryRecommend = new CategoryRecommend();
        for (Day day : Day.values()) {
            categoryRecommend.recommendCategoryByDay(day);
        }
        return categoryRecommend;
    }
}
