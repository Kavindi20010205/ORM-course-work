module org.example.course3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.course3 to javafx.fxml;
    exports org.example.course3;
}