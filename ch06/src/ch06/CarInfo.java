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
		company = "���";
		name = "�ƹݶ�";
		gas = "���ָ�";
		type = "����";
		size = "������";
		color = "���";
		price = 2779;
		printer();
	}
	
//	�Է� -> set ,  ��� -> get

	public void setting(String carCompany, String carName, String carGas, 
			String carType, String carSize, String carColor, int carPrice) {
		
		company = carCompany; //-->this.company �ᵵ��
		name = carName;
		gas = carGas;
		type = carType;
		size = carSize;
		color = carColor;
		price = carPrice;
		
	}
	
	public void printer() {
		System.out.println("ȸ��� : " + company + "\n�𵨸� : " + name + "\n�������� : " + gas
				+ "\n������ : " + type + "\nũ�� : " + size + "\n���� : " + color + "\n���� : " + price);
		System.out.println("");
	}
	

	
	
}
