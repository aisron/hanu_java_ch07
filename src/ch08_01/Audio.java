package ch08_01;

public class Audio implements RemoteControl {
	
	//필드
	private int volume;
	
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else if(volume <RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
