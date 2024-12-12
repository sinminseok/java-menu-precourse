package menu.dto;

import menu.domain.CoachGroup;

import java.util.List;
import java.util.stream.Collectors;

public class CoachMapper {
    public static List<CoachResponse> toCoachResponses(CoachGroup coachGroup) {
        return coachGroup.getCoaches().stream()
                .map(coach -> new CoachResponse(coach.getName(), coach.getMenus()))
                .collect(Collectors.toList());
    }
}
