package ch06;

//메소드 오버로딩 : 하나의 이름으로 여러개의 메소드를 생성하는 방법
//조건 : 매개변수 타입, 개수, 순서 달라야함
public class Calculator8 {
	
	double areaRectangle(double width) {
		return width * width;
	}
	
//	매개변수 개수는 같으나 매개변수의 데이터 타입이 다르기 떄문에 오버로딩이 가능함
	int areaRectangle(int width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
//	매개변수 개수는 같으나 매개변수의 데이터 타입이 다르기 떄문에 오버로딩이 가능함	
	double areaRectangle(int height, int width) {
		return width * height;
	}
	
//	매개변수 개수는 같으나 매개변수의 데이터 타입이 다르기 떄문에 오버로딩이 가능함	
	double areaRectangle(int height, double width) {
		return width * height;
	}
//매개변수의 개수와 데이터 타입은 같으나 데이터 타입의 순서가 다르기 때문에 오버로딩 가능함
	double areaRectangle(double width, int height) {
		return width * height;
	}
	
	
	
	

}
