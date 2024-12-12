package menu.view;

import menu.domain.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static menu.global.constants.ViewMessage.*;

public class OutputView {
    private OutputView(){
    }

    public static void printStartMessage(){
        System.out.println(START_MESSAGE);
    }

    public static void printMenuRecommendResult(CategoryRecommend categoryRecommend, CoachGroup coachGroup){
        System.out.println(RECOMMEND_RESULT_HEADER);
        System.out.println(DAY_INFORMATION);
        System.out.printf(CATEGORY_INFORMATION, parseCategory(categoryRecommend));
        for(Coach coach : coachGroup.getCoaches()){
            System.out.printf(COACH_MENU_INFORMATION, coach.getName(), parseMenus(coach.getMenus()));
        }
    }

    private static String parseMenus(List<String> menuNames){
        return String.join(" | ", menuNames);
    }

    private static String parseCategory(CategoryRecommend categoryRecommend){
        List<String> categories = categoryRecommend.getHistory().values().stream()
                .map(category -> category.getName())
                .collect(Collectors.toList());
        return String.join(" | ", categories);
    }
}
