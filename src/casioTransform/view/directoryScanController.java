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
import casioTransform.model.Z001;
import casioTransform.model.Z002;
import casioTransform.model.Z005;
import casioTransform.model.Z020;
import casioTransform.util.Z001Util;
import casioTransform.util.Z002Util;
import casioTransform.util.Z005Util;
import casioTransform.util.Z020Util;
import javafx.application.Preloader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class directoryScanController {
	public static ObservableList<Z001> z001Entries = FXCollections.observableArrayList();
	public static ObservableList<Z002> z002Entries = FXCollections.observableArrayList();
	public static ObservableList<Z005> z005Entries = FXCollections.observableArrayList();
	public static ObservableList<Z020> z020Entries = FXCollections.observableArrayList();
	File selectedDirectory;
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

	@FXML
	private Label directoryNameLabel;

	@FXML
	private Label scanCountLabel;

	@FXML
	void selectDirectory(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		selectedDirectory = directoryChooser.showDialog(null);

		if (selectedDirectory == null) {
			System.out.println("No Directory selected");
		} else {
			directoryNameLabel.setText(selectedDirectory.getAbsolutePath());
			System.out.println("Directory selected |" + selectedDirectory.getAbsolutePath() + "|");
		}
	}

	@FXML
	void startScan(ActionEvent event) {
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
	@FXML
	void handleSaveToDatabase(ActionEvent event) throws SQLException {
		System.out.println("save to database");
		System.out.println("z001 counter: " + z001Entries.size());
		System.out.println("z002 counter: " + z002Entries.size());
		System.out.println("z005 counter: " + z005Entries.size());
		System.out.println("z020 counter: " + z020Entries.size());
		zBatchUpdate();
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
