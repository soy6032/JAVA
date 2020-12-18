package ch06;

public class FonalPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalPerson fp1 = new FinalPerson("1234567-1234567", "이순신");
		
		System.out.println(fp1.nation);
		System.out.println(fp1.ssn);
		System.out.println(fp1.name);
		
		System.out.println("\n----상수사용----\n");
		
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + " km^2");
	}

}
