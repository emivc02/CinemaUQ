module co.edu.uniquindio.poo.proyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.proyecto to javafx.fxml;
    exports co.edu.uniquindio.poo.proyecto;
}