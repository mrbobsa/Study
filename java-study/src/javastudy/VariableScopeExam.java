package javastudy;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
//		System.out.println(value2);

		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
//		static하게 선언된 변수는 변수를 저장할 공간이 하나뿐, StaticVal은 클래스변수라고 불린다. v1, v2가 값이 하나로 표시되는 것을 확인 할 수 있다.
//		따라서 위에 써 놓은 두 줄처럼 사용하는 것보다 아래에 써 놓은 것처럼 사용하는 것이 바람직하다. 
		System.out.println(VariableScopeExam.staticVal);
		
	}

}
