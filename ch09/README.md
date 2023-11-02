# Chapter09 lang 패키지

## Object Class
- 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다.
```
protected Object clone() // Cloneable인터페이스를 구현한 클래스의 인스턴스 복제 (단, 인스턴스 변수만 복제)
public boolean equals(Object obj) // 객체 자신과 obj 이 같은 객체인지 
protected void finalize() // 객체가 소멸될 떄 GC에 의해 자동 호출, 이 때 수행되어야 하는 코드가 있는 경우에 오버라이딩된다.
public Class getClass() // 객체 자신의 클래스 정보를 담고있는 Class 인스턴스 반환
public int hashCode() // 객체 자신의 해시코드
public String toString() // 객체 자신의 정보를 문자열로 반환
public void notify() // 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.
public void notifyAll() // 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.
public void wait() // 다른 쓰레드가 notify 할 때까지 무한히 기다린다.
public void wait(long timeout)
public void wait(long timeout, int nanos)
```

### equals()
- Object 클래스에 정의된 equals()는 참조변수 값(객체의 주소)을 비교한다. = 동일성 (==)
- equals()를 오버라이딩해서 인스턴스변수의 값을 비교하도록 바꾼다. = 동등성

### hashCode()
- Object클래스의 hashCode()는 객체의 내부주소를 반환한다.
- equals()를 오버라이딩하면, hashCode()도 같이 오버라이딩 해야한다.
- equals()의 결과가 true인 두 객체의 hash code는 같아야 하기 때문

### getClass()
- Class 객체는 클래스의 모든 정보를 담고 있으며, 클래스당 단 1개만 존재
- 클래스파일(*.class)이 메모리에 로드될때 생성된다.

<br>

## String Class
- String 인스턴스의 내용은 바꿀 수 없다.(immutable) 변경할 때마다 재할당
- final로 저장되기 때문에, GC에 의해 정리된다.
- String str = “abc”; 와 String str = new String(“abc”); 비교
```java
String str1 = “abc”; 
String str2 = “abc”; // 동등 O , 동일 O
String str3 = new String(“abc”);
String str4 = new String(“abc”); // 동등 O , 동일 X
```

## String Buffer & String Builder Class
- String 클래스와 달리 내용을 변경할 수 있다.(mutable)
- 인스턴스를 생성할 때 버퍼(배열)의 크기를 충분히 지정해주는 것이 좋다.
- String클래스와 달리 equals()를 오버라이딩하지 않았다.

<br>

## Wrapper Class
- 기본형을 클래스로 정의한 것. 기본형 값도 객체로 다뤄져야 할 때가 있다.
- 내부적으로 기본형(primitive type) 변수를 가지고 있다.
- 값을 비교하도록 equals()가 오버라이딩되어 있다.

* Object
    * Boolean
    * Character
    * Number
        * Byte
        * Short
        * Integer
        * Long
        * Float
        * Double
        * BigInt
        * BigDecimal


<br><br>
### 참고
* [equals VS hashCode](https://mangkyu.tistory.com/101)
* [Hash 코드와 31](https://velog.io/@indongcha/hashCode%EC%99%80-31)
* [String, String Buffer, String Builder](https://inpa.tistory.com/entry/JAVA-%E2%98%95-String-StringBuffer-StringBuilder-%EC%B0%A8%EC%9D%B4%EC%A0%90-%EC%84%B1%EB%8A%A5-%EB%B9%84%EA%B5%90)
* [Wrapper Class](https://inpa.tistory.com/entry/JAVA-%E2%98%95-wrapper-class-Boxing-UnBoxing)