package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class KaomojiController {
    public Button close;
    public void onClose() { //метод для возврата на главное окно
        Stage cl = (Stage) close.getScene().getWindow();
        cl.close();
    }
}
