/**
 * 
 */
package application;

import java.util.List;

import cn.guitar.util.ChordTool;
import cn.guitar.util.FileIOUtils;
import cn.guitar.util.MeterTool;
import cn.guitar.util.MyConst;
import cn.guitar.util.Section;
import cn.guitar.util.SectionTool;
import javafx.scene.layout.Pane;
import tab.LanHuaCao;

/**
 * @author da0ke
 *
 */
public class Tab {
	
	public static void create(Pane root,String tabName) {
		int x = 60;
		int y = 60;
		int increase = MeterTool.width;
		
		int sectionLine = 0;
		
		String classPath = LanHuaCao.class.getResource("").getPath();
		List<String> list = FileIOUtils.readFile2List(classPath+tabName);
		for(String line : list) {
			if(line.contains(":")) {
				String chord = line.split(":")[0];
				if(chord.equals("Am")) {
					
				}
				ChordTool.createAm(root, x, y);
			}
			
			if("section".equals(line)) { //section
				sectionLine++;
				SectionTool.create(root, x, y, Section.Normal);
				if(sectionLine%6 == 0) {
					x = 60;
					y += 180;
					continue;
				}
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
