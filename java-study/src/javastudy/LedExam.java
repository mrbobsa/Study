package javastudy;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.turnOff();
		tv.changeVolume(39);
		tv.changeChannel(9);
	}

}
