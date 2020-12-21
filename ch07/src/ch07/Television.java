package ch07;

public class Television {

	int channel;
	int volume = 25;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void channelUp() {
		
		channel++;
		
		if(channel > 15) {
			this.channel = 1;
		}
		
		System.out.println(this.channel + "번 채널로 변경합니다.");
	
		
		
	}
	
	void channelDown() {
		
		channel--;
		
		if(channel < 1) {
			this.channel = 15;
			
		}
		
		System.out.println(this.channel + "번 채널로 변경합니다.");
	
		
		
	}
	
	void volumUp() {
		
		volume++;
		
		if(volume > 25) {
			volume = 25;
			System.out.println(25 + "가 최대볼륨");
		}
		
		System.out.println("볼륨을 1올립니다.\n현재 볼륨 " + volume);
		
		
	}
	
	void volumDown() {
		volume--;
		
		if(volume < 1 ) {
			volume = 1;
			System.out.println(1 + "이 최소볼륨");
		}
		
			
		System.out.println("볼륨 1 내립니다.\n현재 볼륨 " + volume);
		
	}
	
}
