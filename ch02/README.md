# Chapter02 Variable

### 변수, 상수, 리터럴
- 변수(variable) : 하나의 값을 저장하기 위한 공간
- 상수(constant) : 한 번만 값을 저장할 수 있는 공간
- 리터럴(literal) : 그 자체로 값을 의미하는 것

## 변수 타입
### 1. 기본형 (Primitive type)
    실제값을 저장 ( 총 8개 )
    
    - 논리형 : Boolean(1)
    - 문자형 : char(2)
    - 정수형 : byte(1), short(2), int(4), long(8)
    - 실수형 : float(4), double(8)

    * 정수형과 실수형은 음수/양수 표현을 위한 1bit 존재
    * 0(false) 으로 초기화

### 2. 참조형 (Reference type)
    기본형을 제외한 나머지
    객체주소 저장 (4 byte, 0x00000000~0xffffffff)

    * null 로 초기화


## 명명 규칙
1. 클래스 첫글자는 대문자 
2. Camel 규칙 적용
3. 상수는 대문자만 적용 ex. MAX_NUMBER
4. 특수문자는 _ 와 $ 만 허용


## 리터럴 접미사
```java
char ch1 = ‘A’;
char ch2 = ‘\u0041’;
char ch2 = 96;
char tab = ‘\t’;
        
byte b = 127;
short s = 32767;
int i = 100;
int hex = 0x100;

long l = 10000000000L;
float f1 = 3.14f;
float f2 = 3.14e3f;
double d = 3.14d;
```


## 정수 오버플로우
정수의 수 범위를 주의해야 한다.


## 형변환
논리형을 제외한 7개의 기본형은 서로 형변환 가능함
```java
float f = 1.6f;
int i = (int)f; // (작은 범위 형) 큰 범위 상수 
double d = f; // 형변환 생략가능
```

<br>

## 주의사항
- [실수 부동 소수점](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%8B%A4%EC%88%98-%ED%91%9C%ED%98%84%EB%B6%80%EB%8F%99-%EC%86%8C%EC%88%98%EC%A0%90-%EC%9B%90%EB%A6%AC-%ED%95%9C%EB%88%88%EC%97%90-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)



