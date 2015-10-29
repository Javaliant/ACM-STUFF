/* Author: Luigi Vincent 
* Simple Button -- will shutdown your computer (Windows specific)
* If request, I can write a system independent version.
* But I recommend you guys try to write that yourself or generally make the button do something else
*/

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Example extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Button button = new Button("DO NOT CLICK");
		button.setOnAction(e -> {
			try {
				Runtime.getRuntime().exec("shutdown /s /t 00");
			} catch(IOException ioe){}
		});

		stage.setScene(new Scene(button));
		stage.show();
	}
}
