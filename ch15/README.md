# Chapter15 입출력 IO

## 입출력
- `입출력(I/O)`이란?
  - 두 대상 간의 데이터를 주고 받는 것
- `스트림(stream)`이란?
  - 데이터를 운반(입출력)하는데 사용되는 연결통로
  - 하나의 스트림으로 입출력을 동시에 수행할 수 없다.(단방향 통신)
- 종류
  - 바이트기반 스트림 : `InputStream`, `OutputStream`
    - `FileInputStream(파일)`
    - `ByteArrayInputStream(메모리)`
    - `Piped(프로세스)`
    - `Audio(오디오)`
  - 문자기반 스트림 : `Reader`, `Writer`
    - `FileReader(파일)`
    - `String(메모리)` : CharArrayReader, CharArrayWriter와 비슷하다. StringWriter에 출력되는 데이터는 내부의 StringBuffer에 저장된다.
    - `PipedReader` : 프로세스(쓰레드)간의 통신(데이터를 주고 받음)에 사용한다.
  - 보조 스트림 : 자체적으로 입출력을 수행할 수 없다
    - `FilterInputStream` : 모든 바이트기반 보조스트림의 최고조상. 
    - `BufferedInputStream` : 입출력 효율을 높이기 위해 버퍼(byte[])를 사용
    - `DataInputStream` : 기본형 단위로 읽고 쓰는 보조스트림
    - `SequenceInputStream` : 여러 입력스트림을 연결해서 하나의 스트림처럼 다룰 수 있게 해준다.
    - `PrintStream` : 데이터를 다양한 형식의 문자로 출력하는 기능을 제공하는 보조스트림 ex. `System.out`과 `System.err`
    - `ObjectInputStream : 객체를 직렬화하여 입출력할 수 있게 해주는 보조스트림
    - `BufferedReader` : 입출력 효율을 높이기 위해 버퍼(char[])를 사용하는 보조스트림
    - `InputStreamReader` : 바이트기반스트림을 문자기반스트림처럼 쓸 수 있게 해준다. 인코딩(encoding)을 변환하여 입출력할 수 있게 해준다.

<br>

## 스트림 메서드

```java
// InputStream
int available()
abstract int read()
int read(byte[] b) // 0~255의 바이트 값을 읽어온다. 없으면 -1
int read(byte[]b, int offset, int len)
void close()
void mark(int readlimit)
void reset()
        
// OutputStream
void flush()
void close()
abstract void write(int b)
int write(byte[] b)
int write(byte[]b, int offset, int len)
```
<br>

## 표준입출력
- 콘솔(console, 화면)을 통한 데이터의 입출력을 `표준 입출력`이라 한다.
- JVM이 시작되면서 자동적으로 생성되는 스트림이다.
- `System.in`, `System.out`, `System.err`

<br>

## 직렬화
- 객체를 ‘연속적인 데이터’로 변환하는 것
- 객체를 저장하기 위해서는 객체를 직렬화해야 한다.
- 객체를 저장한다는 것은 객체의 모든 인스턴스변수의 값을 저장하는 것


