package javastudy;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//java8 부터 default를 쓰면 메소드 구현이 가능!
	default int exec(int i, int j) {
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
