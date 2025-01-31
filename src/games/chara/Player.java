package games.chara;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import games.enums.CharactorState.Role;

public class Player extends BaseCharactor {
	
	private Dimension size;
	
	public Player() {
		super(1, Role.PLAYER, 1, new Point(64,64));
		size = new Dimension(32,32);
		
	}

	public Player(Integer hp, Role post, Integer dp, Point pos) {
		super(hp, post, dp, pos);
		size = new Dimension(32,32);
		
	}
	
	public void moveUp() {
		position.y -= size.height;
	}
	
	public void moveDown() {
		position.y += size.height;
	}
	
	public void moveRight() {
		position.x += size.width;
	}
	
	public void moveLeft() {
		position.x -= size.width;
	}
	
	
	
	public void draw(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(position.x, position.y, size.width, size.height);
		g.drawRect(position.x, position.y, size.width, size.height);
	}

}
