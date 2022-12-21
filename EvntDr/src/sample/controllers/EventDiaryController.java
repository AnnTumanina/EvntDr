package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventDiaryController {

    @FXML
    public Button day1;
    @FXML
    public Button day2;
    @FXML
    public Button day3;
    @FXML
    public Button day4;
    @FXML
    public Button day5;
    @FXML
    public Button day6;
    @FXML
    public Button day7;
    @FXML
    public Button day8;
    @FXML
    public Button day9;
    @FXML
    public Button day10;
    @FXML
    public Button day11;
    @FXML
    public Button day12;
    @FXML
    public Button day13;
    @FXML
    public Button day14;
    @FXML
    public Button day15;
    @FXML
    public Button day16;
    @FXML
    public Button day17;
    @FXML
    public Button day18;
    @FXML
    public Button day19;
    @FXML
    public Button day20;
    @FXML
    public Button day21;
    @FXML
    public Button day22;
    @FXML
    public Button day23;
    @FXML
    public Button day24;
    @FXML
    public Button day25;
    @FXML
    public Button day26;
    @FXML
    public Button day27;
    @FXML
    public Button day28;
    @FXML
    public Button day29;
    @FXML
    public Button day30;
    @FXML
    public Button delAll;
    @FXML
    public Label eventDiary;


    public void onDay1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day1.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day1.getScene().getWindow();
        close.close();
    }

    public void onDay2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day2.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day2.getScene().getWindow();
        close.close();
    }
    public void onDay3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day3.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day3.getScene().getWindow();
        close.close();
    }
    public void onDay4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day4.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day4.getScene().getWindow();
        close.close();
    }
    public void onDay5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day5.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day5.getScene().getWindow();
        close.close();
    }
    public void onDay6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day6.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day6.getScene().getWindow();
        close.close();
    }
    public void onDay7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day7.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day7.getScene().getWindow();
        close.close();
    }
    public void onDay8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day8.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day8.getScene().getWindow();
        close.close();
    }
    public void onDay9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day9.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day9.getScene().getWindow();
        close.close();
    }
    public void onDay10(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day10.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day10.getScene().getWindow();
        close.close();
    }
    public void onDay11(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day11.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day11.getScene().getWindow();
        close.close();
    }
    public void onDay12(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day12.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day12.getScene().getWindow();
        close.close();
    }
    public void onDay13(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day13.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day13.getScene().getWindow();
        close.close();
    }
    public void onDay14(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day14.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day14.getScene().getWindow();
        close.close();
    }
    public void onDay15(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day15.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day15.getScene().getWindow();
        close.close();
    }
    public void onDay16(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day16.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day16.getScene().getWindow();
        close.close();
    }
    public void onDay17(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day17.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day17.getScene().getWindow();
        close.close();
    }
    public void onDay18(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day18.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day18.getScene().getWindow();
        close.close();
    }
    public void onDay19(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Da19.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day19.getScene().getWindow();
        close.close();
    }
    public void onDay20(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day20.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day20.getScene().getWindow();
        close.close();
    }
    public void onDay21(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day21.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day21.getScene().getWindow();
        close.close();
    }
    public void onDay22(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day22.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day22.getScene().getWindow();
        close.close();
    }
    public void onDay23(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day23.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day23.getScene().getWindow();
        close.close();
    }
    public void onDay24(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day24.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day24.getScene().getWindow();
        close.close();
    }
    public void onDay25(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day25.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day25.getScene().getWindow();
        close.close();
    }
    public void onDay26(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day26.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day26.getScene().getWindow();
        close.close();
    }
    public void onDay27(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day27.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day27.getScene().getWindow();
        close.close();
    }
    public void onDay28(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day28.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day28.getScene().getWindow();
        close.close();
    }
    public void onDay29(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day29.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day29.getScene().getWindow();
        close.close();
    }
    public void onDay30(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Day30.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Запись");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Stage close = (Stage) day30.getScene().getWindow();
        close.close();
    }
    public void onDelAll(ActionEvent event) throws IOException {
    }

}