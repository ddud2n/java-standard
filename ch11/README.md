# Chapter11 Collection framework

## collections framework
- 컬렉션(다수의 객체)을 다루기 위한 표준화된 프로그래밍 방식
- 다수의 데이터를 저장할 수 있는 클래스(예, Vector, ArrayList, HashSet)

## 핵심 인터페이스

### 1. List
* 순서 O 
* 중복 O
* ex. ArrayList, LinkedList(Queue), Vector(Stack)

### 2. Set
* 순서 X
* 중복 X
* ex. HashSet, SortedSet(TreeSet)

### 3. Map
* 키-값 순서 X
* 키 : 중복 X
* 값 : 중복 O
* ex. HashMap, TreeMap, hashtable, Properties

<br>

## ArrayList VS Vector
- ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일
- Vector는 자체적으로 동기화처리가 되어 있으나 ArrayList는 그렇지 않다.
- 장점
  - 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근 시간)이 짧다.
  - 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.
- 단점
  - 크기를 변경할 수 없다.
  - 크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야함.
  - 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비됨.
  - 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다. (대안 : LinkedList)

### Iterator
- 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
- iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용.

```java
while(it.hasNext()) {
    System.out.println(it.next());
        }
```

<br>

## HashSet VS TreeSet
- HashSet : Set인터페이스를 구현한 대표적인 컬렉션 클래스
  - 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.
  - HashMap 을 이용해서 구현
- TreeSet : 범위 검색과 정렬에 유리한 컬렉션 클래스
  - 범위 검색과 정렬에 유리한 이진 검색 트리(binary search tree)로 구현
  - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림(반복적인 비교 후 저장)
  - TreeMap 을 이용해서 구현
- 같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
- 이 때 저장할 객체의 equals()와 hashCode()를 호출 (오버라이딩 필수)


<br>

## HashMap VS TreeMap
- HashMap(동기화X)
  - Hashtable(동기화O)의 새로운 버전
  - Map인터페이스를 구현한 대표적인 컬렉션 클래스
  - 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
  - 순서를 유지하려면, LinkedHashMap클래스를 사용하면 된다.
  - 해시함수(hash function)로 해시테이블(hash table)에 데이터를 저장, 검색
  - 해시테이블은 배열과 링크드 리스트가 조합된 형태
- TreeMap
  - 범위 검색과 정렬에 유리한 컬렉션 클래스
  - HashMap보다 데이터 추가, 삭제에 시간이 더 걸림
  - 이진 검색 트리의 구조로 키와 값의 쌍으로 이루어진 데이터를 저장

<br>

## 기타 메서드

```java
fill()
copy()
sort()
binarySearch()
synchronized***() // 컬렉션 동기화
unmodifiable***() // immutable 
singleton***() // 싱글톤 컬렉션
checked***() // 한 종류의 객체만 저장

```