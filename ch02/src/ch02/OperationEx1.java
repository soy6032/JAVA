package ch02;

public class OperationEx1 {
	public void operationEx1() {
		System.out.println("-----OperationEx1-----");
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
	}
}
