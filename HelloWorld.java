import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
		
		public void start(Stage mainStage) {
			mainStage.setTitle("Hellow World Program");

			Button btn = new Button();
			btn.setText("Click here to print 'Hello World' in the terminal ten times.");
			btn.setOnAction(new CustomEventHandler());

			StackPane root = new StackPane();
			root.getChildren().add(btn);

			Scene scene = new Scene(root, 400, 200);
			mainStage.setScene(scene);
			mainStage.show();
		}


	private class CustomEventHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			int timesRunCoefficient = 1;
			boolean firstRun = true;
			int ij = 0;
			if (firstRun) {
				for (int i = 0; i < 10; i++) {
					
					System.out.print(((i + 1)*timesRunCoefficient) + ":");
					System.out.println("Hello World");
				}
				System.out.println(ij);
				timesRunCoefficient = 10;
				firstRun = false;
				ij++;
				System.out.println(ij);
			} else {
				for (int i = 0; i < 10; i++) {
					System.out.print(((i + 1)*timesRunCoefficient) + ":");
					System.out.println("Hello World");
				}
				timesRunCoefficient += 10;
			}
		}
	}
}