package javastudy;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켬");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끔");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨바꿈");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널바꿈");
	}

}
