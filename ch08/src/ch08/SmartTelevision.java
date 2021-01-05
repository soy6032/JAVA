package ch08;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume = 0;
	
//	인터페이스 Searchable 로 부터 상속받은 추상 메서드
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + " 을 검색합니다.");
	}
//	인터페이스 RemoteControl 로 부터 상속받은 추상 메서드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트 TV의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트 TV의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}

}
