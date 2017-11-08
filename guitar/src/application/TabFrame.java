package application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import tab.Tab;

/**
 * @author da0ke
 *
 */
public class TabFrame {
	
	public TabFrame(Scene scene,String tabFile) {
		Pane root = new Pane();
		
		Tab.create(root, tabFile);

		scene.setRoot(root);
	}
	
}
