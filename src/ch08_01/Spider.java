package ch08_01;

// interface는 extends로  상속x > implements로 구현o
public class Spider implements Monster{
	// implements 해주고
	// 에러에 오버라이딩 해줌
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("거미 뜀");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("거미 걸음");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거미줄 공격");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날지 못함");
		
	}
	
}
