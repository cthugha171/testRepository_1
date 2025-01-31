package games;

import games.chara.Player;

public class Main {

	public static void main(String[] args) {
		
		String title = "test";
		
		Player player = new Player();
		
		Display frame = new Display(title, player);
		
		frame.setVisible(true);
		
		frame.update();
		
		System.out.println("終了");
		frame.dispose();
		System.exit(0);
	}
}
