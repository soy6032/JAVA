import java.util.Scanner;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 >> ");
		String c = sc.next();
		System.out.print("영희 >> ");
		String y = sc.next();
		
		
		if(c.equals("가위")){
			if(y.equals("가위")){
				result=1;
			} else if(y.equals("바위")){
				result=2;
			} else if(y.equals("보")){
				result=3;
			}
			//1비 2y 3c
		} 
		else if(c.equals("바위")){
			if(y.equals("가위")){
				result=3;
			} else if(y.equals("바위")){
				result=1;
			} else if(y.equals("보")){
				result=2;
			}
		} 
		else if(c.equals("보")){
			if(y.equals("가위")){
				result=2;
			} else if(y.equals("바위")){
				result=3;
			} else if(y.equals("보")){
				result=1;
			} 
		}
		if(result==1){
			System.out.println("비겼습니다.");
		} 
		else if(result==2){
			System.out.println("영희가 이겼습니다.");
		} 
		else if(result==3){
			System.out.println("철수가 이겼습니다.");	
		} 
		
	}
}
