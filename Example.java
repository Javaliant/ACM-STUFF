// Simple Button -- will shutdown your computer (Windows specific)

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