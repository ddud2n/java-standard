package Exercise;/* Exercise 7-8. 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
 * [답]		public - protected - (default) - private
 * [해설]	접근 제어자가 사용될 수 있는 곳 : 클래스, 멤버변수, 메서드, 생성자
 *			private		: 같은 클래스 내에서만 접근 가능
 *			default		: 같은 패키지 내에서만 접근 가능
 *			protected	: 같은 패키지 내, 그리고 다른 패키지의 자손 클래스에서 접근 가능
 *			public		: 접근 제한 없음
 */