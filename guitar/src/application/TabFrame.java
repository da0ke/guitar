package application;

import cn.guitar.util.Tab;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

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
