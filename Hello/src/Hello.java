
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, welcome to the java world!!");
		
		//변수의 선언 및 사용
		int x = 1;
		int y = 2;
		int result = x + y;
		
		System.out.println(result);
		
//		변수의 데이터 타입 교차 사용 불가
		int num = 100;
		System.out.println(num);
		
//		int타입으로 선언단 변수에 다른 타입의 데이터를 입력할 수 없음
//		num = "문자열";
//		System.out.println(num);
		
//		변수를 사용시 반드시 초기화하고 사용해야 함
//		초기화를 하지 않을 경우 오류가 발생
//		선언만 미리하고 사용 전에 초기화 작업을 진행하면 문제 없음
//		int value;
////		초기화하지 않고 바로 사용
//		int result2 = value + 10;
//		System.out.println(result2);
		
//		변수를 초기화하지 않고 바로 사용 시 오류 발생
//		int value2;
//		System.out.println(value2);
		
		int var1 = 10;
		
		System.out.println("main 함수에서 선언한 변수 var1의 값: " + var1);
		
		if(true) {
			int var2 = 20;
			System.out.println("if문에서 선언한 변구 var2의 값: " + var2);
		}
		
//		var2는 if문의 코드블록에서 선언되었기 때문에 if문의 코드블럭 밖에서 사용할 수 없음
//		if문의 코드블럭을 벗어나면 if문에서 선언되었던 변수는 자동적으로 메모리에서 삭제됨
//		System.out.println(var2);
		
		for(int i = 0; i < 1; i++) {
			int var3 = 30;
			System.out.println("for문에서 선언한 변수 var3의 값: " + var3);
		}
		
//		변수는 동일한 이름을 사용할 수 없음
		int name = 100;
		System.out.println(name);
		
		dataType();
//		문자 타입 예제 charEx1 실행
		charEx1();
		charEx2();
		dataType2();
		dataType3();
	}
	
	public static void dataType() {
		System.out.println("-----dataType-----");
		
//		byte 타입은 -128 ~ 127까지의 숫자만 저장이 가능
//		이 수치를 넘어서는 숫자는 정상적으로 저장되는 것을 보장하지 않음
		byte b = (byte)-129;
		System.out.println("tyte 변수 b: " + b);
		
//		char 타입은 숫자를 저장하기도 하지만 문자를 저장하기 위한 데이터 타입,
//		ASCII코드를 저장하기 위한 타입
//		char 타입에 문자를 저장할 경우 ' ' 를 사용해야 함
//		java는 문자 타입과 문자열 타입이 따로 존재하기 때문에 ''는 문자 타입에 사용하고
//		" "는 문자열 타입에 사용함
		char c = 100;
		
		System.out.println("char 변수 c : " + c);
		char c1 = 10;
		char c2 = (char)(c + c1);
		System.out.println("char 변수 c1 : " + c2);
		
		short s = 32767;
		System.out.println("short 변수 s : " + s);
		
//		int 타입은 정수 타입의 기본 자료형임
//		정수의 연산은 int 타입으로 연산이 진행됨
		int i = 1000;
		System.out.println("int 변수 i : " + i);

//		int 타입으로 표현할 수 없을 경우 사용하는 데이터 타입
//		long 타입 변수에 테이터를 저장할 경우 데이터의 끝에 L을 붙여줘야 함
//		접미사 L을 붙이지 않을 경우 int 타입으로 인식
		long l = 2200000000L;
		System.out.println("long 변수 l : " + l);
		
	}
	public static void dataType2() {
		
		System.out.println("-----dataType2-----");
		
//		float, double는 실수형(부동소숫점) 데이터를 저장하기 위한 데이터 타입
//		float 타입은 데이터 저장 시 반드시 접미사 f를 입력해야함
		float f = 0.1f;
		System.out.println("float 변수 f : " + f);
		
//		double 타입은 실수형 숫자의 기본 타입이기 때문에 접미사를 사용하지 않아도 됨
//		double 타입과 float 타입의 연산 시 double 타입으로 변환된 후 연산됨
//		정수의 연산 시 int 타입으로 변환 후 연산됨
		double d = 0.1;
		System.out.println("double 변수 d : " + d);
	}
	
	public static void dataType3() {
		System.out.println("-----dataType3-----");
		
//		boolean 타입은 true, false 만 저장 가능한 타입
		
		boolean bool = true;
		System.out.println("boolean 변수 bool : " + bool);
	}
	
	public static void charEx1() {
		System.out.println("-----charEx1-----");
		
//		char 타입은 문자를 저장하기 위한 타입
		char ch1 = 'A';//문자 저장
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 67;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);
	}

	public static void charEx2() {
		System.out.println("-----charEx2-----");
//		자바의 char 타입은 유니코드를 사용할 수 있음
		char ch1 = '한';
		char ch2 = '\uAE00';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}
	
	
}


















