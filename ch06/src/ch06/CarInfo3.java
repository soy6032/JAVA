package ch06;

public class CarInfo3 {

	String company;
	String name;
	String gas;
	String type;
	String size;
	String color;
	int price;
	
	public CarInfo3(){
		this("����");
	}
	
	public CarInfo3(String carCompany){
		this(carCompany, "�ƹݶ�",  "���ָ�", "����", "������", "���", 2779);
	}
	
	public CarInfo3(String carCompany, String carName, String carGas, 
			String carType, String carSize, String carColor, int carPrice){
		company = carCompany;
		name = carName;
		gas = carGas;
		type = carType;
		size = carSize;
		color = carColor;
		price = carPrice;
		
		printer();
		
	}
	
	public void printer() {
		
		System.out.println("ȸ��� : " + company + "\n�𵨸� : " + name + "\n�������� : " + gas
				+ "\n������ : " + type + "\nũ�� : " + size + "\n���� : " + color + "\n���� : " + price);

		System.out.println("\n");
	}
	
}