package ch07;

public class IPTV extends Television {

	int vodChannel;
	
	void vodChannel(int channel) {
		this.vodChannel = channel;
		System.out.println("vod " + vodChannel + "��");
	}
	
	void vodChannelUp() {
		vodChannel++;
		System.out.println("vod "+this.vodChannel + "�� ä�η� �����մϴ�.");
	}void vodChannelDown() {
		vodChannel--;
		System.out.println("vod "+this.vodChannel + "�� ä�η� �����մϴ�.");
	}
	
}
