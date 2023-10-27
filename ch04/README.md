# Chapter02 조건과 반복

## 조건문
### 1. if else
```java
        if () {} 
        else if() {} 
        else {}
```

### 2. switch
```java
        switch() {
            case 값1: {} break;
            case 값2: {} break;
            case 값3: {} break;
        }
```

## 반복문
### 1. for
```java
        for(int i = 0; i < 10; i++) {
            변수 i 가 유효한 경우
        }
```

### 2. while
```java
        while(조건) {
            조건이 유효한 경우
        }
```

### 3. do while
```java
        do {
            조건이 유효한 경우
        } while(조건)
```
    - 조건식의 계산결과가 int범위 이하의 정수만 가능
    - break문이 없으면 switch문의 끝까지 진행한다.

### 4. break, continue
    - break : 반복, switch 나오기
    - continue : 반복의 끝으로 이동

