package casioTransform.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;

import casioTransform.model.Z001;
import casioTransform.model.Z005;
import casioTransform.model.Z020;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Z020Util {
	public static String Z020UpdateString(Z020 z20) {
		String aa="insert into Z020 set " + "grandTotal=" + z20.getGrandTotal().toString() + ","
				+ "prevGrandTotal=" + z20.getPrevGrandTotal().toString() + "," 
				+"z20date = STR_TO_DATE('" + z20.getZ20date().toString().replaceAll("/","-") + " " + z20.getZ20time().toString() + "' , '%d-%m-%Y %H:%i'),"
				+ "z20file='" + z20.getZ20file() + "'," + "z20machine='" + z20.getZ20machine() + "',"
				+ "z20mode='" + z20.getZ20mode() + "'," + "z20model='" + z20.getZ20model() + "'," 
				+ "z20zcounter=" + z20.getZ20zcounter() + "";
//		System.out.println(aa);
		return aa;
	}

	public static Z020 extractZ020from(Path filePath) throws IOException {
		Z020 z20 = new Z020();
		String line = null;
		Scanner s = new Scanner(filePath.toFile());
		while (s.hasNextLine()) {
			// n.b. there are only one or two fields per line:
			// each file generates a single Z001 record
			line = s.nextLine();
			String split[] = line.split("\",\"");
			// System.out.println("Line is |" + line + "|");
			for (int i = 0; i < split.length; i++) {
				split[i] = split[i].replaceAll("\"", "").trim();
				// System.out.print("Split[" + i + "] is |" + split[i] + "|,");
			}
			// System.out.println();
			switch (split[0]) {
			case "MODEL": {
				z20.setZ20model(split[1]);
				break;
			}
			case "MACHINE": {
				z20.setZ20machine(split[1]);
				break;
			}
			case "FILE": {
				z20.setZ20file(split[1]);
				break;
			}
			case "MODE": {
				z20.setZ20mode(split[1]);
				break;
			}
			case "Z COUNTER": {
				z20.setZ20zcounter(Integer.parseInt(split[1]));
				break;
			}
			case "DATE": {
				z20.setZ20date(split[1]);
				break;
			}
			case "TIME": {
				z20.setZ20time(split[1]);
				break;
			}
			case "": {
				break;
			}
			case "RECORD": {
				break;
			}
			case "0001": {
				z20.setGrandTotal(valueOf(split[2]));
				break;
			}
			case "0002": {
				break;
			}
			case "0003": {
				break;
			}
			case "0004": {
				z20.setPrevGrandTotal(valueOf(split[2]));
				break;
			}
			default: {
			}
			}
		}
		s.close();
		Z020UpdateString(z20);
		return z20;
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
