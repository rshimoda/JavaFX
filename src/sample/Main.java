package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab Work 8");

        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        LineChart<Number, Number> numberNumberLineChart = new LineChart<Number, Number>(x, y);
        numberNumberLineChart.setTitle(Enter.message);
        XYChart.Series series1 = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        series1.setName("Figure");
        series2.setName("Point");
        ObservableList<XYChart.Data> datas1 = FXCollections.observableArrayList();
        ObservableList<XYChart.Data> datas2 = FXCollections.observableArrayList();

        datas1.add(new XYChart.Data(Enter.x1, Enter.y1));
        datas1.add(new XYChart.Data(Enter.x2, Enter.y2));
        datas1.add(new XYChart.Data(Enter.x3, Enter.y3));
        datas1.add(new XYChart.Data(Enter.x4, Enter.y4));
        datas1.add(new XYChart.Data(Enter.x1, Enter.y1));
        datas1.add(new XYChart.Data(Enter.x2, Enter.y2));
        datas1.add(new XYChart.Data(Enter.x3, Enter.y3));
        datas1.add(new XYChart.Data(Enter.x4, Enter.y4));

        datas2.add(new XYChart.Data(Enter.xp, Enter.yp));

        series1.setData(datas1);
        series2.setData(datas2);

        numberNumberLineChart.getData().add(series1);
        numberNumberLineChart.getData().add(series2);

        primaryStage.setScene(new Scene(numberNumberLineChart, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
