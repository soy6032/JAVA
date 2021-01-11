
import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
        	int my;
            int min = 0;
            int max = 99;
            Random r = new Random();
            int ran = r.nextInt(100);
            System.out.print("수를 결정하였습니다. 맞추어 보세요 \n");
            for(int i=1;;i++){
                System.out.println(min + "-" + max);
                System.out.print(i+">>");
                my=sc.nextInt();
                if(ran > my){
                    System.out.println("더 높게");
                    min = my;
                    }
                else if(ran < my){
                    System.out.println("더 낮게");
                    max = my;
                }
                else{
                    System.out.print("맞았습니다\n다시하시겠습니까?(y/n)");
                    if (sc.next().equals("y")) {
                        break;
                    }
                    else{
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }
                }   
            }
        }
       
    }
}

