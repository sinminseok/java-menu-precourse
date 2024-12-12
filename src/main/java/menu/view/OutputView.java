package menu.view;

import menu.domain.*;
import menu.dto.CoachResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static menu.global.constants.ViewMessage.*;

public class OutputView {
    private OutputView() {
    }

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printMenuRecommendResult(final Map<Day, Category> dayAndCategory, final List<CoachResponse> coachResponses) {
        System.out.println(RECOMMEND_RESULT_HEADER);
        System.out.println(DAY_INFORMATION);
        System.out.printf(CATEGORY_INFORMATION, parseCategory(dayAndCategory));
        for (CoachResponse coach : coachResponses) {
            System.out.printf(COACH_MENU_INFORMATION, coach.name(), joinDivider(coach.menus()));
        }
        System.out.println(RECOMMEND_RESULT_SUCCESS);
    }

    private static String joinDivider(final List<String> menuNames) {
        return String.join(DIVIDER, menuNames);
    }


    private static String parseCategory(final Map<Day, Category> dayAndCategory) {
        List<String> categories = new ArrayList<>();
        for (Day day : Day.values()) {
            categories.add(dayAndCategory.get(day).getName());
        }
        return joinDivider(categories);
    }
}
