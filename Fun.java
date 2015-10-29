/* Author: Luigi Vincent
* The main thing we created today.
* Try to add some more interaction with other keys!
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.StageStyle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Fun extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		MediaPlayer player = new MediaPlayer(
			new Media(getClass().getResource("fly.mp3").toString())
		);
		player.setAutoPlay(true);  
		player.setStartTime(Duration.seconds(72));	

		ImageView view = new ImageView(new Image(getClass().getResource("bird.gif").toString()));
		view.setFocusTraversable(true);
		view.setOnKeyPressed(e -> {
			switch(e.getCode()) {
				case UP:
					stage.setY(stage.getY() - 5);
				break;
				case DOWN:
					stage.setY(stage.getY() + 5);
				break;
				case RIGHT:
					stage.setX(stage.getX() + 5);
				break;
				case LEFT:
					stage.setX(stage.getX() - 5);
				break;
			}
		});

		stage.setScene(new Scene(new Group(view), Color.TRANSPARENT));
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.show();
	}
}
