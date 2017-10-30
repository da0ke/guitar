/**
 * 
 */
package tab;

import java.util.List;

import cn.guitar.util.FileIOUtils;
import cn.guitar.util.MeterTool;
import cn.guitar.util.MyConst;
import cn.guitar.util.Section;
import cn.guitar.util.SectionTool;
import javafx.scene.layout.Pane;

/**
 * @author da0ke
 *
 */
public class LittleStar {

	public static void create(Pane root) {
		int x = 60;
		int y = 60;
		int increase = MeterTool.width;
		
		String classPath = LanHuaCao.class.getResource("").getPath();
		List<String> list = FileIOUtils.readFile2List(classPath+"littlestar");
		for(String line : list) {
			if("section".equals(line)) { //section
				SectionTool.create(root, x, y, Section.Normal);
			} else if("delay".equals(line)) {
				MeterTool.createDelay(root, x, y);
			} else {
				String[] arr = line.split("");
				MeterTool.create(root, x, y, new int[][]{{Integer.valueOf(arr[0]),MyConst.getMarkValue(arr[1])}});
			}
			x += increase;
		}
	}

	
}
