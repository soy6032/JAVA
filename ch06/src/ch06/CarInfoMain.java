package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----문제1-----");
		CarInfo car = new CarInfo();
		
//		car.company = "기아";
//		car.name = "아반떼";
//		car.gas = "가솔린";
//		car.type = "세단";
//		car.size = "준중형";
//		car.color = "블루";
//		car.price = 2779;
		car.printer();
		
		car.setting("현대", "아반떼",  "가솔린", "세단", "준중형", "블루", 2779);
		car.printer();
		
		System.out.println("-----문제2-----");
		
		CarInfo2 car21 = new CarInfo2("현대", "아반떼",  "가솔린", "세단", "준중형", "블루", 2779);
		car21.getCarInfo();
		CarInfo2 car22 = new CarInfo2("기아");
		car22.getCarInfo();
		CarInfo2 car23 = new CarInfo2();
		car23.getCarInfo();
		
		
		System.out.println("-----문제3-----");
		
		CarInfo3 car31 = new CarInfo3();
		car31.getCarInfo();
		
		
	}

}
