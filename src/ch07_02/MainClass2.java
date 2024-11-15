package ch07_02;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver driver = new Driver();  // 부모클래스
		Driver driver1 = new Driver1();// 자식클래스
		
		
		driver = driver1;  // 부모는 자식의 모든 것을 받아준다.
		driver1 =(Driver1)driver; // 임시형변환
	}

}
