package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import util.ChordTool;

/**
 * 
 * @author zhoujie
 * 
 *
 */
public class Main extends Application {

	private static final double WIDTH = 297*3.4;
	private static final double HEIGHT = 210*3.4;
	private static final int TIME_WIDTH = 60; //一个拍子的宽度
	private static final int SECTION_WIDTH = 240;//一个小节的宽度
	private static final int STRING_GAP = 13; //弦距，上弦与下弦的间距
	

	
	/**
	 * 初始化基础结构
	 */
	private void initView(Pane root) {
		
		//起始坐标
		int startX = 10;
		int startY = 60;
		
		//6根弦
		int strings = 6; 
		for(int i=0;i<strings;i++) {
			Line line = new Line(startX,startY+i*STRING_GAP,WIDTH-startX*2,startY+i*STRING_GAP);
			line.setStroke(Color.BLACK);
			line.setStrokeWidth(0.6);
			
			root.getChildren().add(line);
		}
		
		//小节分割线
		for(int i=0;i<4;i++) {
			Line sectionLine = new Line(startX+SECTION_WIDTH*(i+1), startY, startX+SECTION_WIDTH*(i+1), startY+5*STRING_GAP);
			root.getChildren().add(sectionLine);
		}
		
	}

	
	
//	private void addNote(Pane root,int startX,int startY) {
//
//		for(int i=0;i<WIRE_COUNT;i++) {
//			Line line = new Line(startX,startY+i*13,startX+NOTE_WIDTH,startY+i*13);
//			line.setStroke(Color.BLACK);
//			line.setStrokeWidth(0.6);
//			
//			root.getChildren().add(line);
//		}
//	}
//	
//	private void addNote(Pane root,int startX,int startY,int string, Fret fret) {
//		addNote(root,startX,startY);
//		
//		Label label = new Label(fret.toString());
//		label.setLayoutX(startX+11);
//		label.setLayoutY(startY+13*(string-1)-8);
//		
//		root.getChildren().add(label);
//	}

	
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		initView(root);
		
		
		ChordTool.createAm(root, 200, 200);


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
