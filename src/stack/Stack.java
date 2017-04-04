/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class Stack extends Application {
   
    
    //Declaring an object of StackType class
    StackType stack = new StackType();
    
    //Declaring some important stuff
    public double x = 100 , y = 40 ;
    TextField push_text ;
    Button push_button , pop_button  , make_empty_button;
    Rectangle rect1 ,rect2 ,rect3 ,rect4 ,rect5 , rect6 , rect7 , rect8 , rect9 , rect10 ;
    Rectangle status_rect ;
    Label l1 ,l2 , l3 , l4 , l5 , l6 , l7 , l8 , l9 , l10 ;
    Label status_label , push_label;

    
    //main function 
    public static void main(String[] args) {
        
     // This function to lunch javaFX program
        launch(args);
        
    }
    
    /*
     * An overrided function from the appliction interface 
     * It takes care about the window (Stage) and almost everything
     */
    
    @Override
    public void start(final Stage window) {
        
        //set window(Stage) title
        window.setTitle("Stack");
        
        
         /*
        initlizeing the first rectangle from the top
        each rectangle includes a Rectangle and a Label 
        */
          StackPane r1 = new StackPane();               //Declar a layout to put the rectangle and the layout togather
         l1 = new Label(stack.items[9]);                //Declaring the Label
         l1.setTextFill(Color.WHITE);                   //Set the color of Label Trxt to WHITE
         l1.setFont(new Font("Cambria" , 15));          //Set the font name and size
         rect1 = new Rectangle(x , y ,Color.web("#767578"));            //Declaring the Rectangle and setiing its width , height and color
         rect1.setStroke(Color.web("#C20000"));         //set the stroke color to orange
         r1.getChildren().addAll(rect1 , l1);           //adding the the label and the Rectangle to the Layout
         
         //Second Rect
         StackPane r2 = new StackPane();
         l2 = new Label(stack.items[8]);
         l2.setTextFill(Color.WHITE);
         l2.setFont(new Font("Cambria" , 15));
         rect2 = new Rectangle(x , y ,Color.web("#767578"));
         rect2.setStroke(Color.web("#C20000"));
         rect2.getStyleClass().add("rect");
         r2.getChildren().addAll(rect2 , l2);
         
         StackPane r3 = new StackPane();
         l3 = new Label(stack.items[7]);
         l3.setTextFill(Color.WHITE);
         l3.setFont(new Font("Cambria" , 15));
         rect3 = new Rectangle(x , y ,Color.web("#767578"));
         rect3.setStroke(Color.web("#C20000"));
         rect3.getStyleClass().add("rect");
         r3.getChildren().addAll(rect3 , l3);
         
         StackPane r4 = new StackPane();
         l4 = new Label(stack.items[6]);
         l4.setTextFill(Color.WHITE);
         l4.setFont(new Font("Cambria" , 15));
         rect4 = new Rectangle(x , y ,Color.web("#767578"));
         rect4.setStroke(Color.web("#C20000"));
         rect4.getStyleClass().add("rect");
         r4.getChildren().addAll(rect4 , l4);
         
         StackPane r5 = new StackPane();
         l5 = new Label(stack.items[5]);
         l5.setTextFill(Color.WHITE);
         l5.setFont(new Font("Cambria" , 15));
         rect5 = new Rectangle(x , y ,Color.web("#767578"));
         rect5.setStroke(Color.web("#C20000"));
         rect5.getStyleClass().add("rect");
         r5.getChildren().addAll(rect5 , l5);
         
         StackPane r6 = new StackPane();
         l6 = new Label(stack.items[4]);
         l6.setTextFill(Color.WHITE);
         l6.setFont(new Font("Cambria" , 15));
         rect6 = new Rectangle(x , y ,Color.web("#767578"));
         rect6.setStroke(Color.web("#C20000"));
         rect6.getStyleClass().add("rect");
         r6.getChildren().addAll(rect6 , l6);
         
         StackPane r7 = new StackPane();
         l7 = new Label(stack.items[3]);
         l7.setTextFill(Color.WHITE);
         l7.setFont(new Font("Cambria" , 15));
         rect7 = new Rectangle(x , y ,Color.web("#767578"));
         rect7.setStroke(Color.web("#C20000"));
         rect7.getStyleClass().add("rect");
         r7.getChildren().addAll(rect7 , l7);
         
         StackPane r8 = new StackPane();
         l8 = new Label(stack.items[2]);
         l8.setTextFill(Color.WHITE);
         l8.setFont(new Font("Cambria" , 15));
         rect8 = new Rectangle(x , y ,Color.web("#767578"));
         rect8.setStroke(Color.web("#C20000"));
         rect8.getStyleClass().add("rect");
         r8.getChildren().addAll(rect8 , l8);
         
         StackPane r9= new StackPane();
         l9 = new Label(stack.items[1]);
         l9.setTextFill(Color.WHITE);
         l9.setFont(new Font("Cambria" , 15));
         rect9 = new Rectangle(x , y ,Color.web("#767578"));
         rect9.setStroke(Color.web("#C20000"));
         rect9.getStyleClass().add("rect");
         r9.getChildren().addAll(rect9 , l9);
         
         //Last Rectangle
         StackPane r10 = new StackPane();
         l10 = new Label(stack.items[0]);
         l10.setTextFill(Color.WHITE);
         l10.setFont(new Font("Cambria" , 15));
         rect10 = new Rectangle(x , y ,Color.web("#767578"));
         rect10.setStroke(Color.web("#C20000"));
         r10.getChildren().addAll(rect10 , l10);
         
         /******************************************************/
         //Deaclaring a TabPane object which will contins the three tabs ( Status , Push , Manipluation )
         final TabPane tabpane = new TabPane();
         
         
         /******************Status Tab******************/
         
         
        
         StackPane stat_lay = new StackPane();
         status_rect = new Rectangle(200 , 200 ,Color.web("#767578"));
         status_rect.setStroke(Color.web("#C20000"));
         
         try{
         status_label = new Label("IsEmpty : "+stack.isEmpty()+"\nIsFull      : "+stack.isFull()+"\nTop         : "+stack.top());
         }catch(Exception e){
         status_label = new Label("IsEmpty : "+stack.isEmpty()+"\nIsFull      : "+stack.isFull()+"\nTop         : null");
        }
        
         
        status_label.setFont(new Font("Cambria" , 15));
        stat_lay.getChildren().addAll(status_rect , status_label);
        stat_lay.setAlignment(Pos.CENTER);

        
        final Tab status = new Tab();
        status.setContent(stat_lay);
        
     
        
        
        /******************Push Tab******************/
        push_button = new Button("Push");push_text = new TextField();
        push_label = new Label("Enter the value then click push ");
        push_label.setFont(new Font("Cambria" , 15));
        push_text.setMaxWidth(150);
        
        final Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("INFORMATION MESSAGE");
        alert.setHeaderText(null);
        alert.setContentText("The stack is full !");
        
        final Alert ca = new Alert(AlertType.INFORMATION);
        ca.setTitle("INFORMATION MESSAGE");
        ca.setHeaderText(null);
        ca.setContentText("The Number of character should be between 0 and 15");
        
        
         push_button.defaultButtonProperty().bind(push_button.focusedProperty());
       
        
        push_button.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
                if(stack.isFull()) {
                     alert.showAndWait();
                }
                else if (push_text.getText().length() > 14  || push_text.getText().length() == 0){
                    ca.showAndWait();
                }
                else {
                    stack.push(push_text.getText());
                    start(window);
                }

               
            }
        
        });
        
        
       
        VBox push_layout = new VBox(20);
        push_layout.getChildren().addAll(push_label ,push_text , push_button);
        push_layout.setAlignment(Pos.CENTER);
        
        final Tab push = new Tab();
        push.setContent(push_layout);
        
         push_text.setOnKeyPressed(new EventHandler<KeyEvent>(){

            @Override
            public void handle(KeyEvent t) {
               if(t.getCode() == KeyCode.ENTER){
                   if(stack.isFull()) {
                     alert.showAndWait();
                }
                else if (push_text.getText().length() > 14  || push_text.getText().length() == 0){
                    ca.showAndWait();
                }
                else {
                    stack.push(push_text.getText());
                    start(window);
                }
                   
               }
            }
        
        });
        
        /******************Manipulation Tab******************/
        pop_button = new Button ("Pop");
        make_empty_button = new Button("Make Empty");
        
        pop_button.setMaxWidth(100);
        make_empty_button.setMaxWidth(100);
        
        pop_button.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
               stack.pop();
               start(window);
            }
            
        });
        
        make_empty_button.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
               stack.makeEmpty();
               start(window);
            }
            
        });
        
        VBox mani_layout = new VBox(20);
        
        mani_layout.getChildren().addAll(pop_button , make_empty_button);
        mani_layout.setAlignment(Pos.CENTER);
        
        final Tab mani = new Tab();
        mani.setContent(mani_layout);
        
        
        /******************************************************/
        
        //Set a label for each tab
       status.setGraphic(new Label("Status"));
       status.getGraphic().setStyle("-fx-text-fill: #FFFFFF ;");
       
               
       push.setGraphic(new Label("Push"));
       push.getGraphic().setStyle("-fx-text-fill: #FFFFFF ;");
       
       mani.setGraphic(new Label("Manipulation"));
       mani.getGraphic().setStyle("-fx-text-fill: #FFFFFF ;");
       
        //Set all tabs uncloseable
        status.setClosable(false);
        push.setClosable(false);
        mani.setClosable(false);
        
        
        
        //get all tabs the tapane
        tabpane.getTabs().addAll(status , push , mani);
        
       
        tabpane.setOnMousePressed(new EventHandler<Event>(){

            @Override
            public void handle(Event t) {
                if(tabpane.getSelectionModel().isSelected(0)){
                   status.setStyle("-fx-background-color: #66696E;");
                   push.setStyle("-fx-background-color: #C20000;");
                   mani.setStyle("-fx-background-color: #C20000;");
 
                  mani.getStyleClass().add("off");
                }
                else if(tabpane.getSelectionModel().isSelected(1)){
                   status.setStyle("-fx-background-color:#C20000;");
                   push.setStyle("-fx-background-color: #66696E;");
                   mani.setStyle("-fx-background-color: #C20000;");
                }
                else if(tabpane.getSelectionModel().isSelected(2)){
                   status.setStyle("-fx-background-color:#C20000;");
                   push.setStyle("-fx-background-color: #C20000;");
                   mani.setStyle("-fx-background-color: #66696E;");
                 }
            }
            
        });
        
        
        final SingleSelectionModel<Tab> selectionModel = tabpane.getSelectionModel();
        tabpane.setOnKeyPressed(new EventHandler<KeyEvent>(){

            @Override
            public void handle(KeyEvent t) {
                if (t.getCode() == KeyCode.DIGIT1){
                      
                     tabpane.getSelectionModel().select(0);

                   status.setStyle("-fx-background-color: #66696E;");
                   push.setStyle("-fx-background-color: #C20000;");
                   mani.setStyle("-fx-background-color: #C20000;");
                }
              
                   else if (t.getCode() == KeyCode.DIGIT2){
                   
                    tabpane.getSelectionModel().select(1);
                   
                   status.setStyle("-fx-background-color:#C20000 ;");
                   push.setStyle("-fx-background-color: #66696E;");
                   mani.setStyle("-fx-background-color: #C20000;");
 
             }
                else if (t.getCode() == KeyCode.DIGIT3){
                   
                    tabpane.getSelectionModel().select(2);
                   
                   status.setStyle("-fx-background-color: #C20000;");
                   push.setStyle("-fx-background-color: #C20000;");
                   mani.setStyle("-fx-background-color: #66696E;");
 
             }
                
            }
        
    });
        
        
       
        
       
        //The Layout which wil include all rectangles
        VBox rect_layout = new VBox();
        rect_layout.getChildren().addAll(r1 ,r2 ,r3 , r4 ,r5 , r6 , r7 , r8 , r9 ,r10);
        rect_layout.setAlignment(Pos.CENTER);
        
        //the main layout which will includes everything
        BorderPane main_layout = new BorderPane();
        
        main_layout.setRight(rect_layout);
        main_layout.setCenter(tabpane);
        main_layout.setBottom(null);
        
        
        //the scene is contains all components
        final Scene scene = new Scene(main_layout , 600 , 550 );
         
        
        //CSS
        
        scene.getStylesheets().add(Stack.class.getResource("Style.css").toExternalForm());     
        
        tabpane.getStyleClass().add("tabpane");
        
        status.getStyleClass().add("status");
        push.getStyleClass().add("tabs");
        mani.getStyleClass().add("tabs");
        
        status_label.getStyleClass().add("comp");
        push_label.getStyleClass().add("comp");
        
        push_button.getStyleClass().add("btn");
        pop_button.getStyleClass().add("btn");
        make_empty_button.getStyleClass().add("btn");
        
        main_layout.getStyleClass().add("main_layout");
        
        window.getIcons().add(new Image(Stack.class.getResourceAsStream("stack_icon.png")));
        // set the scene to the window and show it
        window.setScene(scene);
        window.show();
        
      
    }


    
}
