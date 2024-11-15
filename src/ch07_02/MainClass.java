package ch07_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
	
		KumhoTire kumhoTire = new KumhoTire();
		HankookTire hankookTire = new HankookTire();
		
		car.tire1 = kumhoTire; // 필드의 다향성
		car.tire2 = kumhoTire;
		car.tire3 = hankookTire;
		car.tire4 = hankookTire; 
		
		Driver1 driver1 = new Driver1();
		Driver2 driver2 = new Driver2();
		
		car.dirver(driver1); //매개변수의 다향성
		car.dirver(driver2);
	}

}
