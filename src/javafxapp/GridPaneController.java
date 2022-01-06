/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ListChangeListener;
import javafx.concurrent.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author Denis
 */
public class GridPaneController implements Initializable {
@FXML private TextField pathId;
@FXML private TextField endId;
@FXML private ProgressBar barId;
@FXML private ListView<String> listId;
 private Task task;

 @Override
 public void initialize(URL url, ResourceBundle rb) {
        JavaFXApp.items.addListener(new ListChangeListener() {
            @Override
            public void onChanged(ListChangeListener.Change obj) {
                listId.setItems(obj.getList());
            }
        });
    } 
    @FXML
    protected void btnFindClick(ActionEvent event)
    {
       String path =pathId.getText();
       String end = endId.getText();
       JavaFXApp.items.clear();
       
       task =new FindTask(JavaFXApp.items, path, end);
       barId.progressProperty().bind(task.progressProperty());
       
       Thread thread = new Thread(task);
       thread.setDaemon(true);
       thread.start();
       
       
      
        
    }
    
    @FXML
    protected void btnCancelClick(ActionEvent event)
    {
        if(task!=null) task.cancel();
    }
    
      
    
}
