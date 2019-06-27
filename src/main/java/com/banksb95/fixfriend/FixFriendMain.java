package com.banksb95.fixfriend;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FixFriendMain extends Application {

    public FixFriendMain(){}

    private final static Logger logger = LogManager.getLogger(FixFriendMain.class);

    public static void main(String args[]) {
//        launch(args);
        Application.launch(args);
//        FixFriendMain fixFriendMain = new FixFriendMain();
//        fixFriendMain.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FixFriend.fxml"));

        Scene scene = new Scene(root, 1024, 768);

        Stage stage = new Stage();
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    static void doSomething(){
        logger.info("S doSomething()");
    }

}