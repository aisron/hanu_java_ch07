package ch08_01;

public interface RemoteControl {
	
	// 상수
	public int MAX_VOLUME =10;  // 상수 선언
	public int MIN_VOLUME =10;
	
//	추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
}
