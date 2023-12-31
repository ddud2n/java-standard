package Exercise;/* Exercise 11-3. 다음 중 ArrayList에서 제일 비용이 많이 드는 작업은?
 * 단, 작업 도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다.
 *
 * [선택지]
 * a. 첫번째 요소 삭제
 * b. 마지막 요소 삭제
 * c. 마지막에 새로운 요소 추가
 * d. 중간에 새로운 요소 추가
 *
 * [답안] a
 * 배열의 첫번째 요소를 삭제하면 나머지 모든 요소들을 한 칸씩 앞으로 이동시켜야 하기 때문에 비용이 많이 든다.
 */