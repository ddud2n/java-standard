# Chapter05 Array

## 배열
- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
- 연속적인 주소

### 배열 선언 & 생성
```java
    // 선언
    int[] arr1;
    int arr2[];
    // 생성 (0으로 초기화)
    arr1 = new int[5];
    // 초기화
    arr2 = new int[]{1, 2, 3, 4, 5};
    int[] arr3 = {1,2,3,4};
```

### 다차원 배열
```java
    // 선언
    int[][] arr1;
    int arr2[][];
    int[]arr3[];
    // 초기화
    arr1 = new int[5][3];
```

### 가변 배열
- 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정.
```java
    int[][] arr = new int[5][];
    arr[0] = new int[3];
```