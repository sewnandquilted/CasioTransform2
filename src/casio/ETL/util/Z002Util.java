package casio.ETL.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;

import casio.ETL.model.Z002;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Z002Util {

	public static Z002 extractZ002from(Path filePath) throws IOException {
		Z002 z02 = new Z002();
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
				z02.setZ02model(split[1]);
				break;
			}
			case "MACHINE": {
				z02.setZ02machine(split[1]);
				break;
			}
			case "REPORT": {
				z02.setZ02report(split[1]);
				break;
			}
			case "FILE": {
				z02.setZ02file(split[1]);
				break;
			}
			case "MODE": {
				z02.setZ02mode(split[1]);
				break;
			}
			case "Z COUNTER": {
				z02.setZ02zcounter(Integer.parseInt(split[1]));
				break;
			}
			case "DATE": {
				z02.setZ02date(split[1]);
				break;
			}
			case "TIME": {
				z02.setZ02time(split[1]);
				break;
			}
			case "": {
				break;
			}
			case "RECORD": {
				break;
			}
			case "0001": {
				z02.setCashQuantity(valueOf(split[2]));
				z02.setCashAmount(valueOf(split[3]));
				break;
			}
			case "0002": {
				z02.setSubtotalQuantity(valueOf(split[2]));
				z02.setSubtotalAmount(valueOf(split[3]));
				break;
			}
			case "0003": {
				z02.setChargeQuantity(valueOf(split[2]));
				z02.setChargeAmount(valueOf(split[3]));
				break;
			}
			case "0004": {
				z02.setCheckQuantity(valueOf(split[2]));
				z02.setCheckAmount(valueOf(split[3]));
				break;
			}
			case "0005": {
				z02.setHelpQuantity(valueOf(split[2]));
				z02.setHelpAmount(valueOf(split[3]));
				break;
			}
			case "0006": {
				z02.setTaxpgmQuantity(valueOf(split[2]));
				z02.setTaxpgmAmount(valueOf(split[3]));
				break;
			}
			case "0007": {
				z02.setPoQuantity(valueOf(split[2]));
				z02.setPoAmount(valueOf(split[3]));
				break;
			}
			case "0008": {
				z02.setRaQuantity(valueOf(split[2]));
				z02.setRaAmount(valueOf(split[3]));
				break;
			}
			case "0009": {
				z02.setSignoffQuantity(valueOf(split[2]));
				z02.setSignoffAmount(valueOf(split[3]));
				break;
			}
			case "0010": {
				z02.setClknoQuantity(valueOf(split[2]));
				z02.setClknoAmount(valueOf(split[3]));
				break;
			}
			case "0011": {
				z02.setShiftnoQuantity(valueOf(split[2]));
				z02.setShiftnoAmount(valueOf(split[3]));
				break;
			}
			case "0012": {
				z02.setDwnQuantity(valueOf(split[2]));
				z02.setDwnAmount(valueOf(split[3]));
				break;
			}
			case "0013": {
				z02.setPctdiscountQuantity(valueOf(split[2]));
				z02.setPctdiscountAmount(valueOf(split[3]));
				break;
			}
			case "0014": {
				z02.setDiscountQuantity(valueOf(split[2]));
				z02.setDiscountAmount(valueOf(split[3]));
				break;
			}
			case "0015": {
				z02.setPluQuantity(valueOf(split[2]));
				z02.setPluAmount(valueOf(split[3]));
				break;
			}
			case "0016": {
				z02.setPrcQuantity(valueOf(split[2]));
				z02.setPrcAmount(valueOf(split[3]));
				break;
			}
			case "0017": {
				z02.setReceiptQuantity(valueOf(split[2]));
				z02.setReceiptAmount(valueOf(split[3]));
				break;
			}
			case "0018": {
				z02.setCorrQuantity(valueOf(split[2]));
				z02.setCorrAmount(valueOf(split[3]));
				break;
			}
			case "0019": {
				z02.setRfQuantity(valueOf(split[2]));
				z02.setRfAmount(valueOf(split[3]));
				break;
			}
			case "0020": {
				z02.setOpenQuantity(valueOf(split[2]));
				z02.setOpenAmount(valueOf(split[3]));
				break;
			}
			case "0021": {
				z02.setRctQuantity(valueOf(split[2]));
				z02.setRctAmount(valueOf(split[3]));
				break;
			}
			case "0022": {
				z02.setZeroQuantity(valueOf(split[2]));
				z02.setZeroAmount(valueOf(split[3]));
				break;
			}
			case "0023": {
				z02.setDotQuantity(valueOf(split[2]));
				z02.setDotAmount(valueOf(split[3]));
				break;
			}
			case "0024": {
				z02.setVatQuantity(valueOf(split[2]));
				z02.setVatAmount(valueOf(split[3]));
				break;
			}
			case "0025": {
				z02.setNsQuantity(valueOf(split[2]));
				z02.setNsAmount(valueOf(split[3]));
				break;
			}
			case "0026": {
				z02.setCouponQuantity(valueOf(split[2]));
				z02.setCouponAmount(valueOf(split[3]));
				break;
			}
			case "0027": {
				z02.setUpQuantity(valueOf(split[2]));
				z02.setUpAmount(valueOf(split[3]));
				break;
			}
			case "0028": {
				z02.setCeQuantity(valueOf(split[2]));
				z02.setCeAmount(valueOf(split[3]));
				break;
			}
			case "0029": {
				z02.setxQuantity(valueOf(split[2]));
				z02.setxAmount(valueOf(split[3]));
				break;
			}
			case "0030": {
				z02.setHashQuantity(valueOf(split[2]));
				z02.setHashAmount(valueOf(split[3]));
				break;
			}
			case "0031": {
				z02.setNosaleQuantity(valueOf(split[2]));
				z02.setNosaleAmount(valueOf(split[3]));
				break;
			}
			case "0032": {
				z02.setVoidQuantity(valueOf(split[2]));
				z02.setVoidAmount(valueOf(split[3]));
				break;
			}
			case "0033":
			case "0034":
			case "0035":
			case "0036":
			case "0037":
			case "0038":
			case "0039":
			case "0040":
			case "0041":
			case "0042":
			case "0043":
			case "0044":
			case "0045":
			case "0046":
			case "0047":
			case "0048":
			case "0049":
			case "0050":
			default: {
			}
			}
		}
		s.close();
		return z02;
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
