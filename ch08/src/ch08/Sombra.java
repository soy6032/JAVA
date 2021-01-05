package ch08;

public class Sombra implements Character2 {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 융합포로 공격합니다.");
	}
	
	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 방어 매트릭스를 사용합니다.");
	}

	@Override
	public void spacialSkill() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 궁극기인 자폭을 사용합니다.");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 전진합니다.");
	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		System.out.println("솜브라가 후진합니다");
	}

}
