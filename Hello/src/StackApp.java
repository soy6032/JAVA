import java.util.Scanner;


public class StackApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringStack s = new StringStack(0);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		s = new StringStack(sc.nextInt());
		String str;
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			str = sc.next();
			
			if(str.equals("그만")) {
				break;
			}
			else {
			}
			
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int leng = s.length();
		for(int i=0; i<(leng); i++) {
			System.out.print(str);
		}
	}
}

