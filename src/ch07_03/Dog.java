package ch07_03;

public class Dog extends Animal {

	//기본 필드 생성자
	public Dog() {
		super();
	}
	
	// 부모호 출
	public Dog(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound = "멍멍";
		return sound;
	}

}
