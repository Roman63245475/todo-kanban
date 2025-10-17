module roman.todo {
    requires javafx.controls;
    requires javafx.fxml;


    opens roman.todo to javafx.fxml;
    exports roman.todo;
}