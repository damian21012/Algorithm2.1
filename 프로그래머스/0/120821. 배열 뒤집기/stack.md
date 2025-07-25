# 배열 뒤집기 (Using Stack)

이 프로젝트는 정수 배열을 스택을 이용해 뒤집는 간단한 문제를 다룹니다.  
**스택(Stack)** 자료구조의 핵심 개념인 **LIFO (Last In, First Out)** 구조를 직접 사용하여 배열을 역순으로 만드는 방식입니다.

---

## 문제 설명

주어진 정수 배열을 거꾸로 뒤집어서 반환하는 프로그램입니다.

예를 들어 `[1, 2, 3, 4, 5]`라는 배열이 주어지면, 결과는 `[5, 4, 3, 2, 1]`이 됩니다.

---

## 핵심 아이디어 – Stack의 LIFO 구조

**스택(Stack)** 은 **후입선출(LIFO)** 구조를 가진 자료구조입니다.

- 마지막에 들어간 데이터가 가장 먼저 나오는 구조입니다.
- 마치 접시를 쌓듯이, 나중에 올린 접시가 가장 먼저 빠져나옵니다.
- 데이터를 임시로 저장하고 순서를 뒤집거나, 되돌리기(Undo) 기능 등에 자주 사용됩니다.

이 프로젝트에서는 배열의 각 요소를 스택에 차례대로 넣은 다음, 하나씩 꺼내면서 새로운 배열에 저장함으로써 **원래 배열의 순서를 반대로 뒤집는 효과**를 냅니다.

---

## 요약

- 스택은 직관적이면서도 강력한 자료구조입니다.
- 배열을 역순으로 바꾸고 싶을 때, 스택의 LIFO 특성을 활용하면 쉽게 해결할 수 있습니다.
- 실생활 예시:
  - 웹 브라우저의 '뒤로 가기' 버튼
  - 텍스트 편집기의 Undo 기능
  - 괄호 짝 검사 및 계산기 구현 등

---

## 📎 관련 개념 정리

| 개념 | 설명 |
|------|------|
| Stack | 데이터를 나중에 넣은 순서대로 먼저 꺼내는 구조 (LIFO) |
| 배열 | 같은 자료형의 데이터를 순서대로 저장하는 고정 크기 자료구조 |
| push | 스택에 데이터를 넣는 연산 |
| pop | 스택에서 데이터를 꺼내는 연산 |

