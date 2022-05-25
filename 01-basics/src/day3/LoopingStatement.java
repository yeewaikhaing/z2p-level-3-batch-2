package day3;

public class LoopingStatement {

	public static void main(String[] args) {
		String[] languages = {
				"Python", "Java", "Javascription"
		};
		
		System.out.println("------ For Loop --------");
		for(var i = 0; i < languages.length;i++)
			System.out.println(languages[i]);
		
		System.out.println("------- Foreach Loop ------");
		for(String name :languages)
			System.out.println(name);
		
	}
}
