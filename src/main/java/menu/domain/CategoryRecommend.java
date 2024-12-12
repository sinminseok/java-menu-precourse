package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class CategoryRecommend {
    private static final Integer MIN_RECOMMEND_RANGE = 1;
    private static final Integer MAX_RECOMMEND_RANGE = 5;

    private final Map<Day, Category> history;

    public CategoryRecommend() {
        this.history = new HashMap<>();
    }

    public Category recommendCategoryByDay(final Day day){
        int order = Randoms.pickNumberInRange(MIN_RECOMMEND_RANGE, MAX_RECOMMEND_RANGE);
        Category recommendCategory = Category.findByOrder(order);
        if(canRecommendCategory(recommendCategory)){
            history.put(day, recommendCategory);
            return recommendCategory;
        }
        return recommendCategoryByDay(day);
    }

    private boolean canRecommendCategory(final Category recommendCategory){
        Collection<Category> categories = history.values();
        int orignSize = categories.size();
        Set<Category> set = new HashSet<>(categories);
        set.add(recommendCategory);
        return !(set.size() < orignSize);
    }

    public Map<Day, Category> getHistory() {
        return history;
    }
}
