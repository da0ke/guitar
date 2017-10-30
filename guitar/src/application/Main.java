package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import tab.LittleStar;

/**
 * 
 * @author da0ke
 * 
 *
 */
public class Main extends Application {

	private static final double WIDTH = 297*3.4;
	private static final double HEIGHT = 210*3.4;

	
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		
		
		
		LittleStar.create(root);

		Scene scene = new Scene(root,WIDTH,HEIGHT);
		
		primaryStage.setTitle("guitar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
