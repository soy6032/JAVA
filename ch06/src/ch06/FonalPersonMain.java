package ch06;

public class FonalPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalPerson fp1 = new FinalPerson("1234567-1234567", "�̼���");
		
		System.out.println(fp1.nation);
		System.out.println(fp1.ssn);
		System.out.println(fp1.name);
		
		System.out.println("\n----������----\n");
		
		System.out.println("������ ������ : " + Earth.EARTH_RADIUS + " km");
		System.out.println("������ ǥ���� : " + Earth.EARTH_SURFACE_AREA + " km^2");
	}

}
