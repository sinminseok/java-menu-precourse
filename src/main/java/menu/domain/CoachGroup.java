package menu.domain;

import java.util.List;
import java.util.stream.Collectors;

public class CoachGroup {
    private static final Integer MIN_COACH_GROUP_RANGE = 2;
    private static final Integer MAX_COACH_GROUP_RANGE = 5;
    private final List<Coach> coaches;

    private CoachGroup(final List<Coach> coaches) {
        this.coaches = coaches;
    }

    public static CoachGroup from(final List<String> names) {
        validateCoachGroupRange(names);
        List<Coach> collect = names.stream()
                .map(Coach::from)
                .collect(Collectors.toList());
        return new CoachGroup(collect);
    }

    private static void validateCoachGroupRange(final List<String> names) {
        if(names.size() < MIN_COACH_GROUP_RANGE || names.size() > MAX_COACH_GROUP_RANGE);
    }

    public List<Coach> getCoaches() {
        return coaches;
    }
}
