package games;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import games.chara.Player;
import games.enums.Displays;

public class Display extends JFrame implements KeyListener {
	
	private Player player;
	private Boolean checkEsc;
	
	public Display(String title, Player user) {
		super(title);
		player = user;
		System.out.print("titleへ" + title + "を設定");
		setTitle(title);
		System.out.println(" …… OK");
		System.out.print("画面サイズ設定");
		setSize(Displays.DisplaySize_Width.MAXIMUM.getSize(), Displays.DispleySize_Height.MAXIMUM.getSize());
		System.out.println(" …… OK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setBackground(Color.black);
		
		addKeyListener(this);
		
		getContentPane().add(player);
		
		checkEsc = false;
		
	}
	
	public void update() {
		while(true) {
			
			if(isPressedEsc()) {
				System.out.println("break");
				break;
			}
			
			player.draw(getGraphics());
		}
	}
	
	
	public Boolean isPressedEsc() {
		return checkEsc;
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			break;
		case KeyEvent.VK_W:
		case KeyEvent.VK_UP:
			player.moveUp();
			break;
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
			player.moveDown();
			break;
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
			player.moveRight();
			break;
		case KeyEvent.VK_A:
		case KeyEvent.VK_LEFT:
			player.moveLeft();
			break;
		case KeyEvent.VK_ESCAPE:
			checkEsc = true;
			System.out.println("Pressed Escape");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
