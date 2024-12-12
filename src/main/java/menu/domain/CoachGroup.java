package menu.domain;

import menu.global.validator.CoachGroupValidator;

import java.util.List;
import java.util.stream.Collectors;


public class CoachGroup {
    private final List<Coach> coaches;

    private CoachGroup(final List<Coach> coaches) {
        this.coaches = coaches;
    }

    public static CoachGroup from(final List<String> names) {
        CoachGroupValidator.validateCoachGroupRange(names);
        List<Coach> collect = names.stream()
                .map(Coach::from)
                .collect(Collectors.toList());
        return new CoachGroup(collect);
    }


    public List<Coach> getCoaches() {
        return coaches;
    }
}
