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
		
		
//		���� 1�� Television Ŭ������ ��ӹ޾� IPTV��� Ŭ������ �����ϰ�,
//		IPTV ���� ������� VOD ä���� �� �� �ִ� ���α׷��� �ۼ��ϼ���
//		���� 1. VOD ä���� �����ϴ� ��� ���� �ʿ�
//		���� 2. VOD ä���� �����ϴ� �޼��� �ʿ�
//		
//		���� 2�� Television Ŭ������ ���� ������ �ִ� ������ �ּ� ������ �������� �ʴ� �����̸�
//		ä�ε� �ּҿ� �ִ밡 ���� ����, �̸� �����Ͽ� ���� 0 ~ 25 �ش� ������ �Ѿ�� ���ϵ��� ����
//		ä���� 1 ~ 15 ������ �Ѿ�� ���� �ݴ��� �ִ� Ȥ�� �ּڰ��� �������� ����
		
	}

}
