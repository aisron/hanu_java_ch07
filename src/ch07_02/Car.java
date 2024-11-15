package ch07_02;

public class Car {


	// 필드
	Tire tire1 = new Tire();
	Tire tire2 = new Tire();
	Tire tire3 = new Tire();
	Tire tire4 = new Tire();
	
	void run() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
		tire4.roll();
	}
	
	void dirver(Driver driver) {
		
	}
	
}
