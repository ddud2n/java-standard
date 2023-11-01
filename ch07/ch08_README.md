# Chapter08 예외처리

## 프로그램 오류
- 컴퍼일 에러
- 런타임 에러
  - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 에러
  - 예외 : 프로그램 코드에 의해 수습될 수 있는 미약한 에러
  

## try-catch-finally
- 일치하는 Catch 문 발견 시, 수행 후 try-catch 블록을 빠져나간다.
- 예외의 최고 조상인 Exception을 처리하는 catch블럭은 모든 종류의 예외를 처리할 수 있다.(반드시 마지막 catch블럭이어야 한다.)
- finally : try 또는 catch블럭에서 return문을 만나도 finally블럭은 수행된다.

## 예외 클래스 계층구조 ⭐️
- Object
  - Throwable
    - Error
      - OutOfMemoryError
      - StackOverFlowError
    - Exception
      - ClassNotFoundException : 외적인 요인 (예외처리 선택)
      - IOException : 외적인 요인 (예외처리 선택)
      - RuntimeException : 프로그래머의 실수 (예외처리 필수)
        - ArithmeticException
        - ClassCastException
        - NullPointerException
        - IndexOutOfBoundException
