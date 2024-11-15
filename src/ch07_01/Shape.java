package ch07_01;

// class 앞에 final 작성시 상속불가 상태
// public final class Shape { } 
public class Shape {

	// 필드
	int width;
	int height;
	String color;
	
	// 기본 생성자 <-생성자 오버로딩 할 때 만들어두면 에러방지
	public Shape() {
		super();
	}

	// 필드 생성자
	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}




	// 메소드
	void area() {
		System.out.println( width * height);
	}

	final void color() {  // final 사용시 -> 오버라이딩 불가 메소드 선언
		System.out.println(color);
	}
	
}
