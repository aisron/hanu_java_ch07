package ch07_01;

public class Triangle extends Shape{

	String name;
	int point;
	
	

	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override  // annotation어노테이션  오버라이딩 한거라고 표시
	void area() {  // 부모클래스에 있는 것을 재작성 < 오버라이딩
		// TODO Auto-generated method stub
		// 바꿀 내용 작성
		System.out.println(width * height * 0.5);	

	}
	
	void areaSuper() {
		super.area(); //부모 area() 메서드 호출  
	}
	
	
	
	
}
