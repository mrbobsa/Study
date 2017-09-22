package javastudy;

public class BizService {
	public void bizMethod(int i) throws BizException {
		System.out.println("비즈니스메소드시작");
		
		if (i < 0)
			throw new BizException("매개변수 i는 0이상이어야 합니다.");
		
		System.out.println("비즈니스메소드끝");
	}
}
