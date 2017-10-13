package javastudy;

public class MathExam {

	public static void main(String[] args) {
		//큰값
		int value1 = Math.max(5, 30);
		System.out.println(value1);
		
		//작은값
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		//절대값
		System.out.println(Math.abs(-10));
		
		//랜덤값구하기(0~1 사이)
		System.out.println(Math.random());
		
		//제곱근구하기
		System.out.println(Math.sqrt(25));

	}

}
