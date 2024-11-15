package ch08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television();
		Audio audio = new Audio();
		tv.setVolume(70);
		audio.turnOn();
		
		// 인터페이스는 선언만 가능 (메모리에 인스턴스 만들언지는 것은 아님)
		RemoteControl rcontrol;
		
//		rControl =tv;
//		rControl =audio;
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
	}

}
