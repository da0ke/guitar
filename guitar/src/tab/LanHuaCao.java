package tab;

import java.util.List;

import cn.guitar.util.FileIOUtils;
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
	
	public static void init() {
		String classPath = LanHuaCao.class.getResource("").getPath();
		List<String> list = FileIOUtils.readFile2List(classPath+"lanhuacao");
		for(String line : list) {
			if(line.contains(":")) { //是否有和弦
				String[] arr = line.split(":");
				String chord = arr[0];
				
			}
		}
		
	}
	
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
		x += increase;
		MeterTool.create(root, x, y, new int[][] {{2,MyConst.MARK_0}});
		x += increase;
		MeterTool.create(root, x, y, new int[][] {{3,MyConst.MARK_0}});
		x += increase;
		MeterTool.createStrum(root, x, y, 5, 1);
		x += increase;
		MeterTool.createDelay(root, x, y);
		x += increase;
		SectionTool.create(root, x, y, Section.LoopStart);
		x += increase;
		MeterTool.create(root, x, y, new int[][]{{5,MyConst.MARK_X},{3,MyConst.MARK_X}});
		x += increase;
		MeterTool.create(root, x, y, new int[][]{{2,MyConst.MARK_X},{3,MyConst.MARK_X}});
		x += increase;
		MeterTool.create(root, x, y, new int[][]{{1,MyConst.MARK_X},{3,MyConst.MARK_X}});
		x += increase;
		MeterTool.create(root, x, y, new int[][]{{2,MyConst.MARK_X},{3,MyConst.MARK_X}});
		x += increase;
		SectionTool.create(root, x, y, Section.LoopEnd);
		x += increase;
		
		
		
	}
	
}
