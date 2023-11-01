# Chapter08 예외처리

## 프로그램 오류
- 컴퍼일 에러
- 런타임 에러
  - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 에러
  - 예외 : 프로그램 코드에 의해 수습될 수 있는 미약한 에러
  

## try-catch
- 일치하는 Catch 문 발견 시, 수행 후 try-catch 블록을 빠져나간다.

## 예외 클래스 계층구조
- Object
  - Throwable
    - Error
      - OutOfMemoryError
      - StackOverFlowError
    - Exception
      - RuntimeException
        - NullPointerException
        - ClassCastException
      - ArithmeticException
      - ClassCastException
      - NullPointerException
      - IndexOutOfBoundException
      - IOException
