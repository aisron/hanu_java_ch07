package ch07_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      부모타입    = 인스턴스(객체)
//		Phone phone = new Phone(); 추상클래스는 인스턴스(객체)로 만들 수 없다.
		
		
//		추상클래스(부모)는 객체 못 사용 하지만,
//		자식클래스는 사용 
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.turnOn();
		smartPhone.internetSearch();
	
		
	}

}
