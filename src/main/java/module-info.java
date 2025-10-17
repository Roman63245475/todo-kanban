module roman.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens roman.todo to javafx.fxml;
    exports roman.todo;
}