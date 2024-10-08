<div align="center">

# 입부테스트 문제

</div>

> [!IMPORTANT]
>
> - 총 6문제로, 공통 문제 5개와 언어 문제 1개로 이루어져 있습니다.
> - a번부터 e번까지는 공통 문제로, **반드시** 풀어주셔야 합니다.
> - 언어 문제는 f1번 혹은 f2번이며, 필수가 아닙니다.
> - `Java`로 문제 풀이 시 **f1번** 을, `JavaScrpit`로 풀이 시 **f2번** 을 풀어주시면 됩니다.

> [!WARNING]
>
> 1. 대소문자, 오탈자, 들여쓰기(엔터) 및 띄어쓰기에 유의해주세요.
> 2. 모든 O와 X는 **대문자**입니다.
> 3. #으로 시작되는 문장은 주석입니다.

---

**a. 세 자리 정수를 입력 받아 역순으로 출력하는 프로그램을 작성하시오.**

> 실행 결과

```
# 입력
492

# 출력
294
```

**b. 사용자로부터 알파벳 문자 하나를 입력 받아서 a, e, i, o, u일 경우 O를 이 외의 문자일 경우 X를 출력하시오.**

> 실행 결과

```
# 입력
i

# 출력
O
```

```
# 입력
t

# 출력
X
```

**c. 해달 놀이방은 나이가 14세 이상 혹은 키가 160cm 이상이면 입장할 수 없다. 사용자로부터 나이와 키를 입력 받아 놀이방에 입장할 수 있는지를 판단하여 출력하는 프로그램을 작성하시오.**

> 실행 결과

```
# 입력 (나이, 키 순서대로 입력)
13
170

# 출력
X
```

```
# 입력 (나이, 키 순서대로 입력)
14
155

# 출력
X
```

```
# 입력 (나이, 키 순서대로 입력)
12
150

# 출력
O
```

**d. 양의 정수 n을 입력 받아 1부터 n까지의 합을 출력하는 프로그램을 작성하시오.**

- 단, 양의 정수가 아닐 경우 반복하여 입력 받아야 합니다.

> 실행 결과 (아래의 결과는 연속된 결과입니다.)

```
-5 # 입력
X # 출력
0 # 입력
X # 출력
10 # 입력
55 # 출력
```

**e. 입력한 달에 존재하는 날의 수를 출력하는 프로그램을 작성하시오.**

- 4, 6, 9, 11월은 30일까지, 2월은 윤년인 경우 29일, 평년인 경우 28일까지, 그 외의 달은 31일까지 존재한다.
- 년도가 4의 배수이지만 100의 배수는 아니거나, 400의 배수인 경우 윤년이다.

> 실행 결과

```
# 입력 (연도, 월 순서대로 입력)
2024
12

# 출력
31
```

```
# 입력 (연도, 월 순서대로 입력)
2000
2

# 출력
29
```

## ✏️ Java

**f1. 해달이의 방에는 에어컨이 없어 선풍기를 마련하려고 한다. 3가지 모델을 비교하여 가장 저렴한 가격의 선풍기를 구매하려고 한다. 세 모델의 가격을 입력 받은 후, 가장 저렴한 선풍기의 모델명을 출력하는 프로그램을 작성하시오.**

- 선풍기의 정보를 저장하는 Fan 클래스를 정의한다.
- Fan 클래스에는 모델명(model), 가격(price) 속성이 존재한다.
- 클래스의 필드는 private로 하고, getter와 setter를 통해 접근한다.

> 실행 결과

```
# 입력
A
130
B
89
C
107

# 출력
B
```

## ✏️ JavaScript

**f2. 해달 자료구조 시험에 학생 A, B, C가 응시한다. 학생 A, B ,C는 최대한 빨리 시험이 끝나길 원한다. 하지만 세 명 중 한 명이라도 마킹이 끝나지 않았다면, 시험을 종료할 수 없다. 제일 마지막으로 마킹을 끝낸다면 시험은 그 즉시 종료된다. 만약 학생 모두가 시험을 종료했지만 시험이 끝나지 않을 경우 지구는 멸망한다.**

예를 들어, A가 마킹하는데 소요되는 시간은 12분이다. B는 7분이 걸린다. C는 11분이 걸린다. 그렇다면 시험이 종료되기까지 12분이 소요된다.

- 학생 A, B, C의 마킹 시간은 랜덤하게 주어진다.
- 타이머가 적용된 문제입니다.
  - 종료 시각이 지나지 않았는데 시험이 종료될 경우 오답처리 됩니다.
  - 종료 시각이 지날 경우 오답처리 됩니다.
- 1초는 1000ms입니다.

> 실행 결과

A, B, C의 마킹 시간이 띄어쓰기로 차례대로 입력됩니다.

```jsx
// 입력
12 7 11

// 출력 ("시험이 종료되었습니다." 문장이 12초뒤에 출력되어야합니다.)
B 마킹
C 마킹
A 마킹
시험이 종료되었습니다.
```

```jsx
# 입력
1 2 10

# 출력
A 마킹
B 마킹
C 마킹
시험이 종료되었습니다.
```
