package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----����1-----");
		CarInfo car = new CarInfo();
		
//		car.company = "���";
//		car.name = "�ƹݶ�";
//		car.gas = "���ָ�";
//		car.type = "����";
//		car.size = "������";
//		car.color = "���";
//		car.price = 2779;
		car.printer();
		
		car.setting("����", "�ƹݶ�",  "���ָ�", "����", "������", "���", 2779);
		car.printer();
		
		System.out.println("-----����2-----");
		
		CarInfo2 car21 = new CarInfo2("����", "�ƹݶ�",  "���ָ�", "����", "������", "���", 2779);
		car21.getCarInfo();
		CarInfo2 car22 = new CarInfo2("���");
		car22.getCarInfo();
		CarInfo2 car23 = new CarInfo2();
		car23.getCarInfo();
		
		
		System.out.println("-----����3-----");
		
		CarInfo3 car31 = new CarInfo3();
		car31.getCarInfo();
		
		
	}

}
