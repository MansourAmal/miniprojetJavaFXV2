module CARdash {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.base,javafx.graphics, javafx.fxml;
}
