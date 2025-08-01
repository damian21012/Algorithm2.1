# Java Stream API 기능 정리

Java Stream API는 컬렉션이나 배열을 **함수형 방식으로 처리**할 수 있도록 도와주는 도구입니다. 반복문을 줄이고, 선언적이고 간결한 코드 작성을 가능하게 합니다.

---

## 1. 스트림 생성

| 방법 | 예시 |
|------|------|
| 배열 → 스트림 | `Arrays.stream(new int[]{1, 2, 3})` |
| 컬렉션 → 스트림 | `list.stream()` |
| 직접 생성 | `Stream.of("a", "b", "c")` |

---

## 2. 중간 연산 (중간에 데이터를 변형 또는 필터링)

| 메서드 | 설명 | 예시 |
|--------|------|------|
| `filter(Predicate)` | 조건에 맞는 요소만 통과 | `stream.filter(x -> x > 0)` |
| `map(Function)` | 각 요소를 변형 | `stream.map(x -> x * 2)` |
| `mapToInt()` | 요소를 int로 변환 | `stream.mapToInt(Integer::parseInt)` |
| `distinct()` | 중복 제거 | `stream.distinct()` |
| `sorted()` | 정렬 (기본/사용자 정의) | `stream.sorted()` |
| `limit(n)` | 앞에서 n개만 선택 | `stream.limit(3)` |
| `skip(n)` | 앞에서 n개 건너뜀 | `stream.skip(2)` |

---

## 3. 최종 연산 (스트림을 실제로 실행)

| 메서드 | 설명 | 예시 |
|--------|------|------|
| `forEach()` | 각 요소에 작업 수행 | `stream.forEach(System.out::println)` |
| `collect()` | 리스트나 집합 등으로 수집 | `stream.collect(Collectors.toList())` |
| `toArray()` | 배열로 변환 | `stream.toArray()` |
| `count()` | 요소 개수 | `stream.count()` |
| `anyMatch()` / `allMatch()` / `noneMatch()` | 조건 일치 검사 | `stream.anyMatch(x -> x > 10)` |
| `findFirst()` / `findAny()` | 요소 하나 찾기 (Optional 반환) | `stream.findFirst().get()` |
| `reduce()` | 누적합, 누적곱 등 | `stream.reduce(0, (a, b) -> a + b)` |
| `min()` / `max()` | 최소/최대값 (Optional 반환) | `stream.max().getAsInt()` |
| `summaryStatistics()` | 개수, 합계, 평균, 최솟값, 최댓값 | `IntSummaryStatistics stat = stream.summaryStatistics()` |

---
