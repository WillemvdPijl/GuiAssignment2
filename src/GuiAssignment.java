import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Willem on 7-6-2016.
 */
public class GuiAssignment extends Application{

    Stage window;
    Scene scene1;

    public static void main(String[] args) {
        launch(args);

        IAsset button = new Button();
        System.out.println("normal button");

        IAsset redButton = new RedIAssetDecorator(new Button());
        System.out.println("Red Button");

        IAsset redLabel =  new RedIAssetDecorator(new Label());
        System.out.println("Rood label");

    }


    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;


        VBox layout1 = new VBox(20);
        scene1 = new Scene(layout1, 200, 200);

        window.setScene(scene1);
        window.setTitle("Harmonie");
        window.show();
    }
}
