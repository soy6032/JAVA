package ch06;

public class Earth {
//	final 키워드를 사용하여 변수 선언 시 데이터 입력 후 더이상 수정 불가
//	static 키워드를 사용하여 객체를 생성하지 않고 클래스.멤버명으로 사용가능
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
//	static 코드 블럭 : static 키워드를 사용한 정적 멤버들을 초기화하는데 사용하는 코드블럭.
//	static 키워드를 사용한 정적 멤버 전용 생성사라고 생각하면 됨.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
