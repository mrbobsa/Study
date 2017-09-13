 package javastudy;

public class Truck extends Car {
	public Truck() {
		super("소방차"); //부모클래스의 생성자를 뜻한다. 굳이 쓰지 않아도 상속을 받으면 부모클래스도 함께 읽어온다.
						//부모클래스가 다른 값을 가리키면 직접 선언하여 가져와야한다.
		System.out.println("Truck의 기본생성자입니다."); 
	}

}
