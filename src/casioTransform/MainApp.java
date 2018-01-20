package casioTransform;
// TODO store data to mysql - done

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import casioTransform.view.RootLayoutController;
import casioTransform.view.directoryScanController;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	/**
	 * Constructor
	 */
	public MainApp() {

	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("AddressApp");

		// Set the application icon.
		this.primaryStage.getIcons().add(new Image("file:resources/images/address_book_32.png"));

		initRootLayout();

		showDirectoryScan();
	}

	/**
	 * Initializes the root layout and tries to load the last opened person file.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);

			// Give the controller access to the main app.
			RootLayoutController controller = loader.getController();
			controller.setMainApp(this);

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Try to load last opened person file.
		// File file = getPersonFilePath();
		// if (file != null) {
		// loadPersonDataFromFile(file);
		// }
	}

	public void showDirectoryScan() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/DirectoryScan.fxml"));
			AnchorPane directoryScan = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(directoryScan);

			// Give the controller access to the main app.
			directoryScanController controller = loader.getController();
			controller.setMainApp(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}