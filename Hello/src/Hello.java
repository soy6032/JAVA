
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, welcome to the java world!!");
		
		//������ ���� �� ���
		int x = 1;
		int y = 2;
		int result = x + y;
		
		System.out.println(result);
		
//		������ ������ Ÿ�� ���� ��� �Ұ�
		int num = 100;
		System.out.println(num);
		
//		intŸ������ ����� ������ �ٸ� Ÿ���� �����͸� �Է��� �� ����
//		num = "���ڿ�";
//		System.out.println(num);
		
//		������ ���� �ݵ�� �ʱ�ȭ�ϰ� ����ؾ� ��
//		�ʱ�ȭ�� ���� ���� ��� ������ �߻�
//		���� �̸��ϰ� ��� ���� �ʱ�ȭ �۾��� �����ϸ� ���� ����
//		int value;
////		�ʱ�ȭ���� �ʰ� �ٷ� ���
//		int result2 = value + 10;
//		System.out.println(result2);
		
//		������ �ʱ�ȭ���� �ʰ� �ٷ� ��� �� ���� �߻�
//		int value2;
//		System.out.println(value2);
		
		int var1 = 10;
		
		System.out.println("main �Լ����� ������ ���� var1�� ��: " + var1);
		
		if(true) {
			int var2 = 20;
			System.out.println("if������ ������ ���� var2�� ��: " + var2);
		}
		
//		var2�� if���� �ڵ��Ͽ��� ����Ǿ��� ������ if���� �ڵ�� �ۿ��� ����� �� ����
//		if���� �ڵ���� ����� if������ ����Ǿ��� ������ �ڵ������� �޸𸮿��� ������
//		System.out.println(var2);
		
		for(int i = 0; i < 1; i++) {
			int var3 = 30;
			System.out.println("for������ ������ ���� var3�� ��: " + var3);
		}
		
//		������ ������ �̸��� ����� �� ����
		int name = 100;
		System.out.println(name);
		
		dataType();
//		���� Ÿ�� ���� charEx1 ����
		charEx1();
		charEx2();
		dataType2();
		dataType3();
	}
	
	public static void dataType() {
		System.out.println("-----dataType-----");
		
//		byte Ÿ���� -128 ~ 127������ ���ڸ� ������ ����
//		�� ��ġ�� �Ѿ�� ���ڴ� ���������� ����Ǵ� ���� �������� ����
		byte b = (byte)-129;
		System.out.println("tyte ���� b: " + b);
		
//		char Ÿ���� ���ڸ� �����ϱ⵵ ������ ���ڸ� �����ϱ� ���� ������ Ÿ��,
//		ASCII�ڵ带 �����ϱ� ���� Ÿ��
//		char Ÿ�Կ� ���ڸ� ������ ��� ' ' �� ����ؾ� ��
//		java�� ���� Ÿ�԰� ���ڿ� Ÿ���� ���� �����ϱ� ������ ''�� ���� Ÿ�Կ� ����ϰ�
//		" "�� ���ڿ� Ÿ�Կ� �����
		char c = 100;
		
		System.out.println("char ���� c : " + c);
		char c1 = 10;
		char c2 = (char)(c + c1);
		System.out.println("char ���� c1 : " + c2);
		
		short s = 32767;
		System.out.println("short ���� s : " + s);
		
//		int Ÿ���� ���� Ÿ���� �⺻ �ڷ�����
//		������ ������ int Ÿ������ ������ �����
		int i = 1000;
		System.out.println("int ���� i : " + i);

//		int Ÿ������ ǥ���� �� ���� ��� ����ϴ� ������ Ÿ��
//		long Ÿ�� ������ �����͸� ������ ��� �������� ���� L�� �ٿ���� ��
//		���̻� L�� ������ ���� ��� int Ÿ������ �ν�
		long l = 2200000000L;
		System.out.println("long ���� l : " + l);
		
	}
	public static void dataType2() {
		
		System.out.println("-----dataType2-----");
		
//		float, double�� �Ǽ���(�ε��Ҽ���) �����͸� �����ϱ� ���� ������ Ÿ��
//		float Ÿ���� ������ ���� �� �ݵ�� ���̻� f�� �Է��ؾ���
		float f = 0.1f;
		System.out.println("float ���� f : " + f);
		
//		double Ÿ���� �Ǽ��� ������ �⺻ Ÿ���̱� ������ ���̻縦 ������� �ʾƵ� ��
//		double Ÿ�԰� float Ÿ���� ���� �� double Ÿ������ ��ȯ�� �� �����
//		������ ���� �� int Ÿ������ ��ȯ �� �����
		double d = 0.1;
		System.out.println("double ���� d : " + d);
	}
	
	public static void dataType3() {
		System.out.println("-----dataType3-----");
		
//		boolean Ÿ���� true, false �� ���� ������ Ÿ��
		
		boolean bool = true;
		System.out.println("boolean ���� bool : " + bool);
	}
	
	public static void charEx1() {
		System.out.println("-----charEx1-----");
		
//		char Ÿ���� ���ڸ� �����ϱ� ���� Ÿ��
		char ch1 = 'A';//���� ����
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
//		�ڹ��� char Ÿ���� �����ڵ带 ����� �� ����
		char ch1 = '��';
		char ch2 = '\uAE00';
		
		System.out.println(ch1);
		System.out.println(ch2);
	}
	
	
}


















