package cn.guitar.util;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

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
		int width = 14;
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*stringGap,originX+width*toneArray.length,originY+i*stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
					
			root.getChildren().add(line);
		}
		
		//音
		for(int i=0;i<toneArray.length;i++) {
			int stringNum = toneArray[i][0];
			int markNum = toneArray[i][1];
			
			Label label = new Label();
			if(markNum == MyConst.MARK_X) {
				label.setText("x");
			} else if(markNum == MyConst.MARK_O) {
				label.setText("o");
			} else if(markNum == MyConst.MARK_0) {
				label.setText("0");
			} else if(markNum == MyConst.MARK_1) {
				label.setText("1");
			} else if(markNum == MyConst.MARK_2) {
				label.setText("2");
			} else if(markNum == MyConst.MARK_3) {
				label.setText("3");
			} else {
				label.setText("");
			}
			label.setFont(Font.font(10));
			label.setLayoutX(originX+(i+0.5)*width-3);
			label.setLayoutY(originY+(stringNum-1.5)*stringGap-1);
			
			root.getChildren().add(label);
			
		}
		
		//拍子
		Line line1 = new Line(originX+0.5*width, originY+(toneArray[0][0])*stringGap+4, originX+0.5*width, originY+(7-0.5)*stringGap-1);
		Line line2 = new Line(originX+0.5*width, originY+(7-0.5)*stringGap-1, originX+1.5*width, originY+(7-0.5)*stringGap-1);
		Line line3 = new Line(originX+1.5*width, originY+(toneArray[1][0])*stringGap+4, originX+1.5*width, originY+(7-0.5)*stringGap-1);
		root.getChildren().add(line1);
		root.getChildren().add(line2);
		root.getChildren().add(line3);
	}
	
}
