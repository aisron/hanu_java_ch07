package ch07_03;

// abstract > 상속전용 
public abstract class Phone {  // 추상클래스

	// 객체를 못만듬
	// 추상메소드를 사용 가능 - 중요

	
	// 필드
	String owner;


	
	// 기본 생성자 > 초기화를 위해서 만듬 : 
	public Phone() {
		super();
	}



	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상메소드
	public abstract int powerType();
	// 1) 추상메소드는 추상클래스 내에서만 선언 가능하다
	// 2) 추상메소드는 메소드의 내용이 없다 {} 이거 필요 없음. 있으면 에러남
 	// 3) 반드시 오버라이딩을 해야 한다. 안하면 자식 클래스에 must implement 에러뜸
	// 4) 자식클래스에 에러에 자동으로 오버라이딩 선택해서 만들것
}
