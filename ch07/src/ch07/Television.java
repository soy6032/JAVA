package ch07;

public class Television {

	int channel;
	int volume = 25;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void changChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "�� ä�η� �����մϴ�.");
	}
	
	void channelUp() {
		
		channel++;
		
		if(channel > 15) {
			this.channel = 1;
		}
		
		System.out.println(this.channel + "�� ä�η� �����մϴ�.");
	
		
		
	}
	
	void channelDown() {
		
		channel--;
		
		if(channel < 1) {
			this.channel = 15;
			
		}
		
		System.out.println(this.channel + "�� ä�η� �����մϴ�.");
	
		
		
	}
	
	void volumUp() {
		
		volume++;
		
		if(volume > 25) {
			volume = 25;
			System.out.println(25 + "�� �ִ뺼��");
		}
		
		System.out.println("������ 1�ø��ϴ�.\n���� ���� " + volume);
		
		
	}
	
	void volumDown() {
		volume--;
		
		if(volume < 1 ) {
			volume = 1;
			System.out.println(1 + "�� �ּҺ���");
		}
		
			
		System.out.println("���� 1 �����ϴ�.\n���� ���� " + volume);
		
	}
	
}
