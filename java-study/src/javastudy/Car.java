package javastudy;

public class Car {
	//Ÿ�� �ʵ��
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0);
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
