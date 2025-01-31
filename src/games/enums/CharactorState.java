package games.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class CharactorState {
	
	@AllArgsConstructor
	public enum Role{
		PLAYER(1,"player"),
		ENEMY(2,"enemy"),
		OBJECT(3,"object")
		;
		
		@Getter
		private Integer roleId;
		
		@Getter
		private String roleName;
		
		public Role getRole(Integer value) {
			for (Role role : Arrays.asList(Role.values())) {
				if(role.equals(value)) {
					return role;
				}
			}
			
			throw new IllegalArgumentException("Role : getRole is error. value = " + value);
		}
	}

}
