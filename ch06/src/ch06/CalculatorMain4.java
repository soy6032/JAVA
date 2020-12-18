package ch06;

public class CalculatorMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator8 cal8 = new Calculator8();
		System.out.println("가로가 10인 정사각형의 넓이는 : " + cal8.areaRectangle(10));
		System.out.println("가로가 10이고, 세로가 5인 직사각형의 넓이 : " + cal8.areaRectangle(10, 5));

		
		System.out.println("------오버로딩------");
		
		Calculator9 cal9 = new Calculator9();
		
		System.out.println("정수 2개를 입력하는 덧셈 : " + cal9.plus(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 덧셈 : " + cal9.plus(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 덧셈 : " + cal9.plus(10.0, 5));
		System.out.println("실수 2개를 입력하는 덧셈 : " + cal9.plus(10.0, 5.0));
		
		System.out.println("------문제1------");
		
		Calculator10 cal10 = new Calculator10();
		System.out.println("정수 2개를 입력하는 덧셈 : " + cal10.plus(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 덧셈 : " + cal10.plus(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 덧셈 : " + cal10.plus(10.0, 5));
		System.out.println("실수 2개를 입력하는 덧셈 : " + cal10.plus(10.0, 5.0));
		
		System.out.println("정수 2개를 입력하는 뺄셈 : " + cal10.minus(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 뺄셈 : " + cal10.minus(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 뺄셈 : " + cal10.minus(10.0, 5));
		System.out.println("실수 2개를 입력하는 뺄셈 : " + cal10.minus(10.0, 5.0));
		
		System.out.println("정수 2개를 입력하는 곱셈 : " + cal10.mul(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 곱셈 : " + cal10.mul(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 곱셈 : " + cal10.mul(10.0, 5));
		System.out.println("실수 2개를 입력하는 곱셈 : " + cal10.mul(10.0, 5.0));
		
		System.out.println("정수 2개를 입력하는 나눗셈 : " + cal10.div(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 나눗셈 : " + cal10.div(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 나눗셈 : " + cal10.div(10.0, 5));
		System.out.println("실수 2개를 입력하는 나눗셈 : " + cal10.div(10.0, 5.0));
		
		System.out.println("정수 2개를 입력하는 나머지 : " + cal10.rest(10, 5));
		System.out.println("정수 1개와 실수 1개를 입력하는 나머지 : " + cal10.rest(10, 5.0));
		System.out.println("실수 2개와 정수 1개를 입력하는 나머지 : " + cal10.rest(10.0, 5));
		System.out.println("실수 2개를 입력하는 나머지 : " + cal10.rest(10.0, 5.0));
		
		
		
		
		
		
		System.out.println("------문제2------");
		
		Calculator11 cal11 = new Calculator11(10, 5);
		
		cal11.plus(10, 10);

	}

}
