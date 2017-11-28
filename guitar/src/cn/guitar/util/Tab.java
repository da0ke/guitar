package cn.guitar.util;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Note_M;

/**
 * @author da0ke
 *
 */
public class Tab {
	
	public static void create(Stage stage,Pane root,String tabFile) {
		int x = 60;
		int y = 60;
		int increase = MeterTool.WIDTH;
		
		int sectionLine = 0;
		
		List<String> list = FileIoUtils.readFile2List(tabFile);
		for(String line : list) {
			//空白行跳过
			if("".equals(line.trim())) {
				continue;
			}
			
			//曲谱名
			if(line.startsWith("title=")) {
				String title = line.substring(6);
				
				stage.setTitle(title);
				
				continue;
			}
			
			//和弦
			if(line.contains(":")) {
				String[] arr = line.split(":");
				String chord = arr[0];
				if("Am".equals(chord)) {
					ChordTool.createAm(root, x, y);
				}
				line = arr[1];
			}
			
			//section
			if("section".equals(line)) { 
				sectionLine++;
				SectionTool.create(root, x, y+64, Section.Normal);
				if(sectionLine%6 == 0) {
					x = 60;
					y += 232;
					continue;
				}
			} else if("loopStart".equals(line)) {
				sectionLine++;
				SectionTool.create(root, x, y+64, Section.LoopStart);
				if(sectionLine%6 == 0) {
					x = 60;
					y += 232;
					continue;
				}
			} else if("loopEnd".equals(line)) {
				sectionLine++;
				SectionTool.create(root, x, y+64, Section.LoopEnd);
				if(sectionLine%6 == 0) {
					x = 60;
					y += 232;
					continue;
				}
			} else if("delay".equals(line)) {
				MeterTool.createDelay(root, x, y+64);
			} else if(line.contains("->")) {
				String[] arr = line.split("->");
				MeterTool.createStrum(root, x, y+64, Integer.valueOf(arr[0]), Integer.valueOf(arr[1]));
			} else {
				if(line.contains(",")) {
					List<Note_M> noteList = new ArrayList<>();
					String[] arr = line.split(",");
					for(int i=0;i<arr.length;i++) {
						String[] arr2 = arr[i].split("");
						noteList.add(new Note_M(Integer.valueOf(arr2[0]),arr2[1]));
					}
					MeterTool.create(root, x, y+64, noteList);
				} else {
					String[] arr = line.split("");
					MeterTool.create(root, x, y+64, new int[][]{{Integer.valueOf(arr[0]),MyConst.getMarkValue(arr[1])}});
				}
				
			}
			x += increase;
			
		}
	}
}
