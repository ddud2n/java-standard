# Chapter13 Thread

## 프로세스와 쓰레드 (process & thread)
- 프로세스 : 실행 중인 프로그램, 자원(resources)과 쓰레드로 구성
- 쓰레드 : 프로세스 내에서 실제 작업을 수행. 모든 프로세스는 하나 이상의 쓰레드를 가지고 있다.
- 싱글 쓰레드 VS 멀티 쓰레드


### 멀티 쓰레드의 장단점 
- 장점
  - 시스템 자원을 효율적으로 사용
  - 응답성 향상
  - 작업이 분리되어 코드가 간결
- 단점
  - 동기화에 주의해야 한다.
  - 교착상태가 발생할 수 있다.
  - 각 쓰레드가 효율적으로 고르게 실행시킬 수 있게 해야 한다.


```java

class MyThread extends Thread {
    public void run() {}
}

class MyThread2 implements Runnable {
    public void run() {}
}

// 쓰레드 생성, 실행
MyThread t1 = new MyThread();
t1.start();

Runnable r = new MyThread2();
Thread t2 = new Thread(r);
t2.start();
```


### 쓰레드 그룹
- 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것(보안상의 이유)
- 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야 한다.
- 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 ‘main 쓰레드 그룹’에 속한다.
- 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.


### 데몬 쓰레드
- 일반 쓰레드(non-daemon thread)의 작업을 돕는 보조적인 역할을 수행.
- 일반 쓰레드가 모두 종료되면 자동적으로 종료된다.
- 가비지 컬렉터, 자동저장, 화면자동갱신 등에 사용된다.
- 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.


<br>

## 쓰레드의 실행제어
- 쓰레드의 실행을 제어(스케줄링)할 수 있는 메서드가 제공된다.
- 단, resume(), stop(), suspend()는 쓰레드를 교착상태로 만들기 쉽기 때문에 deprecated되었다.
- yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.

```java
void start() // 쓰레드 생성 
static void sleep(long mills) // 현재 쓰레드를 지정된 시간동안 일시정지한다. 그 후, 실행 대기
void join(long mills) // 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다. 지정된 시간이 지나면 join을 호출한 쓰레드로 돌아와 수행한다.
void interrupt() // sleep, join 에 의해 일시정지 상태의 쓰레드를 깨워서 실행대기상태로 만든다. 이때, InterruptException이 발생한다.
void suspend() // 쓰레드 일시정지
void resume() // suspend 된 쓰레드를 실행 대기상태로 만든다.
void stop() // 쓰레드 종료
static void yield() // 자신에게 주어진 시간을 사용하지 않고 다른 쓰레드에게 양보한다. 그 후, 실행 대기


```
<br>

## 쓰레드 동기화




<br><br>

### 참고
Blocking VS Non-Blocking