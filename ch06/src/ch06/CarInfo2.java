package ch06;

public class CarInfo2 {

	String company;
	String name;
	String gas;
	String type;
	String size;
	String color;
	int price;
	
	public CarInfo2(){
		company = "���";
		name = "�ƹݶ�";
		gas = "���ָ�";
		type = "����";
		size = "������";
		color = "���";
		price = 2779;
		
	}
	
	public CarInfo2(String carCompany){
		company = carCompany;
		name = "�ƹݶ�";
		gas = "���ָ�";
		type = "����";
		size = "������";
		color = "���";
		price = 2779;
	}
	
	public CarInfo2(String carCompany, String carName, String carGas, 
			String carType, String carSize, String carColor, int carPrice){
		company = carCompany;
		name = carName;
		gas = carGas;
		type = carType;
		size = carSize;
		color = carColor;
		price = carPrice;
		
	}
	
	public void getCarInfo() {
		
		System.out.println("ȸ��� : " + company + "\n�𵨸� : " + name + "\n�������� : " + gas
				+ "\n������ : " + type + "\nũ�� : " + size + "\n���� : " + color + "\n���� : " + price);
		System.out.println("");
	}
	
}
