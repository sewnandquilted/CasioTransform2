package casioTransform.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import casioTransform.MainApp;
import casioTransform.model.*;
import casioTransform.util.Z001Util;
import casioTransform.util.Z002Util;
import casioTransform.util.Z005Util;
import casioTransform.util.Z020Util;
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

//		if (file != null) {
//			mainApp.loadPersonDataFromFile(file);
//		}
	}

	/**
	 * Saves the file to the person file that is currently open. If there is no open
	 * file, the "save as" dialog is shown.
	 */
	@FXML
	private void handleSave() {
//		File personFile = mainApp.getPersonFilePath();
//		if (personFile != null) {
//			mainApp.savePersonDataToFile(personFile);
//		} else {
//			handleSaveAs();
//		}
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

//		if (file != null) {
//			// Make sure it has the correct extension
//			if (!file.getPath().endsWith(".xml")) {
//				file = new File(file.getPath() + ".xml");
//			}
//			mainApp.savePersonDataToFile(file);
//		}
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
		System.out.println("z001 counter: " + z001Entries.size());
		System.out.println("z002 counter: " + z002Entries.size());
		System.out.println("z005 counter: " + z005Entries.size());
		System.out.println("z020 counter: " + z020Entries.size());
		System.exit(0);
	}

	@FXML
	void handleSaveToDatabase(ActionEvent event) throws SQLException {
		System.out.println("save to database");
		System.out.println("z001 counter: " + z001Entries.size());
		System.out.println("z002 counter: " + z002Entries.size());
		System.out.println("z005 counter: " + z005Entries.size());
		System.out.println("z020 counter: " + z020Entries.size());
		zBatchUpdate();
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
								// System.out.println("file opened |" + filePath + "|");
								String zType = filePath.getFileName().toString().substring(0, 4);
								// System.out.println("zType is "+ zType);
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

	public static void zBatchUpdate() throws SQLException {
		// create a java mysql database connection
		String myDriver = "org.gjt.mm.mysql.Driver";
		String myUrl = "jdbc:mysql://localhost/test";
		try {
			Class.forName(myDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection(myUrl, "root", "");

		Statement stmt = null;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			stmt.addBatch("truncate z001");
			stmt.addBatch("truncate z002");
			stmt.addBatch("truncate z005");
			stmt.addBatch("truncate z020");
			int[] updateCounts0	 = stmt.executeBatch();
			conn.commit();
			for (Z001 z1: z001Entries) {
				stmt.addBatch(Z001Util.Z001UpdateString(z1));
			}
			int[] updateCounts1 = stmt.executeBatch();
			conn.commit();
			for (Z002 z2: z002Entries) {
				stmt.addBatch(Z002Util.Z002UpdateString(z2));
			}
			int[] updateCounts2 = stmt.executeBatch();
			conn.commit();
			for (Z020 z20: z020Entries) {
				stmt.addBatch(Z020Util.Z020UpdateString(z20));
			}
			int[] updateCounts20 = stmt.executeBatch();
			conn.commit();
			for (Z005 z5: z005Entries) {
				stmt.addBatch(Z005Util.Z005UpdateString(z5));
			}
			int[] updateCounts5 = stmt.executeBatch();
			conn.commit();

		} catch (BatchUpdateException b) {
			printBatchUpdateException(b);
		} catch (SQLException ex) {
			printSQLException(ex);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			conn.setAutoCommit(true);
		}
	}

	public static void getWarningsFromResultSet(ResultSet rs) throws SQLException {
		printWarnings(rs.getWarnings());
	}

	public static void getWarningsFromStatement(Statement stmt) throws SQLException {
		printWarnings(stmt.getWarnings());
	}

	public static void printWarnings(SQLWarning warning) throws SQLException {

		if (warning != null) {
			System.out.println("\n---Warning---\n");

			while (warning != null) {
				System.out.println("Message: " + warning.getMessage());
				System.out.println("SQLState: " + warning.getSQLState());
				System.out.print("Vendor error code: ");
				System.out.println(warning.getErrorCode());
				System.out.println("");
				warning = warning.getNextWarning();
			}
		}
	}

	public static void printBatchUpdateException(BatchUpdateException b) {

		System.err.println("----BatchUpdateException----");
		System.err.println("SQLState:  " + b.getSQLState());
		System.err.println("Message:  " + b.getMessage());
		System.err.println("Vendor:  " + b.getErrorCode());
		System.err.print("Update counts:  ");
		int[] updateCounts = b.getUpdateCounts();

		for (int i = 0; i < updateCounts.length; i++) {
			System.err.print(updateCounts[i] + "   ");
		}
	}

	public static void printSQLException(SQLException ex) {

		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				if (ignoreSQLException(((SQLException) e).getSQLState()) == false) {

					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());

					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());

					System.err.println("Message: " + e.getMessage());

					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
	}

	public static boolean ignoreSQLException(String sqlState) {

		if (sqlState == null) {
			System.out.println("The SQL state is not defined!");
			return false;
		}

		// X0Y32: Jar file already exists in schema
		if (sqlState.equalsIgnoreCase("X0Y32"))
			return true;

		// 42Y55: Table already exists in schema
		if (sqlState.equalsIgnoreCase("42Y55"))
			return true;

		return false;
	}

}