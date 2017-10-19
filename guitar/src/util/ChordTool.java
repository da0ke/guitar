package util;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;

/**
 * 
 * @author da0ke
 * 
 * 和弦工具类
 *
 */
public class ChordTool {
	
	/**
	 * Am和弦
	 */
	public static void createAm(Pane root, int originX, int originY) {
		String name = "Am";
		int[][] topArray = {{6,5,1},{1,0,0}};
		int[][] markArray = {{4,3,2},{2,2,1}};
		create(root, originX, originY, name, topArray, markArray);
	}

	private static void create(Pane root, int originX, int originY, String name, int[][] topArray, int[][] markArray) {

		int h_unit = 8;// 水平单位
		int v_unit = 12;// 垂直单位

		Label _name = new Label(name);
		_name.setFont(Font.font(14));
		if (name.length() == 1) {
			_name.setLayoutX(originX + 18);
		} else {
			_name.setLayoutX(originX + 13);
		}

		_name.setLayoutY(originY);
		root.getChildren().add(_name);

		for (int i = 0; i < topArray[0].length; i++) {
			Label label;
			if (topArray[1][i] == 1) {
				label = new Label("x");
			} else {
				label = new Label("o");
			}
			label.setFont(Font.font(12));
			label.setLayoutY(originY + 10);
			label.setLayoutX(originX + (6 - topArray[0][i]) * h_unit);
			root.getChildren().add(label);
		}

		// 横线
		int y = originY + 24;
		int x = originX + 4;
		for (int i = 0; i < 4; i++) {
			Line line = new Line(x, y + i * v_unit, x + 5 * h_unit, y + i * v_unit);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
			root.getChildren().add(line);
		}
		// 竖线
		for (int i = 0; i < 6; i++) {
			Line line = new Line(x + i * h_unit, y, x + i * h_unit, y + 3 * v_unit);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
			root.getChildren().add(line);
		}

		// 标记
		for (int i = 0; i < markArray[0].length; i++) {
			Circle circle = new Circle(x + h_unit * (6 - markArray[0][i]), y + v_unit * (markArray[1][i] - 0.5), 3,
					Color.BLACK);
			root.getChildren().add(circle);
		}

	}
}
