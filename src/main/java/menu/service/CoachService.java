package menu.service;

import menu.domain.Coach;
import menu.domain.CoachGroup;

import java.util.List;

public class CoachService {

    public CoachGroup saveCoachGroup(final List<String> name){
        return CoachGroup.from(name);
    }

    public void registerPickyEating(final Coach coach, final List<String> menus){
        menus.stream()
                .forEach(menu -> coach.registerPickyEating(menu));
    }
}
