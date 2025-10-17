package roman.todo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewToDoController {
    @FXML
    private TextField newToDoName;

    private ToDoController toDoController;

    @FXML
    private void createToDo() {
        String text = newToDoName.getText();
        if (!text.equals("")){
            toDoController.getToDoName(text);
            Stage stage = (Stage) newToDoName.getScene().getWindow();
            stage.close();
        }
    }

    public void setToDoController(ToDoController toDoController) {
        this.toDoController = toDoController;
    }
}
