package ch07;

public class SmartTv extends Television {

	String url = "";
	
	void turnOnInternet() {
		System.out.println("���ͳ� �� ������ �����մϴ�.");
	}
	
	void turnOffInternet() {
		System.out.println("���ͳ� �� ������ �����մϴ�.");
	}
	
	void changeUrl(String url) {
		this.url = url;
		System.out.println("�� ����Ʈ�� �ּҸ� " + url + "���� �����մϴ�.");
	}
	
	void turnOnYoutube() {
		System.out.println("��Ʃ�긦 �����մϴ�");
	}
	
	void turnOffYoutube() {
		System.out.println("��Ʃ�긦 �����մϴ�.");
	}
	
}
