package ch06;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator(); //Calculator 클래스를 myCal 변수의 객체생성
		myCal.powerOn();//Calculator 클래스의 멤버 메소드 powerOn()을 실행
		
//		정수형 변수 result를 선언하고 Calculator클래스의 멤버 메소드 plus()를 실행
//		매개변수 5, 6을 넘겨줘서 실행
		int result = myCal.plus(5, 6);
		System.out.println("result = " + result);
		
		int minusResult = myCal.minus(5, 6);
		System.out.println("minusResult = " + minusResult);
		
		int multipleResult = myCal.multiple(5, 6);
		System.out.println("multipleResult = " + multipleResult);
		
//		멤버 변수가 아닌 그냥 일반 변수
		byte x = 10;
		byte y = 4;
//		myCal의 멤버 메소드 divide() 실행
//		매개변수 x, y 2개를 가지고 실행
//		divide()메소드는 매개변수로 int 타입의 변수 2갸 받으나 실제로 넘겨줌 x, y는 byte 타입이었음
//		int 타입은 byte 타입보다 데이터 타입의 크기가 크기때문에 byte타입은 int 타입으로 자동타입변환이 발생함.
		
		double dResult = myCal.divide(x, y);
		
		System.out.println("dResult = " + dResult);
		
		myCal.powerOff();
		
		
	}

	
	
}


//문제1) Calculator클래스를 수정하여 곱하기, 빼기 메소드를 생성하고 사용하는 프로그램을 작성하세요

//곱하기 메소드명 : multiple
//빼기 메소드명 : minus

//문제2) Calculator2 클래스를 생성하고, 사칙연산을 위한 멤버변수 x, y와 멤버 메서드
//plus, minus, multi, div 를 선언하고, 데이터를 입력하기 위한 멤버메서드 setting() 
//출력전용 메소드 printer()를 만들어서 사칙연산을 진행하는 프로그램
// 생성할 멤버변수 : x, y
// 생성할 메소드: plus, minus, multi, div, setting, printer
//setting, printer만 매개변수가 존재, 나머지는 매개변수 없음
//plus, minus, multi, div는 멤버변수를 이용해서 연산
//결과는 printer 메소드를 이용해서 결과출력
//멤버변수 x, y를 가지고 사칙연산
