package ch02;

public class OperationEx2 {
	public void operationEx2() {
		System.out.println("-----OperationEx2-----");
		int gameScore = 150;
		
		int lastScore = ++gameScore;
		System.out.println(lastScore);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
	}
}
