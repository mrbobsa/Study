package javastudy;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
//추상클래스는 부모로서의 역할은 가능하지만 자체적으로 객체를 생성하는 것은 할 수 없음
//		Bird b = new Bird();
	}

}
