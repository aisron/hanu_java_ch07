package ch07_03;

public class Cat extends Animal{

	// 필드 생성자
	public Cat() {
		super();
	}
	
	
	public Cat(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		String sound ="야오오옹!";
		return sound;
	}

}
