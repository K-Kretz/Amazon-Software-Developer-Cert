package org.example;

import java.io.IOException;

import javax.management.timer.TimerMBean;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

private String[] trainDetails = { /*TODO 1 intialize 5 unique train names*/ "Denvor Train","Atlanta Train","New York Train","Cleveland Train","Columbus Train"};
private int currentIndex = 0; //TODO 2 To track which train is currently displayed
private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException{
        //TODO 4 Clear all the code from the start method
        //TODO 5 A Label will act as the notice board, displaying the next arriving train.
        Label noticeLabel = new Label(trainDetails[currentIndex]);
        //TODO 6 A VBox (Vertical Box) will stack the Label vertically within the window. You’ll want to add some vertical spacing between the components.
        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(noticeLabel);
        //TODO 7 Create a Scene using the VBox layout and set it on the primary Stage.
        scene = new Scene(vbox,680,480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rail way Notice Board");
        primaryStage.show();
        /* TODO 8: Use JavaFX’s Timeline or AnimationTimer to create a repeating task. This task will update the Label with the next train’s details every 5 seconds. */
        Timeline tl = new Timeline(new KeyFrame(Duration.seconds(5),e -> {
            /* TODO 9: In the repeating task, you’ll update the Label with the next train’s details from the array.
                After displaying the last train, cycle back to the first one.
            */
            currentIndex = (currentIndex + 1) % trainDetails.length; //loops back to start when at length
            noticeLabel.setText(trainDetails[currentIndex]);
        }));
        

        tl.setCycleCount(Timeline.INDEFINITE); //runs indefinate
        tl.play(); //starts time line


    }

    public static void main(String[] args) {
        /* TODO 10: call the launch method */
        launch();
    }
}