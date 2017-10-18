package application;
	
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import model.Note_M;
import util.Fret;

/**
 * 
 * @author 周杰
 *
 */
public class Main extends Application {

	private static final double WIDTH = 297*3.4;
	private static final double HEIGHT = 210*3.4;
	private static final int WIRE_COUNT = 6;
	
	private void initData() {
		List<Note_M> list = new ArrayList<>();
		Note_M m = new Note_M(1,0);
		
	}
	
	
	private void addNote(Pane root,int startX,int startY) {

		for(int i=0;i<WIRE_COUNT;i++) {
			Line line = new Line(startX,startY+i*13,startX+30,startY+i*13);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
			
			root.getChildren().add(line);
		}
	}
	

	private void addNote(Pane root,int startX,int startY,int string, Fret fret) {
		addNote(root,startX,startY);
		
		Label label = new Label(fret.toString());
		label.setLayoutX(startX+11);
		label.setLayoutY(startY+13*(string-1)-8);
		
		root.getChildren().add(label);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		
		addNote(root,10,60,5,Fret.Fifth);
		
		Scene scene = new Scene(root,WIDTH,HEIGHT);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		primaryStage.setTitle("guitar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
