package ch07;

//CellPhone 클래스를 상속 받음
public class DmbCellPhone extends CellPhone{
//	DmbCellPhone에는 model과 color가 없음
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
//	부모 클래스인 CellPhone에서 상속받은 메서드, 상속 받은 메서드는 이미 구현되어 있기 때문에 자식 클래스가 구현할 필요가 없음

//	자식 클래스인 DmbCellPhone 의 자체 멤버 메서드, 자체 멤버 메서드이기 때문에 구현해야함	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿈니다.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 끕니다.");
	}
}
