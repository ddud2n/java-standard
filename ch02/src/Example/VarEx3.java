package Example;

class VarEx3 {
	int i;	
	public static void main(String[] args) {
		// 초기화 하지 않은 전역변수 읽기
		VarEx3 var = new VarEx3();
		System.out.println(var.i);
	}
}