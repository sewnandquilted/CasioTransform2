package casio.ETL.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;

import casio.ETL.model.Z001;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Z001Util {

	public static Z001 extractZ001from(Path filePath) throws IOException {
		Z001 z01 = new Z001();
		String line = null;
		Scanner s = new Scanner(filePath.toFile());
		while (s.hasNextLine()) {
			// n.b. there are only one or two fields per line:
			// each file generates a single Z001 record
			line = s.nextLine();
			String split[] = line.split("\",\"");
//			System.out.println("Line is |" + line + "|");
			for (int i = 0; i < split.length; i++) {
				split[i] = split[i].replaceAll("\"", "").trim();
//				System.out.print("Split[" + i + "] is |" + split[i] + "|,");
			}
//			System.out.println();
			switch (split[0]) {
			case "MODEL": {
				z01.setZ01model(split[1]);
				break;
			}
			case "MACHINE": {
				z01.setZ01machine(split[1]);
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
		return z01;
//		z001Entries.add(z01);
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
