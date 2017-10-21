package cn.guitar.util;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 * 拍子工具类
 * @author da0ke
 *
 */
public class MeterTool {
	
	
	/**
	 * 创建一个拍子
	 */
	public static void create(Pane root, int originX, int originY, int[][] toneArray) {
		
		//6根弦
		int strings = 6; 
		int stringGap = 13;
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*stringGap,80,originY+i*stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
					
			root.getChildren().add(line);
		}
		
		//音
		
	}
	
}
