package javastudy;

public class MyClass {
//	public 리턴타입 메소드명 ( 매개변수들 ) { 구현 }
	public void method1 () {
	//void는 비었다는 이야기. 리턴타입이 없다는 것을 의미. 
		System.out.println("m1이 실행됨.." ) ;
	}
	
	public void method2(int x) {
		 System.out.println(x + "를 이용한 m2실행");
	}
	
	public int method3() {
		System.out.println("m3실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "m4실행");
	}
	
	public int method5(int y) {
		System.out.println(y + "를 이용한 m5실행");
		return y*2;
	}
	
	
}
