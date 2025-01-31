package games.chara;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import games.enums.CharactorState.Role;
import lombok.Getter;
import lombok.Setter;

public class BaseCharactor extends JPanel {
	
	@Getter
	@Setter
	protected Integer helth;
	
	@Getter
	@Setter
	protected Role role;
	
	@Getter
	@Setter
	protected Integer damage;
	
	@Getter
	@Setter
	protected Point position;
	
	@Getter
	@Setter
	protected Graphics appearance;
	
	public BaseCharactor(Integer hp, Role post, Integer dp, Point pos) {
		helth = hp;
		role = post;
		damage = dp;
		position = pos;
		setDoubleBuffered(true);
	}
}
