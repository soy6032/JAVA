package ch06;

//�޼ҵ� �����ε� : �ϳ��� �̸����� �������� �޼ҵ带 �����ϴ� ���
//���� : �Ű����� Ÿ��, ����, ���� �޶����
public class Calculator8 {
	
	double areaRectangle(double width) {
		return width * width;
	}
	
//	�Ű����� ������ ������ �Ű������� ������ Ÿ���� �ٸ��� ������ �����ε��� ������
	int areaRectangle(int width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
//	�Ű����� ������ ������ �Ű������� ������ Ÿ���� �ٸ��� ������ �����ε��� ������	
	double areaRectangle(int height, int width) {
		return width * height;
	}
	
//	�Ű����� ������ ������ �Ű������� ������ Ÿ���� �ٸ��� ������ �����ε��� ������	
	double areaRectangle(int height, double width) {
		return width * height;
	}
//�Ű������� ������ ������ Ÿ���� ������ ������ Ÿ���� ������ �ٸ��� ������ �����ε� ������
	double areaRectangle(double width, int height) {
		return width * height;
	}
	
	
	
	

}
