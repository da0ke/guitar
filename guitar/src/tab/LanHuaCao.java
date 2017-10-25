package tab;

import cn.guitar.util.MeterTool;
import cn.guitar.util.MyConst;
import cn.guitar.util.Section;
import cn.guitar.util.SectionTool;
import javafx.scene.layout.Pane;

/**
 * 兰花草
 * 
 * @author da0ke
 *
 */
public class LanHuaCao {
	
	public static void create(Pane root) {
		int x = 60;
		int y = 60;
		int increase = MeterTool.width;
		MeterTool.create(root, x, y, new int[][]{{4,MyConst.MARK_X},{2,MyConst.MARK_X}});
		x += increase;
		MeterTool.create(root, x, y, new int[][]{{2,MyConst.MARK_X},{2,MyConst.MARK_0}});
		x += increase;
		MeterTool.create(root, x, y, new int[][] {{3,MyConst.MARK_X}});
		x += increase;
		MeterTool.create(root, x, y, new int[][] {{1,MyConst.MARK_X}});
		x += increase;
		SectionTool.create(root, x, y, Section.Normal);
		MeterTool.create(root, x, y, new int[][] {{2,MyConst.MARK_0}});
		x += increase;
		MeterTool.create(root, x, y, new int[][] {{3,MyConst.MARK_0}});
		x += increase;
		MeterTool.createStrum(root, x, y, 5, 1);
		
	}
	
}
