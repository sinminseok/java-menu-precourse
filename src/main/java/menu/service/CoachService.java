package menu.service;

import menu.domain.CoachGroup;

import java.util.List;

public class CoachService {

    public CoachGroup saveCoachGroup(final List<String> name){
        return CoachGroup.from(name);
    }
}
