package application;

import cn.guitar.util.Tab;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author da0ke
 *
 */
public class TabFrame {
	
	public TabFrame(Stage stage,Scene scene,String tabFile) {
		Pane root = new Pane();
		
		Tab.create(stage,root, tabFile);

		scene.setRoot(root);
	}
	
}
