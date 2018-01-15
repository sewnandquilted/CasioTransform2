package casioTransform.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Scanner;

import casioTransform.model.Z001;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Z001Util {

	private Connection con;

	public static String Z001UpdateString(Z001 z1) {
		String longstmt = "insert into z001 set " + "avrgAmount = " + z1.getAvrgAmount().toString() + ","
				+ "avrgQuantity = " + z1.getAvrgQuantity().toString() + "," + "c1Amount = "
				+ z1.getC1Amount().toString() + "," + "c1Quantity = " + z1.getC1Quantity().toString() + ","
				+ "c2Amount = " + z1.getC2Amount().toString() + "," + "c2Quantity = " + z1.getC2Quantity().toString()
				+ "," + "caid2Amount = " + z1.getCaid2Amount().toString() + "," + "caid2Quantity = "
				+ z1.getCaid2Quantity().toString() + "," + "cancelAmount = " + z1.getCancelAmount().toString() + ","
				+ "cancelQuantity = " + z1.getCancelQuantity().toString() + "," + "cashindrawAmount = "
				+ z1.getCashindrawAmount().toString() + "," + "cashindrawQuantity = "
				+ z1.getCashindrawQuantity().toString() + "," + "ceca1Amount = " + z1.getCeca1Amount().toString() + ","
				+ "ceca1Quantity = " + z1.getCeca1Quantity().toString() + "," + "ceca2Amount = "
				+ z1.getCeca2Amount().toString() + "," + "ceca2Quantity = " + z1.getCeca2Quantity().toString() + ","
				+ "ceck1Amount = " + z1.getCeck1Amount().toString() + "," + "ceck1Quantity = "
				+ z1.getCeck1Quantity().toString() + "," + "ceck2Amount = " + z1.getCeck2Amount().toString() + ","
				+ "ceck2Quantity = " + z1.getCeck2Quantity().toString() + "," + "chid2Amount = "
				+ z1.getChid2Amount().toString() + "," + "chid2Quantity = " + z1.getChid2Quantity().toString() + ","
				+ "chidAmount = " + z1.getChidAmount().toString() + "," + "chidQuantity = "
				+ z1.getChidQuantity().toString() + "," + "ckid2Amount = " + z1.getCkid2Amount().toString() + ","
				+ "ckid2Quantity = " + z1.getCkid2Quantity().toString() + "," + "ckidAmount = "
				+ z1.getCkidAmount().toString() + "," + "ckidQuantity = " + z1.getCkidQuantity().toString() + ","
				+ "couponAmount = " + z1.getCouponAmount().toString() + "," + "couponQuantity = "
				+ z1.getCouponQuantity().toString() + "," + "crid1Amount = " + z1.getCrid1Amount().toString() + ","
				+ "crid1Quantity = " + z1.getCrid1Quantity().toString() + "," + "crid21Amount = "
				+ z1.getCrid21Amount().toString() + "," + "crid21Quantity = " + z1.getCrid21Quantity().toString() + ","
				+ "crid22Amount = " + z1.getCrid22Amount().toString() + "," + "crid22Quantity = "
				+ z1.getCrid22Quantity().toString() + "," + "crid23Amount = " + z1.getCrid23Amount().toString() + ","
				+ "crid23Quantity = " + z1.getCrid23Quantity().toString() + "," + "crid24Amount = "
				+ z1.getCrid24Amount().toString() + "," + "crid24Quantity = " + z1.getCrid24Quantity().toString() + ","
				+ "crid2Amount = " + z1.getCrid2Amount().toString() + "," + "crid2Quantity = "
				+ z1.getCrid2Quantity().toString() + "," + "crid3Amount = " + z1.getCrid3Amount().toString() + ","
				+ "crid3Quantity = " + z1.getCrid3Quantity().toString() + "," + "crid4Amount = "
				+ z1.getCrid4Amount().toString() + "," + "crid4Quantity = " + z1.getCrid4Quantity().toString() + ","
				+ "custAmount = " + z1.getCustAmount().toString() + "," + "custQuantity = "
				+ z1.getCustQuantity().toString() + "," + "dcAmount = " + z1.getDcAmount().toString() + ","
				+ "dcQuantity = " + z1.getDcQuantity().toString() + "," + "declaAmount = "
				+ z1.getDeclaAmount().toString() + "," + "declaQuantity = " + z1.getDeclaQuantity().toString() + ","
				+ "grossAmount = " + z1.getGrossAmount().toString() + "," + "grossQuantity = "
				+ z1.getGrossQuantity().toString() + "," + "gstincludedAmount = " + z1.getGstincludedAmount().toString()
				+ "," + "gstincludedQuantity = " + z1.getGstincludedQuantity().toString() + "," + "netAmount = "
				+ z1.getNetAmount().toString() + "," + "netQuantity = " + z1.getNetQuantity().toString() + ","
				+ "nontaxAmount = " + z1.getNontaxAmount().toString() + "," + "nontaxQuantity = "
				+ z1.getNontaxQuantity().toString() + "," + "refundAmount = " + z1.getRefundAmount().toString() + ","
				+ "refundQuantity = " + z1.getRefundQuantity().toString() + "," + "rfAmount = "
				+ z1.getRfAmount().toString() + "," + "rfQuantity = " + z1.getRfQuantity().toString() + ","
				+ "round1Amount = " + z1.getRound1Amount().toString() + "," + "round1Quantity = "
				+ z1.getRound1Quantity().toString() + "," + "round2Amount = " + z1.getRound2Amount().toString() + ","
				+ "round2Quantity = " + z1.getRound2Quantity().toString() + "," + "ta2Amount = "
				+ z1.getTa2Amount().toString() + "," + "ta2Quantity = " + z1.getTa2Quantity().toString() + ","
				+ "ta3Amount = " + z1.getTa3Amount().toString() + "," + "ta3Quantity = "
				+ z1.getTa3Quantity().toString() + "," + "ta4Amount = " + z1.getTa4Amount().toString() + ","
				+ "ta4Quantity = " + z1.getTa4Quantity().toString() + "," + "taxableamtAmount = "
				+ z1.getTaxableamtAmount().toString() + "," + "taxableamtQuantity = "
				+ z1.getTaxableamtQuantity().toString() + "," + "tx2Amount = " + z1.getTx2Amount().toString() + ","
				+ "tx2Quantity = " + z1.getTx2Quantity().toString() + "," + "tx3Amount = "
				+ z1.getTx3Amount().toString() + "," + "tx3Quantity = " + z1.getTx3Quantity().toString() + ","
				+ "tx4Amount = " + z1.getTx4Amount().toString() + "," + "tx4Quantity = "
				+ z1.getTx4Quantity().toString() + "," 
				
				+ "z01date = str_to_date('" + z1.getZ01date().toString().replaceAll("/", "-") + " " + z1.getZ01time().toString() + "' , '%d-%m-%Y %H:%i')," 
				
				+ "z01file = '" + z1.getZ01file().toString() + "'," + "z01machine = '"
				+ z1.getZ01machine().toString() + "'," + "z01mode = '" + z1.getZ01mode().toString() + "',"
				+ "z01model = '" + z1.getZ01model().toString() + "'," + "z01report = '" + z1.getZ01report().toString()
				+ "'," + "z01zcounter = " + z1.getZ01zcounter();

//		System.out.println(longstmt);
		return longstmt;
	}

	public static void z001WriteDatabase() {
		try {
			// create a java mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost/test";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");

			// create the java mysql update preparedstatement
			String query = "update users set num_points = ? where first_name = ?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt(1, 6000);
			preparedStmt.setString(2, "Fred");

			// execute the java preparedstatement
			preparedStmt.executeUpdate();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}


	public static Z001 extractZ001from(Path filePath) throws IOException {
		Z001 z01 = new Z001();
		String line = null;
		Scanner s = new Scanner(filePath.toFile());
		while (s.hasNextLine()) {
			// n.b. there are only one or two fields per line:
			// each file generates a single Z001 record
			line = s.nextLine();
			String split[] = line.split("\",\"");
			for (int i = 0; i < split.length; i++) {
				split[i] = split[i].replaceAll("\"", "").trim();
			}
			switch (split[0]) {
			case "MODEL": {
				z01.setZ01model(split[1]);
				break;
			}
			case "MACHINE": {
				z01.setZ01machine(split[1]);
				break;
			}
			case "REPORT": {
				z01.setZ01report(split[1]);
				break;
			}
			case "FILE": {
				z01.setZ01file(split[1]);
				break;
			}
			case "MODE": {
				z01.setZ01mode(split[1]);
				break;
			}
			case "Z COUNTER": {
				z01.setZ01zcounter(Integer.parseInt(split[1]));
				break;
			}
			case "DATE": {
				z01.setZ01date(split[1]);
				break;
			}
			case "TIME": {
				z01.setZ01time(split[1]);
				break;
			}
			// case "": {
			// }
			// case "RECORD": {
			// }
			case "0001": {
				z01.setGrossQuantity(valueOf(split[2]));
				z01.setGrossAmount(valueOf(split[3]));
				break;
			}
			case "0002": {
				z01.setNetQuantity(valueOf(split[2]));
				z01.setNetAmount(valueOf(split[3]));
				break;
			}
			case "0003": {
				z01.setCashindrawQuantity(valueOf(split[2]));
				z01.setCashindrawAmount(valueOf(split[3]));
				break;
			}
			case "0004": {
				z01.setChidQuantity(valueOf(split[2]));
				z01.setChidAmount(valueOf(split[3]));
				break;
			}
			case "0005": {
				z01.setCkidQuantity(valueOf(split[2]));
				z01.setCkidAmount(valueOf(split[3]));
				break;
			}
			case "0006": {
				z01.setCrid1Quantity(valueOf(split[2]));
				z01.setCrid1Amount(valueOf(split[3]));
				break;
			}
			case "0007": {
				z01.setCrid2Quantity(valueOf(split[2]));
				z01.setCrid2Amount(valueOf(split[3]));
				break;
			}
			case "0008": {
				z01.setCrid3Quantity(valueOf(split[2]));
				z01.setCrid3Amount(valueOf(split[3]));
				break;
			}
			case "0009": {
				z01.setCrid4Quantity(valueOf(split[2]));
				z01.setCrid4Amount(valueOf(split[3]));
				break;
			}
			case "0010": {
				z01.setCaid2Quantity(valueOf(split[2]));
				z01.setCaid2Amount(valueOf(split[3]));
				break;
			}
			case "0011": {
				z01.setChid2Quantity(valueOf(split[2]));
				z01.setChid2Amount(valueOf(split[3]));
				break;
			}
			case "0012": {
				z01.setCkid2Quantity(valueOf(split[2]));
				z01.setCkid2Amount(valueOf(split[3]));
				break;
			}
			case "0013": {
				z01.setCrid21Quantity(valueOf(split[2]));
				z01.setCrid21Amount(valueOf(split[3]));
				break;
			}
			case "0014": {
				z01.setCrid22Quantity(valueOf(split[2]));
				z01.setCrid22Amount(valueOf(split[3]));
				break;
			}
			case "0015": {
				z01.setCrid23Quantity(valueOf(split[2]));
				z01.setCrid23Amount(valueOf(split[3]));
				break;
			}
			case "0016": {
				z01.setCrid24Quantity(valueOf(split[2]));
				z01.setCrid24Amount(valueOf(split[3]));
				break;
			}
			case "0017": {
				z01.setRfQuantity(valueOf(split[2]));
				z01.setRfAmount(valueOf(split[3]));
				break;
			}
			case "0018": {
				z01.setCustQuantity(valueOf(split[2]));
				z01.setCustAmount(valueOf(split[3]));
				break;
			}
			case "0019": {
				z01.setAvrgQuantity(valueOf(split[2]));
				z01.setAvrgAmount(valueOf(split[3]));
				break;
			}
			case "0020": {
				z01.setC1Quantity(valueOf(split[2]));
				z01.setC1Amount(valueOf(split[3]));
				break;
			}
			case "0021": {
				z01.setC2Quantity(valueOf(split[2]));
				z01.setC2Amount(valueOf(split[3]));
				break;
			}
			case "0022": {
				z01.setCeca1Quantity(valueOf(split[2]));
				z01.setCeca1Amount(valueOf(split[3]));
				break;
			}
			case "0023": {
				z01.setCeck1Quantity(valueOf(split[2]));
				z01.setCeck1Amount(valueOf(split[3]));
				break;
			}
			case "0024": {
				z01.setCeca2Quantity(valueOf(split[2]));
				z01.setCeca2Amount(valueOf(split[3]));
				break;
			}
			case "0025": {
				z01.setCeck2Quantity(valueOf(split[2]));
				z01.setCeck2Amount(valueOf(split[3]));
				break;
			}
			case "0026": {
				z01.setDcQuantity(valueOf(split[2]));
				z01.setDcAmount(valueOf(split[3]));
				break;
			}
			case "0027": {
				z01.setCouponQuantity(valueOf(split[2]));
				z01.setCouponAmount(valueOf(split[3]));
				break;
			}
			case "0028": {
				z01.setRefundQuantity(valueOf(split[2]));
				z01.setRefundAmount(valueOf(split[3]));
				break;
			}
			case "0029": {
				z01.setRound1Quantity(valueOf(split[2]));
				z01.setRound1Amount(valueOf(split[3]));
				break;
			}
			case "0030": {
				z01.setRound2Quantity(valueOf(split[2]));
				z01.setRound2Amount(valueOf(split[3]));
				break;
			}
			case "0031": {
				z01.setCancelQuantity(valueOf(split[2]));
				z01.setCancelAmount(valueOf(split[3]));
				break;
			}
			case "0032": {
				z01.setDeclaQuantity(valueOf(split[2]));
				z01.setDeclaAmount(valueOf(split[3]));
				break;
			}
			case "0033": {
				z01.setTaxableamtQuantity(valueOf(split[2]));
				z01.setTaxableamtAmount(valueOf(split[3]));
				break;
			}
			case "0034": {
				z01.setGstincludedQuantity(valueOf(split[2]));
				z01.setGstincludedAmount(valueOf(split[3]));
				break;
			}
			case "0035": {
				z01.setTa2Quantity(valueOf(split[2]));
				z01.setTa2Amount(valueOf(split[3]));
				break;
			}
			case "0036": {
				z01.setTx2Quantity(valueOf(split[2]));
				z01.setTx2Amount(valueOf(split[3]));
				break;
			}
			case "0037": {
				z01.setTa3Quantity(valueOf(split[2]));
				z01.setTa3Amount(valueOf(split[3]));
				break;
			}
			case "0038": {
				z01.setTx3Quantity(valueOf(split[2]));
				z01.setTx3Amount(valueOf(split[3]));
				break;
			}
			case "0039": {
				z01.setTa4Quantity(valueOf(split[2]));
				z01.setTa4Amount(valueOf(split[3]));
				break;
			}
			case "0040": {
				z01.setTx4Quantity(valueOf(split[2]));
				z01.setTx4Amount(valueOf(split[3]));
				break;
			}
			case "0041": {
				z01.setNontaxQuantity(valueOf(split[2]));
				z01.setNontaxAmount(valueOf(split[3]));
			}
			default: {
			}
			}
		}
		s.close();
		Z001UpdateString(z01);
		return z01;
	}

	private static BigDecimal valueOf(String inputString) {
		if (inputString.length() == 0) {
			BigDecimal bd = new BigDecimal("0");
			return bd;
		} else {
			BigDecimal bd = new BigDecimal(inputString.replaceAll(",", ""));
			return bd;
		}
	}
}
