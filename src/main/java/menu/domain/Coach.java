package menu.domain;

import menu.global.exception.CustomException;

import java.util.ArrayList;
import java.util.List;

import static menu.global.exception.ErrorMessage.ERROR_COACH_NAME_RANGE;

public class Coach {
    private static final Integer MIN_NAME_RANGE = 2;
    private static final Integer MAX_NAME_RANGE = 4;

    private final String name;
    private final List<String> pickyEating;
    private final List<String> menus;

    private Coach(final String name) {
        this.name = name;
        this.pickyEating = new ArrayList<>();
        this.menus = new ArrayList<>();
    }

    public static Coach from(final String name) {
        validateNameRange(name);
        return new Coach(name);
    }

    public boolean canRecommendMenu(final String menuName) {
        return !isExistPickyEating(menuName) && !isDuplicatedMenu(menuName);
    }

    private boolean isDuplicatedMenu(final String menuName) {
        return menus.stream()
                .anyMatch(menu -> menu.equals(menuName));
    }

    private boolean isExistPickyEating(final String menuName) {
        for (String picky : pickyEating) {
            if (picky.equals(menuName)) {
                return true;
            }
        }
        return false;
    }

    public void registerMenu(final String menu) {
        menus.add(menu);
    }

    public void registerPickyEating(final String menuName) {
        Category.isExistMenu(menuName);
        pickyEating.add(menuName);
    }

    private static void validateNameRange(final String name) {
        if (name.length() < 2 || name.length() > 4) {
            throw new CustomException(ERROR_COACH_NAME_RANGE);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getMenus() {
        return menus;
    }
}
