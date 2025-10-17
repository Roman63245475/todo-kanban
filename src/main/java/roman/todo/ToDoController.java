package roman.todo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoController {

    @FXML
    private ListView<String> todo;

    @FXML
    private ListView<String> done;

    @FXML
    private ListView<String> inProgress;

    @FXML
    public void getToDoName(String name){
        todo.getItems().add(name);
    }

    @FXML
    private void createToDoWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newToDo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        NewToDoController contr = fxmlLoader.getController();
        contr.setToDoController(this);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ToDoToInProgress(){
        String item = todo.getSelectionModel().getSelectedItem();
        if (item != null) {
            todo.getItems().remove(item);
            inProgress.getItems().add(item);
            todo.getSelectionModel().clearSelection();
        }
    }

    @FXML
    private void InProgressToTodo(){
        String item = inProgress.getSelectionModel().getSelectedItem();
        if (item != null) {
            inProgress.getItems().remove(item);
            todo.getItems().add(item);
            inProgress.getSelectionModel().clearSelection();
        }
    }

    @FXML
    private void InProgressToDone(){
        String item = inProgress.getSelectionModel().getSelectedItem();
        if (item != null) {
            inProgress.getItems().remove(item);
            done.getItems().add(item);
            inProgress.getSelectionModel().clearSelection();
        }
    }

    @FXML
    private void DoneToInProgress(){
        String item = done.getSelectionModel().getSelectedItem();
        if (item != null) {
            done.getItems().remove(item);
            inProgress.getItems().add(item);
            done.getSelectionModel().clearSelection();
        }
    }

}
