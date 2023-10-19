module br.edu.principal {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.principal to javafx.fxml;
    exports br.edu.principal;
}
