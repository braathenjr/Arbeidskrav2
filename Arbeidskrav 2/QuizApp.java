
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Write a description of JavaFX class QuizApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizApp extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    Label myLabel = new Label("Hva er hovedstaden i:");
    Label myLabel2 = new Label("Danmark");
    TextField textField = new TextField();

    @Override
    public void start(Stage stage) throws Exception
    {
        // Create a Button or any control item
        Button myButton = new Button("Svar");
        
        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        myButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e)
            {
                buttonClick(e);
                
            }
        });
        
        // Sets the image and pref size
        /*ImageView imageView = new ImageView();
        ImageView view = new ImageView();
        view.setFitWidth(400);
        view.setFitHeight(400);
        */
        
        Image image1 = new Image("bilder/danmark.jpg");
        ImageView view1 = new ImageView(image1);
        view1.setImage(image1);
        view1.setFitWidth(400);
        view1.setFitHeight(400);
        
        Image image2 = new Image("bilder/brazil.jpg");
        ImageView view2 = new ImageView(image2);
        view2.setImage(image2);
        view2.setFitWidth(400);
        view2.setFitHeight(400);
        
        /*
        Image image3 = new Image("bilder/Finland.jpg");
        ImageView view3 = new ImageView(image3);
        view3.setImage(image3);
        view3.setFitWidth(400);
        view3.setFitHeight(400);
        
        Image image4 = new Image("bilder/Nigeria.jpg");
        ImageView view4 = new ImageView(image4);
        view4.setImage(image4);
        view4.setFitWidth(400);
        view4.setFitHeight(400);
        
        Image image5 = new Image("bilder/Russland.jpg");
        ImageView view5 = new ImageView(image5);
        view5.setImage(image5);
        view5.setFitWidth(400);
        view5.setFitHeight(400);
        */
       
        // Add the button and label into the pane
        pane.add(myLabel, 0, 0);
        pane.add(myLabel2, 0, 1);
        pane.add(myButton, 2, 3);
        pane.add(textField, 0, 3);
        pane.add(view1,0,2);
        pane.add(view2,0,2);
        /*pane.add(view3,0,2);
        pane.add(view4,0,2);
        pane.add(view5,0,2);*/

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClick(ActionEvent event)
    {
       
    }
}
