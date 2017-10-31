package cn.guitar.util;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;

/**
 * 拍子工具类
 * @author da0ke
 *
 */
public class MeterTool {
	
	public static final int width = 28;
	public static final int stringGap = 13;
	public static final int strumWidth = 20;
	
	/**
	 * 创建一个拍子
	 */
	public static void create(Pane root, int originX, int originY, int[][] toneArray) {
		
		//6根弦
		int strings = 6; 
		int w = width/toneArray.length;
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*stringGap,originX+w*toneArray.length,originY+i*stringGap);
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
			} else if(markNum == MyConst.MARK_4) {
				label.setText("4");
			} else if(markNum == MyConst.MARK_5) {
				label.setText("5");
			} else {
				label.setText("");
			}
			label.setFont(Font.font(10));
			label.setLayoutX(originX+(i+0.5)*w-3);
			label.setLayoutY(originY+(stringNum-1.5)*stringGap-1);
			
			root.getChildren().add(label);
			
		}
		
		//拍子
		if(toneArray.length == 1) {
			Line line1 = new Line(originX+0.5*w, originY+(toneArray[0][0])*stringGap+4, originX+0.5*w, originY+(7-0.5)*stringGap-1);
			root.getChildren().add(line1);
		} else {
			Line line1 = new Line(originX+0.5*w, originY+(toneArray[0][0])*stringGap+4, originX+0.5*w, originY+(7-0.5)*stringGap-1);
			Line line2 = new Line(originX+0.5*w, originY+(7-0.5)*stringGap-1, originX+1.5*w, originY+(7-0.5)*stringGap-1);
			Line line3 = new Line(originX+1.5*w, originY+(toneArray[1][0])*stringGap+4, originX+1.5*w, originY+(7-0.5)*stringGap-1);
			root.getChildren().add(line1);
			root.getChildren().add(line2);
			root.getChildren().add(line3);
		}
		
	}
	
	/**
	 * 扫弦
	 */
	public static void createStrum(Pane root, int originX, int originY, int stringStart,int stringEnd) {
		//6根弦
		int strings = 6; 
		int w = width;
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*stringGap,originX+w,originY+i*stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
					
			root.getChildren().add(line);
		}
		
		//扫弦
		Path path = new Path();
		if(stringStart < stringEnd) { //往下扫弦
			//TODO
		} else { //往上扫弦
			Polyline poly = new Polyline(originX+width/2-4,originY+6,originX+width/2,originY,originX+width/2+4,originY+6);
			root.getChildren().add(poly);
			
			MoveTo moveTo = new MoveTo();
			moveTo.setX(originX+width/2);
			moveTo.setY(originY+(stringEnd-1)*stringGap+5);
			path.getElements().add(moveTo);
			for(int i=0;i<11;i++) {
				LineTo lineTo;
				if(i%2==0) {
					lineTo = new LineTo(originX+width/2-2,originY+(stringEnd-1)*stringGap+5+4*(i+1));
				} else {
					lineTo = new LineTo(originX+width/2+2,originY+(stringEnd-1)*stringGap+5+4*(i+1));
				}
				path.getElements().add(lineTo);
			}
		}
		
		path.setStroke(Color.BLACK);
		path.setStrokeWidth(0.6);
		root.getChildren().add(path);
		
		//拍子
		Line line = new Line(originX+0.5*w, originY+5*stringGap+4, originX+0.5*w, originY+(7-0.5)*stringGap-1);
		root.getChildren().add(line);
	}
	
	/**
	 * 延长拍
	 */
	public static void createDelay(Pane root, int originX, int originY) {
		//6根弦
		int strings = 6; 
		int w = width;
		for(int i=0;i<strings;i++) {
			Line line = new Line(originX,originY+i*stringGap,originX+w,originY+i*stringGap);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
					
			root.getChildren().add(line);
		}
		
		
		
		//延长音
		Line line = new Line(originX+w/2-4,originY+2.5*stringGap,originX+w/2+4,originY+2.5*stringGap);
		root.getChildren().add(line);
	}
	
	
}
