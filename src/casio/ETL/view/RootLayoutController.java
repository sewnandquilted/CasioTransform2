package casio.ETL.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;

import casio.ETL.MainApp;
import casio.ETL.model.*;
import casio.ETL.util.Z001Util;
import casio.ETL.util.Z002Util;
import casio.ETL.util.Z005Util;
import casio.ETL.util.Z020Util;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController {
	public static ObservableList<Z001> z001Entries = FXCollections.observableArrayList();
	public static ObservableList<Z002> z002Entries = FXCollections.observableArrayList();
	public static ObservableList<Z005> z005Entries = FXCollections.observableArrayList();
	public static ObservableList<Z020> z020Entries = FXCollections.observableArrayList();


	// Reference to the main application
	private MainApp mainApp;

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * Creates an empty address book.
	 */
	@FXML
	private void handleNew() {
		mainApp.getPersonData().clear();
		mainApp.setPersonFilePath(null);
	}

	/**
	 * Opens a FileChooser to let the user select an address book to load.
	 */
	@FXML
	private void handleOpen() {
		FileChooser fileChooser = new FileChooser();

		// Set extension filter
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
		fileChooser.getExtensionFilters().add(extFilter);

		// Show save file dialog
		File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());

		if (file != null) {
			mainApp.loadPersonDataFromFile(file);
		}
	}

	/**
	 * Saves the file to the person file that is currently open. If there is no open
	 * file, the "save as" dialog is shown.
	 */
	@FXML
	private void handleSave() {
		File personFile = mainApp.getPersonFilePath();
		if (personFile != null) {
			mainApp.savePersonDataToFile(personFile);
		} else {
			handleSaveAs();
		}
	}

	/**
	 * Opens a FileChooser to let the user select a file to save to.
	 */
	@FXML
	private void handleSaveAs() {
		FileChooser fileChooser = new FileChooser();

		// Set extension filter
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml");
		fileChooser.getExtensionFilters().add(extFilter);

		// Show save file dialog
		File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());

		if (file != null) {
			// Make sure it has the correct extension
			if (!file.getPath().endsWith(".xml")) {
				file = new File(file.getPath() + ".xml");
			}
			mainApp.savePersonDataToFile(file);
		}
	}

	/**
	 * Opens an about dialog.
	 */
	@FXML
	private void handleAbout() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("AddressApp");
		alert.setHeaderText("About");
		alert.setContentText("Author: Marco Jakob\nWebsite: http://code.makery.ch");

		alert.showAndWait();
	}

	/**
	 * Closes the application.
	 */
	@FXML
	private void handleExit() {
		System.out.println("z001 counter: "+z001Entries.size());
		System.out.println("z002 counter: "+z002Entries.size());
		System.out.println("z005 counter: "+z005Entries.size());
		System.out.println("z020 counter: "+z020Entries.size());
		System.exit(0);
	}

	/**
	 * Opens the birthday statistics.
	 */
	@FXML
	private void handleShowBirthdayStatistics() {
		mainApp.showBirthdayStatistics();
	}

	@FXML
	void handleZ001Select(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDirectory = directoryChooser.showDialog(null);

		if (selectedDirectory == null) {
			System.out.println("No Directory selected");
		} else {
			System.out.println("Directory selected |" + selectedDirectory.getAbsolutePath() + "|");
			try {
				Files.walk(selectedDirectory.toPath(), FileVisitOption.FOLLOW_LINKS).filter(Files::isRegularFile)
						.filter(p -> p.getFileName().toString().startsWith("Z0"))
						.filter(p -> p.getFileName().toString().endsWith(".CSV")).forEach(filePath -> {
							try {
//								System.out.println("file opened |" + filePath + "|");
								String zType = filePath.getFileName().toString().substring(0, 4);
//								System.out.println("zType is "+ zType);
								switch (zType) {
								case "Z001": {
									z001Entries.add(Z001Util.extractZ001from(filePath));
									break;
								}
								case "Z002": {
									z002Entries.add(Z002Util.extractZ002from(filePath));
									break;
								}
								case "Z005": {
									z005Entries.add(Z005Util.extractZ005from(filePath));
									break;
								}
								case "Z020": {
									z020Entries.add(Z020Util.extractZ020from(filePath));
									break;
								}
								default: {
								}
								}
								;
							} catch (IOException e) {
								e.printStackTrace();
							}

						});
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@FXML
	void handlez001Scan(ActionEvent event) {

	}
}