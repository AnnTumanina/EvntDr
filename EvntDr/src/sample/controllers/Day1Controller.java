package sample.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;


public class Day1Controller {

    @FXML
    public Label day;
    @FXML
    public TextArea textArea;
    @FXML
    public Button delete;
    @FXML
    public Button Kaomoji;
    @FXML
    public Button back;

    static StringBuilder first; //строка первого варианта
    StringBuilder finite; //строка конечного варианта
    static File file = new File("day1.txt");

    /*

     */

    //textArea.setText(String.valueOf(TextFromFile()));

    public static StringBuilder TextFromFile() {//чтение текста из файла
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                first.append(line).append("\n");
                System.out.println(first);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return first;
    }


    public void onDelete() {   //метод для очистки текстового поля
        textArea.setText("");
    } //очистка текстового поля

    public void onKaomoji() throws IOException { //метод для перехода на окно каомодзи
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Kaomoji.fxml")));
        root.setId("pane");
        Stage stage = new Stage();
        stage.setTitle("Смайлы");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onBack(ActionEvent event) throws IOException { //метод для возврата на главное окно
        //если пользователь не вносил изменения
        /*if (Objects.equals(first, finite)){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Calendar.fxml")));
            root.setId("pane");
            Stage stage = new Stage();
            stage.setTitle("Запись");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Stage close = (Stage) back.getScene().getWindow();
            close.close();
        }*/

        /*
        если пользователь внёс изменения
        */
        if (!(Objects.equals(first, finite))) {
            /* здесь должно происходить удаление файла со старой записью
            создание нового файла
            запись в него изменённого текста
            пока что тут только создание файла в корневой директории
            */
            //file.delete("...\...\...\day1.txt") - удаление изначально созданного файла
            File file1 = new File("day1.txt");  // путь должен выглядеть так же ...\...\...\day1.txt

            // записываем новые значение текстАреа
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
                bw.write(textArea.getText());
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            /*
            переход в календарь
            */
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample\\resources\\fxml\\Calendar.fxml")));
            root.setId("pane");
            Stage stage = new Stage();
            stage.setTitle("Запись");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            /*
            закрытие этого окна
            */
            Stage close = (Stage) back.getScene().getWindow();
            close.close();
        }
        /*
        * Проблемы:
        * 1) вне какого то метода нельзя установить текст в текстАреа, то есть здесь нельзя сделать так чтобы текстАреа при открытии окна автоматически считывала файл, либо я не знаю как это сделать
        * 2)Если я использовала Инициализейбл то выдавало null и программа не видела папки откуда надо считывать записывать(честно не знаю что делает инициализейбл, просто где то увидела реализацию через него но не смогла достойно адаптировать)
        * Я с помощью обжект екъюалз сравнивала то, что находится в текстАреа и null чтобы посмотреть где файл появится, запишется ли всё, он был в корневой папке и всё записал
        * но если я пыталась в методе инициализейбл сделать так чтобы при открытии окна читался тот файл из корневой директории то выдавало null и ошибку
        * * Я так подозреваю что надо сделать либо запуск метода из окна календаря(там у нас переход на окно дня, то есть на это окно) либо читать файл прям там и передавать его значения сюда как изначально устанавливаемые в текстАреа?
        * */
    }
}

