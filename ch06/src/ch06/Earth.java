package ch06;

public class Earth {
//	final Ű���带 ����Ͽ� ���� ���� �� ������ �Է� �� ���̻� ���� �Ұ�
//	static Ű���带 ����Ͽ� ��ü�� �������� �ʰ� Ŭ����.��������� ��밡��
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
//	static �ڵ� �� : static Ű���带 ����� ���� ������� �ʱ�ȭ�ϴµ� ����ϴ� �ڵ��.
//	static Ű���带 ����� ���� ��� ���� �������� �����ϸ� ��.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
