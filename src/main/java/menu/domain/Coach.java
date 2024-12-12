package menu.domain;

import menu.global.validator.CoachValidator;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private final String name;
    private final List<String> pickyEating;
    private final List<String> menus;

    private Coach(final String name) {
        this.name = name;
        this.pickyEating = new ArrayList<>();
        this.menus = new ArrayList<>();
    }

    public static Coach from(final String name) {
        CoachValidator.validateNameRange(name);
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
        return pickyEating.stream().anyMatch(picky -> picky.equals(menuName));
    }

    public void registerMenu(final String menu) {
        menus.add(menu);
    }

    public void registerPickyEatings(final List<String> menuNames) {
        CoachValidator.validatePickyEatingRange(menuNames);
        menuNames.stream()
                .forEach(menuName -> registerPickyEating(menuName));
    }

    private void registerPickyEating(final String menuName) {
        Category.isExistMenu(menuName);
        pickyEating.add(menuName);
    }


    public String getName() {
        return name;
    }

    public List<String> getMenus() {
        return menus;
    }
}
