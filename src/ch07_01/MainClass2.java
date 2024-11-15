package ch07_01;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// 객체 에러 안나는 이유 각 클래스파일에 기본생성자 만들어줌
		Shape shape = new Shape();
		Square square = new Square();
		Triangle triangle = new Triangle(10, 20);

		// 부모는 자식의 모든 걸 받아준다.
		shape = square; // 대입성공
		//square = shape; // 대입실패
		shape = triangle;
		
//		부모타입     = 자식
		Shape shape2 = triangle;  // (객체의) 자동 타입 변환. 자식객체-> 부모객체
		shape2.area();  // 오버라이딩 되어 있으면 자식의 것이 호출된다 
		
		
	}

}
