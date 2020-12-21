package ch07;

public class IPTV extends Television {

	int vodChannel;
	
	void vodChannel(int channel) {
		this.vodChannel = channel;
		System.out.println("vod " + vodChannel + "번");
	}
	
	void vodChannelUp() {
		vodChannel++;
		System.out.println("vod "+this.vodChannel + "번 채널로 변경합니다.");
	}void vodChannelDown() {
		vodChannel--;
		System.out.println("vod "+this.vodChannel + "번 채널로 변경합니다.");
	}
	
}
