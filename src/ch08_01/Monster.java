package ch08_01;

public interface Monster {

	
	// 상수 (고정값) 
	int health = 300; // 초기값 없는 필드 선언은 에러!
	// 생성자 x
	//
	
	// 메소드
	// 인터페이스 내에는 추상메소드만 선언가능!
	public void run(); //추상메서드
	public void walk(); //추상메서드
	public void attack(); //추상메서드
	public void fly(); //추상메서드

	
	
	
	
}


// 인터페이스 특징
// 1.인스턴스(객체) 생성 불가능(new 연산자 사용 X) - 상속 전용
// 2.상수만 선언 가능
// 3.추상메소드만 선언 가능
// 4.implements 로 구현