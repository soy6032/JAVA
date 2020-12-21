package ch07;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television tv = new Television();
		
		tv.powerOn();
		tv.changChannel(15);
		tv.volumUp();
		tv.volumUp();
		tv.volumUp();
		tv.volumDown();
		tv.volumDown();
		tv.volumDown();
		tv.volumDown();
		tv.volumDown();
		System.out.println("------ ------");
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("------ ------");
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.powerOff();
		
		System.out.println("------ ------");
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.volumUp();
		stv.volumUp();
		stv.channelUp();
		stv.changChannel(11);
		stv.turnOnInternet();
		stv.changeUrl("www.daum.net");
		stv.turnOffInternet();
		stv.turnOnYoutube();
		stv.turnOffYoutube();
		stv.powerOff();
		
		System.out.println("------ ------");
		IPTV vtv = new IPTV();
		vtv.powerOn();
		vtv.vodChannel(10);
		vtv.vodChannelUp();
		vtv.vodChannelUp();
		vtv.vodChannelDown();
		vtv.powerOff();
		
		
//		문제 1번 Television 클래스를 상속받아 IPTV라는 클래스를 생성하고,
//		IPTV 고유 기능으로 VOD 채널을 볼 수 있는 프로그램을 작성하세요
//		조건 1. VOD 채널을 저장하는 멤버 변수 필요
//		조건 2. VOD 채널을 변경하는 메서드 필요
//		
//		문제 2번 Television 클래스는 현재 볼륨이 최대 볼륨과 최소 볼륨이 존재하지 않는 상태이며
//		채널도 최소와 최대가 없는 상태, 이를 수정하여 볼륨 0 ~ 25 해당 범위를 넘어서지 못하도록 수정
//		채널은 1 ~ 15 범위를 넘어서면 각각 반대의 최대 혹은 최솟값을 가지도록 수정
		
	}

}
