package ch06;

public class Person {

	String name;
	float height;
	float weight;
	
//	기본 생성자, 다른생성자를 사용했을 경우 기존 생성자가 자동으로 생성되지 않기 떄문에 필요한경우 직접 구형해야됨
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
		getValues();
	}
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		getValues();
	}
	
	public void getValues() {
		System.out.println("name : " + name + "\nheight : " +  height + "\nweight : "+ weight);
	}
	
}

// 문제 1) 자동차에 대한 정보를 저장할 수있는 클래스를 생성하여 자동차에 대한 정보를 출력하는 프로그램을 작성
//기본 생성자 1개
//자동차 정보 입력 메소드, 자동차 정보 출력 메소드
//클래스명 : Car , 실행클래스 CarMain
//회사명 모델명 연료(휘발류) 차종료(세단) 크기(경차), 색상, 가격
//날짜_문제번호_이름.zip

// 문제 2) 생성자 3개 this 사용 x 
// 문제 3) 생성자 여러개 this 사용










