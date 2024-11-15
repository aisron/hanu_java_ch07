package ch07_01;

// 상속 extends 클래스이름
public class DmbCellPhone extends CellPhone{

	// 필드
	int channerl;
	
	// 기본생성자
	public DmbCellPhone() {
		super();
	}
	
	// 생성자
	public DmbCellPhone(String model, String color, int channerl) {
		super(model, color);  // 부모 클래스 생성자 호출, 인수값을 넣어줌 <- 권장방법
//		this.model = model;  // 부모로부터 물려받은 필드 -> 본인것은 아니지만 부모것을 본인것 처럼 this.이 사용가능
//		this.color = color;  // 부모로부터 물려받은 필드 -> 본인것은 아니지만 부모것을 본인것 처럼 this.이 사용가능
		this.channerl = channerl;
	}
	

	
	
	//메소드
	void turnOnDmb() {
		System.out.println("dmb 전원을 켭니다.");
	}

	void turnOffDmb() {
		System.out.println("dmb 전원을 끕니다.");
	}
	void changeChannel() {
		System.out.println("dmb 채널을 변경합니다.");
	}
	
	
}
