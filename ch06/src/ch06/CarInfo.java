package ch06;

public class CarInfo {

	String company;
	String name;
	String gas;
	String type;
	String size;
	String color;
	int price;
	
	public CarInfo(){
		
	}
	
	public void setting(String carCompany, String carName, String carGas, 
			String carType, String carSize, String carColor, int carPrice) {
		
		company = carCompany;
		name = carName;
		gas = carGas;
		type = carType;
		size = carSize;
		color = carColor;
		price = carPrice;
		
	}
	
	public void printer() {
		System.out.println("회사명 : " + company + "\n모델명 : " + name + "\n연료종류 : " + gas
				+ "\n차종류 : " + type + "\n크기 : " + size + "\n색상 : " + color + "\n가격 : " + price);
		System.out.println("\n");
	}
	

	
	
}
