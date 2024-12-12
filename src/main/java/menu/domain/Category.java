package menu.domain;

import menu.global.exception.CustomException;

import java.util.List;

import static menu.global.exception.ErrorMessage.ERROR_MENU_NAME;

public enum Category {
    JAPAN_FOOD("일식", List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노모야끼")),
    KOREA_FOOD("한식", List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    CHINA_FOOD("중식", List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIA_FOOD("아시안", List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜")),
    WESTERN_FOOD("양식", List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바케트", "스파케티", "피자", "파니니"));

    private final String name;
    private final List<String> menus;

    Category(final String name, final List<String> menus) {
        this.name = name;
        this.menus = menus;
    }

    public void isExistMenu(final String menuName) {
        for (Category category : values()) {
            if (category.menus.stream().anyMatch(menu -> menu.equals(menuName))) {
                return;
            }
        }
        throw new CustomException(ERROR_MENU_NAME);
    }
}

