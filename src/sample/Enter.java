package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Enter extends Application {

    public static double xp = 0, yp = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;
    public static String message = "";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 230, 250);
        primaryStage.setScene(scene);

        Button button = new Button("Show");

        TextField fieldXP = new TextField(), fieldYP = new TextField(), fieldX1 = new TextField(), fieldY1 = new TextField(), fieldX2 = new TextField(), fieldY2 = new TextField(), fieldX3 = new TextField(), fieldY3 = new TextField(), fieldX4 = new TextField(), fieldY4 = new TextField();
        fieldXP.setPromptText("Point's X");
        fieldYP.setPromptText("Point's Y");
        fieldX1.setPromptText("Figure's X1");
        fieldY1.setPromptText("Figure's Y1");
        fieldX2.setPromptText("Figure's X2");
        fieldY2.setPromptText("Figure's Y2");
        fieldX3.setPromptText("Figure's X3");
        fieldY3.setPromptText("Figure's Y3");
        fieldX4.setPromptText("Figure's X4");
        fieldY4.setPromptText("Figure's Y4");

        fieldXP.setPrefColumnCount(5);
        fieldYP.setPrefColumnCount(5);
        fieldX1.setPrefColumnCount(5);
        fieldY1.setPrefColumnCount(5);
        fieldX2.setPrefColumnCount(5);
        fieldY2.setPrefColumnCount(5);
        fieldX3.setPrefColumnCount(5);
        fieldY3.setPrefColumnCount(5);
        fieldX4.setPrefColumnCount(5);
        fieldY4.setPrefColumnCount(5);

        button.setPrefWidth(170);


        button.setOnAction((ae) -> {
                    try {
                        xp = Double.parseDouble(fieldXP.getText());
                        yp = Double.parseDouble(fieldYP.getText());
                        x1 = Double.parseDouble(fieldX1.getText());
                        y1 = Double.parseDouble(fieldY1.getText());
                        x2 = Double.parseDouble(fieldX2.getText());
                        y2 = Double.parseDouble(fieldY2.getText());
                        x3 = Double.parseDouble(fieldX3.getText());
                        y3 = Double.parseDouble(fieldY3.getText());
                        x4 = Double.parseDouble(fieldX4.getText());
                        y4 = Double.parseDouble(fieldY4.getText());

                        double maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4)), maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));
                        double minX = Math.min(Math.min(x1, x2), Math.min(x3, x4)), minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));

                        if (yp == xp + (maxY + minY - maxX - minX)/2) {
                            message = "The Point belongs to the Diagonal";
                        } else message = "The Point doesn't belong to the diagonal";


                        new Main().start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
        rootNode.getChildren().addAll(fieldXP, fieldYP, fieldX1, fieldY1, fieldX2, fieldY2, fieldX3, fieldY3, fieldX4, fieldY4, button);

        primaryStage.show();
    }
}
