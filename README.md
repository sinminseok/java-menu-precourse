# 점심 메뉴 추천

----

```
한 주의 점심 메뉴를 추천해주는 서비스입니다.
```




## ✏️ 입,출력 관련 기능

----
### ✔ 입력 기능
- [x] 코치들의 이름을 입력 받는다. 
- [x] 각 코치가 못 먹는 메뉴를 입력 받는다.

### ✔  출력 기능
- [x] 서비스 시작 문구를 출력한다.
- [x] 메뉴 추천 결과를 출력한다.


##💡 프로그램 기능

----

### ✔ 메뉴 추천 기능
- [x] 한명의 코치에게 요일에 해당하는 카테고리를 정한다.
- [x] `월, 화, 수, 목, 금` 각각의 요일 메뉴를 추천한다.
- [x] 추천받은 카테고리에 속한 메뉴를 추천한다.
- [x] 코치가 먹지 못하는 메뉴는 추천하지 않는다.
- [x] 한 주에 같은 카테고리는 최대 2회 까지만 허용한다.
- [x] 한 주에 중복되는 메뉴가 없어야 한다.
- [ ] 코치가 먹지 못하는 메뉴가 없을 수 있다.

### ✔ 코치 관련 기능
- [x] 코치가 먹지 못하는 메뉴를 등록한다.

## ✅ 검증 기능

----

- [x] **[예외]** 코치 인원이 `최소2명, 최대5명` 을 벗어나면 예외를 발생한다.
- [x] **[예외]** 코치 이름이 `2글자~4글자` 를 벗어나면 예외를 발생한다.
- [ ] **[예외]** 코치 이름을 `,` 로 구분할 수 없을 경우 예외를 발생한다.
- [ ] **[예외]** 못 먹는 메뉴를 `,` 로 구분할 수 없는 경우 예외를 발생한다.
- [x] **[예외]** 존재하지 않는 메뉴를 입력한 경우 예외를 발생한다.
----


### ✔ 예외 처리 기능
-[x] 사용자가 잘못된 값을 입력할 경우`IllegalArgumentException`을 발생시키고,`"[ERROR]"`로 시작하는 에러 메시지를 출력한다.
 -[x]`Exception`이 아닌`IllegalArgumentException, IllegalStateException`등과 같은 명확한 유형을 처리한다.
-[x] 사용자가 잘못된 값을 입력해 에러가 발생하면, 에러 발생 시점부터 입력을 다시 받는다.
