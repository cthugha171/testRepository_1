package games.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Displays {
	
	@AllArgsConstructor
	public enum DisplaySize_Width {
		MINIMUM(640, "width_min"),
		MIDIUM(1280, "width_mid"),
		MAXIMUM(2048, "width_max"),
		;
		
		@Getter
		private Integer size;
		@Getter
		private String displayState;
		
		public static DisplaySize_Width getDisplaySize(String dispState) {
			for (DisplaySize_Width width : Arrays.asList(DisplaySize_Width.values())) {
				if(width.equals(dispState)) {
					return width;
				}
			}
			
			throw new IllegalArgumentException("DispleySize_Width : getDisplaySize is error. value = " + dispState);
		}
	}
	
	
	@AllArgsConstructor
	public enum DispleySize_Height {
		MINIMUM(480, "height_min"),
		MIDIUM(1024, "height_mid"),
		MAXIMUM(1536, "height_max")
		;
		
		@Getter
		private Integer size;
		@Getter
		private String displayState;
		
		public static DispleySize_Height getDisplaySize(String dispState) {
			for (DispleySize_Height height : Arrays.asList(DispleySize_Height.values())) {
				if(height.equals(dispState)) {
					return height;
				}
			}
			
			throw new IllegalArgumentException("DisplaySize_Height : getDisplaySize is error. value = " + dispState);		}
	}

}
