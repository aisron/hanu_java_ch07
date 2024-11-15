package ch07_03;

//추상 클래스
public abstract class Animal {

	public String kind; // 동물 종류

	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	public Animal() {
		super();
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	
	// 추상메소드
	public abstract String sound();
	
}


// 추상 클래스인 Animal을 상속 받는 Cat 클래스와 Dog 클래스를 만드시오
// 단, 부모 클래스의 kind를 초기화 하는 생성자를 클래스 내에 생성하시오