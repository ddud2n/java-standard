package Exercise;

/* Exercise 12-2. 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때,
 * 이 메서드를 올바르게 호출한 문장을 모두 고르시오.
 * (Apple 과 Grape 는 Fruit 의 자손이라고 가정하자.)
 * 
 * [보기]
 * a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
 * b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
 * c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
 * d. Juicer.makeJuice(new FruitBox<Apple>());
 * e. Juicer.makeJuice(new FruitBox<Object>());
 *
 * [정답] c, d
 */
class Juicer {
	static <T extends Fruit> String makeJuice(FruitBox<T> box) {
		String tmp = "";
		for (Fruit f : box.getList()) {
			tmp += f + " ";
		}
		return tmp;
	}
}