package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----����1-----");
		CarInfo car = new CarInfo();
		
		car.company = "���";
		car.name = "�ƹݶ�";
		car.gas = "���ָ�";
		car.type = "����";
		car.size = "������";
		car.color = "���";
		car.price = 2779;
		car.printer();
		
		car.setting("����", "�ƹݶ�",  "���ָ�", "����", "������", "���", 2779);
		car.printer();
		
		System.out.println("-----����2-----");
		
		CarInfo2 car2 = new CarInfo2("����", "�ƹݶ�",  "���ָ�", "����", "������", "���", 2779);
		CarInfo2 car3 = new CarInfo2("���");
		car3.name = "�ƹݶ�";
		car3.gas = "���ָ�";
		car3.type = "����";
		car3.size = "������";
		car3.color = "���";
		car3.price = 2779;
		car3.printer();
		
		CarInfo2 car4 = new CarInfo2();
		car4.company = "����";
		car4.name = "�ƹݶ�";
		car4.gas = "���ָ�";
		car4.type = "����";
		car4.size = "������";
		car4.color = "���";
		car4.price = 2779;
		car4.printer();
		
		System.out.println("-----����3-----");
		
		CarInfo3 car5 = new CarInfo3();
		
	}

}
