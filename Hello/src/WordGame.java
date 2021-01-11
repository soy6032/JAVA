import java.util.Scanner;

public class WordGame {
	private Scanner sc; 
    private String startWord;


    public WordGame() {
    	startWord = "겨울한파";
        sc = new Scanner(System.in);
    }


    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.println("시작 단어는 '" + startWord + "' 입니다.");


        String lastWord = startWord;
        
        System.out.println("시작 > " + startWord);
        
        while(true) {
        	System.out.print("입력 > ");
            startWord = sc.next();

            if (checkWord(lastWord) == true) {
                System.out.println("출력 > " + startWord);
                lastWord = startWord;
            }
            else {
                System.out.println("끗말잇기가 실패했습니다.");
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }


    public boolean checkWord(String lastWord) {
        int lastIndex = lastWord.length() - 1;
        
        if (lastWord.charAt(lastIndex) == startWord.charAt(0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
