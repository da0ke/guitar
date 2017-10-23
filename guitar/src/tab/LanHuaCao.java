package tab;

import cn.guitar.util.MeterTool;
import cn.guitar.util.MyConst;
import javafx.scene.layout.Pane;

/**
 * 兰花草
 * 
 * @author da0ke
 *
 */
public class LanHuaCao {
	
	public static void create(Pane root) {
		int[][] toneArray = {{4,MyConst.MARK_X},{2,MyConst.MARK_X}};
		MeterTool.create(root, 60, 60, toneArray);
		
	}
	
}
