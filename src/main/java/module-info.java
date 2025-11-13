module club.nullbyte3.otp22 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens club.nullbyte3.otp22 to javafx.fxml;
    exports club.nullbyte3.otp22;
}