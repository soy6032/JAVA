import java.util.Scanner;

public class Player {

	private Scanner sc;
	private String name;
	private String word;
	
	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
		
	}
	
	public String getName() {
		return name;
	}
	
}
