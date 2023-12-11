module com.example.studentmanagements {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.studentmanagements to javafx.fxml;
    exports com.example.studentmanagements;
}
