package ch06;

public class Cal {

	int gas;
	
	public void setGas(int inGas) {
		gas = inGas;
	}
	
	public boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ� : " + gas + ")");
				gas--;
			}
			else {
				System.out.println("����ϴ�. (gas�ܷ� : " + gas + ")");
			}
			return;
		}
	}
	
}