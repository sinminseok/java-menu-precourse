package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class CategoryRecommend {

    private final Map<Day, Category> history;

    public CategoryRecommend() {
        this.history = new HashMap<>();
    }


    public Category recommendCategoryByDay(Day day){
        int order = Randoms.pickNumberInRange(1, 5);
        Category recommendCategory = Category.findByOrder(order);
        if(canRecommendCategory(recommendCategory)){
            history.put(day, recommendCategory);
            return recommendCategory;
        }
        return recommendCategoryByDay(day);
    }

    private boolean canRecommendCategory(Category recommendCategory){
        Collection<Category> categories = history.values();
        int orignSize = categories.size();
        Set<Category> set = new HashSet<>(categories);
        set.add(recommendCategory);
        return !(set.size() < orignSize);
    }

}
