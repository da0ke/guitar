/**
 * 
 */
package cn.guitar.util;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 * 
 * 小节工具类
 * 
 * @author da0ke
 *
 */
public class SectionTool {

	/**
	 * 创建小节线
	 */
	public static void create(Pane root, int originX, int originY, Section section) {
		switch (section) {
		case LoopStart:
			break;
		case LoopEnd:
			break;
		default:
			Line line = new Line(originX, originY, originX, originY+5*MeterTool.stringGap);
			
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(1);
					
			root.getChildren().add(line);
			break;
		}
	}

}
