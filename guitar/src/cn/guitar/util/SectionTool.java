package cn.guitar.util;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

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
		//6根弦
		int strings = 6; 
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*MeterTool.stringGap,originX+MeterTool.width,originY+i*MeterTool.stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
					
			root.getChildren().add(line);
		}
		
		
		switch (section) {
		case LoopStart: {
			Rectangle rect = new Rectangle(originX, originY, 4, MeterTool.stringGap*5);
			rect.setFill(Color.BLACK);
			root.getChildren().add(rect);
			
			Line line = new Line(originX+6, originY, originX+6, originY+5*MeterTool.stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(1);
			root.getChildren().add(line);
			
			Circle c1 = new Circle(originX+12, originY+1.5*MeterTool.stringGap, 3, Color.BLACK);
			Circle c2 = new Circle(originX+12, originY+3.5*MeterTool.stringGap, 3, Color.BLACK);
			root.getChildren().addAll(c1,c2);
			
			break;
		}
		case LoopEnd: {
			Circle c1 = new Circle(originX+8, originY+1.5*MeterTool.stringGap, 3, Color.BLACK);
			Circle c2 = new Circle(originX+8, originY+3.5*MeterTool.stringGap, 3, Color.BLACK);
			root.getChildren().addAll(c1,c2);

			Line line = new Line(originX+14, originY, originX+14, originY+5*MeterTool.stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(1);
			root.getChildren().add(line);
			
			Rectangle rect = new Rectangle(originX+16, originY, 4, MeterTool.stringGap*5);
			rect.setFill(Color.BLACK);
			root.getChildren().add(rect);
			
			break;
		}
		default: {
			Line line = new Line(originX+MeterTool.width/2, originY, originX+MeterTool.width/2, originY+5*MeterTool.stringGap);
			
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(1);
					
			root.getChildren().add(line);
			break;
		}
			
		}
	}

}
