package menu;

import menu.controller.MenuController;
import menu.service.CoachService;
import menu.service.MenuService;

public class Application {
    public static void main(String[] args) {
        CoachService coachService = new CoachService();
        MenuService menuService = new MenuService();
        MenuController menuController = new MenuController(coachService, menuService);
    }
}
