# Chapter14 Lambda & Stream

## 람다식
- java 1.8 에서 새로이 추가
- 함수(메서드)를 간단한 ‘식(Expression)’으로 표현하는 방법

> 함수와 메서드의 차이?? <br>
> 근본적으로 동일. 함수는 일반적 용어, 메서드는 객체지향개념 용어 <br>
> 함수는 클래스에 독립적, 메서드는 클래스에 종속적

```java
(int a, int b) -> a > b ? a : b
```

### 주의사항
- 매개변수가 하나인 경우, 괄호() 생략가능(타입이 없을 때만)
- 매개변수의 타입이 추론 가능하면 생략가능(대부분의 경우 생략가능)
- 블록 안의 문장이 하나뿐 일 때, 괄호{}생략가능(끝에 ‘;’ 안 붙임)
- 단, 하나뿐인 문장이 return문이면 괄호{} 생략불가

## 함수형 인터페이스
- 람다식은 익명 함수? 사실은 익명 객체!!!
- 람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수의 타입은?
- 함수형 인터페이스 : 단 하나의 추상 메서드만 선언된 인터페이스
- 함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음.
```java
 interface MyFunction {
    public abstract int max(int a, int b);
}

MyFunction f = (a, b) -> a > b ? a : b; 
int value = f.max(3,5); // 실제로는 람다식(익명 함수)이 호출됨
```

### 함수형 인터페이스 예제
```java
Runnable.run() // 매개변수X, 반환값X
Supplier<T>.get() // 매개변수X, 반환값O
Consumer<T>.accecpt(T t) // 매개변수O, 반환값X
Function<T,R>.apply(T t) // 매개변수O, 반환값O
Predicate<T>.test(T t) //  매개변수O, Boolean
```

### 메서드 참조
```java
Function<String, Integer> f = Integer::parseInt;  // 메서드 참조
BiFunction<String,String,Boolean> f = String::equals; // 인스턴스 메서드 참조
```

<br>

## Stream
- java 1.8 에서 새로이 추가
- 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
- 스트림은 데이터를 읽을 뿐 변경하지 않는다
- iterator 처럼 일회용이다
- 촤종연산 전까지 중간연산이 수행되지 않는다(지연된 연산)


```java
List<Integer> list = Arrays.asList(1,2,3,4,5);
Stream<Integer> intStream  = list.stream(); // 컬렉션.
Stream<String>  strStream  = Stream.of(new String[]{"a","b","c"}); // 배열
Stream<Integer> evenStream   = Stream.iterate(0, n->n+2);  // 0,2,4,6, ...
Stream<Double>  randomStream = Stream.generate(Math::random);    // 람다식
IntStream      intStream    = new Random().ints(5); // 난수 스트림(크기가 5)
```
