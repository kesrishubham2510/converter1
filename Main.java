package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader= new FXMLLoader(getClass().getResource("sample.fxml"));
        VBox rootnode =loader.load();
        MenuBar menuBar=createMenu();//creating a menubar
        rootnode.getChildren().add(0,menuBar);
        primaryStage.setTitle("Converter!!");
        primaryStage.setScene(new Scene(rootnode, 550, 400));
        primaryStage.show();
    }

    private MenuBar createMenu() {
        MenuBar menu=new MenuBar();

        //creating a file menu
        Menu filemenu =new Menu("File");
         MenuItem Exit=new MenuItem("Exit");
         Exit.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 Platform.exit();
             }
         });
         MenuItem refresh=new MenuItem("Refresh");

         refresh.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 System.out.println(69);
             }
         });
        SeparatorMenuItem s1=new SeparatorMenuItem();
        SeparatorMenuItem s2=new SeparatorMenuItem();
        SeparatorMenuItem s3=new SeparatorMenuItem();
        filemenu.getItems().addAll(Exit);
           //creating a help menu
        Menu HelpMenu=new Menu("Help");
         MenuItem Developer=new MenuItem("About us");
         Developer.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 develop();
             }
         });
         MenuItem AboutApp=new MenuItem("Click Me");
         AboutApp.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 functionality();
             }
         });
         HelpMenu.getItems().addAll(Developer,s2,AboutApp);
         //creating a user guide
        Menu guide=new Menu("Info");
          MenuItem userManual=new MenuItem("User Manual");
           userManual.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                   displayManual();
               }
           });
           guide.getItems().addAll(userManual);

         //creating a menuBar
        menu.getMenus().addAll(filemenu,HelpMenu,guide);
        return menu;

    }

    private void displayManual() {

   Alert manual=new Alert(Alert.AlertType.INFORMATION);
   manual.setTitle("User Manual!!");
   manual.setContentText("1. First choose what u want to convert. U can chooose between Temperature,Volume,Mass,Length and Area. \n\n 2. Select the conversion units followed by entering the value. \n\n3. Hit ''Convert'' Button ");
  // manual.setContentText("2.In the Grey box down below enter the value.");
  // manual.setContentText("3.Select the S.I units to convert from to which S.I unit to convert and Click on Convert button.");
 // Alert ma1=new Alert(Alert.AlertType.CONFIRMATION);
  //ma1.show();
   manual.show();
    }

    private void functionality() {
        Alert dialog2=new Alert(Alert.AlertType.INFORMATION);
        dialog2.setTitle("Functionality");
        dialog2.setContentText("This converter can be used to to do some simple conversions of Mass,Length,Volume,Temperature and Area");
        dialog2.show();
    }

    private void develop() {
    Alert dialog=new Alert(Alert.AlertType.INFORMATION);
    dialog.setContentText("This GUI Application is build by Shubham Kesri of ITER using Javafx and helps to do simple conversions.!!");
    dialog.setTitle("About Developer");
   // ButtonType yesButton =new ButtonType("yes");
   // ButtonType noButton =new ButtonType("No");
  //  dialog.getButtonTypes().setAll(yesButton,noButton);
    dialog.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
