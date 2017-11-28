package application;
	
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * 
 * @author da0ke
 *
 */
public class Main extends Application {

	public static final double WIDTH = 297*3.4;
	public static final double HEIGHT = 210*3.4;

	
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		
		Button button = new Button("选择曲谱");
		button.setPrefWidth(100);
		button.setPrefHeight(40);
		root.setCenter(button);
	
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("选择曲谱文件");
		String path = System.getProperty("user.dir")+"/src/tab/";
		fileChooser.setInitialDirectory(new File(path));
		
		Scene scene = new Scene(root,WIDTH,HEIGHT);
		
		primaryStage.setTitle("guitar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				File file = fileChooser.showOpenDialog(primaryStage);
				if(file != null) {
					new TabFrame(primaryStage,scene,file.getAbsolutePath());
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
