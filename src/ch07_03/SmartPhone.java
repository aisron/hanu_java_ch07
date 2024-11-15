package ch07_03;

public class SmartPhone extends Phone {

	
//	기본 생성자
	public SmartPhone() {
		super();
	}

	// 문자열을 받아서 부모에게
	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

//	@Override  // 추상메서드를 위의 자식 클래스에서에서 선택하여 자동으로 오버라이딩해서 만듬
//	public void powerType() {
//		// TODO Auto-generated method stub
//		System.out.println("전원타입은 C type입니다.");
//
//	}
	
	@Override  // int 타입의 경우
	public int powerType() {
		// TODO Auto-generated method stub
		System.out.println("전원타입은 C type입니다.");
		return 0;
	}


	
}
