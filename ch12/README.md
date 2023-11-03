# Chapter12 Generics, Enum, Annotation

## Generics
- 컴파일 시 타입을 체크해 주는 기능(compile-time type check) – JDK1.5
- 객체의 타입 안정성을 높인다.
- 타입체크와 형변환의 번거로움을 줄여줌
- 단, static 멤버에는 타입변수 T를 사용할 수 없다.
- 단, 제네릭 타입의 배열 T를 생성할 수 없다.

```java
import java.util.List;

class Bax<T> {
  T item;

  void setItem(T item) {
    this.item = item;
  }

  T getItem() {
    return item;
  }

  static <T> void sort(List<T> list) {}
}
```

### 기타 Generics
1. T extends : 특정 타입의 자손들만 가능
2. ? : 여러 타입을 대입가능

<br>

## Enum
- 관련된 상수들을 같이 묶어 놓은 것
- 열거형의 생성자는 묵시적으로 private (외부에서 객체 생성 불가)

<br>

## Annotation
- 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
- 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다. ex. @Override
- 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME이다. ex. @FunctionalInterface

### @interface
- 애너테이션의 메서드는 추상메서드이며, 애너테이션을 적용할 때 모두 지정해야한다.(순서 상관없음)
- 적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정 가능(null제외)
- 요소가 하나일 때는 요소의 이름 생략가능
- 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용됨

```java
import java.lang.annotation.*;
// java 에서 제공하는 표준 어노테이션
@Override // 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
@Deprecated // 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
@SuppressWarnings // 컴파일러의 경고메시지가 나타나지 않게 억제한다.
@SafeVarargs
@FunctionalInterface // 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음

// 메타 어노테이션 
@Target // 적용할 수 있는 대상의 지정에 사용
@Documented //  javadoc으로 작성한 문서에 포함
@Inherited // 애너테이션을 자손 클래스에 상속
@Retention // 애너테이션이 유지(retention)되는 기간을 지정하는데 사용 (SOURCE, CLASS, RUNTIME)
@Repeatable // @Repeatable이 붙은 애너테이션은 반복해서 붙일 수 있다.
@Native // native메서드에 의해 참조되는 상수에 붙이는 애너테이션
```
