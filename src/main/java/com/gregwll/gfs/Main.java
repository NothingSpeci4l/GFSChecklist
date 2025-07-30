package com.gregwll.gfs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        var url = getClass().getResource("/waitingconnection.fxml");
        if (url == null) {
            System.err.println("waitingconnection.fxml introuvable !");
            System.exit(1);
        }

        stage.setTitle("GFS System");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(FXMLLoader.load(url)));
        stage.setResizable(false);
        stage.show();

        // cond if connection
    }
}
