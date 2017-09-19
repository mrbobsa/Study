package javastudy;

public class BusExam2 {

	public static void main(String[] args) {
		//부모 타입으로 자식 타입을 가리킬 순 있으나 사용할 수는 없다. 부모가 갖고 있는 내용만 사용 가능.
		Car2 c = new Bus2();
		c.run();
//		c.ppangppang();

		Bus2 bus = (Bus2)c;
		bus.run();
		bus.ppangppang();
	}

}
