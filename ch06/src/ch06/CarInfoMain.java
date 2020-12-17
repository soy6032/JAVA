package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----문제1-----");
		CarInfo car = new CarInfo();
		
		car.company = "기아";
		car.name = "아반떼";
		car.gas = "가솔린";
		car.type = "세단";
		car.size = "준중형";
		car.color = "블루";
		car.price = 2779;
		car.printer();
		
		car.setting("현대", "아반떼",  "가솔린", "세단", "준중형", "블루", 2779);
		car.printer();
		
		System.out.println("-----문제2-----");
		
		CarInfo2 car2 = new CarInfo2("현대", "아반떼",  "가솔린", "세단", "준중형", "블루", 2779);
		CarInfo2 car3 = new CarInfo2("기아");
		car3.name = "아반떼";
		car3.gas = "가솔린";
		car3.type = "세단";
		car3.size = "준중형";
		car3.color = "블루";
		car3.price = 2779;
		car3.printer();
		
		CarInfo2 car4 = new CarInfo2();
		car4.company = "현대";
		car4.name = "아반떼";
		car4.gas = "가솔린";
		car4.type = "세단";
		car4.size = "준중형";
		car4.color = "블루";
		car4.price = 2779;
		car4.printer();
		
		System.out.println("-----문제3-----");
		
		CarInfo3 car5 = new CarInfo3();
		
	}

}
