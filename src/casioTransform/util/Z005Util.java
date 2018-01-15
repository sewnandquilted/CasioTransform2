package casioTransform.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;

import casioTransform.model.Z001;
import casioTransform.model.Z002;
import casioTransform.model.Z005;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Z005Util {

	public static String Z005UpdateString (Z005 z5) {
		String aa="insert into z005 set " + "battingAmount=" + z5.getBattingAmount().toString() + ","
				+ "battingQuantity=" + z5.getBattingQuantity().toString() + "," + "bomAmount="
				+ z5.getBomAmount().toString() + "," + "bomQuantity=" + z5.getBomQuantity().toString() + ","
				+ "bookAmount=" + z5.getBookAmount().toString() + "," + "bookQuantity="
				+ z5.getBookQuantity().toString() + "," + "classAmount=" + z5.getClassAmount().toString() + ","
				+ "classQuantity=" + z5.getClassQuantity().toString() + "," + "fabricAmount="
				+ z5.getFabricAmount().toString() + "," + "fabricQuantity=" + z5.getFabricQuantity().toString() + ","
				+ "giftCertAmount=" + z5.getGiftCertAmount().toString() + "," + "giftCertQuantity="
				+ z5.getGiftCertQuantity().toString() + "," + "janomeAmount=" + z5.getJanomeAmount().toString() + ","
				+ "janomeQuantity=" + z5.getJanomeQuantity().toString() + "," + "kitsAmount="
				+ z5.getKitsAmount().toString() + "," + "kitsQuantity=" + z5.getKitsQuantity().toString() + ","
				+ "longarmAmount=" + z5.getLongarmAmount().toString() + "," + "longarmQuantity="
				+ z5.getLongarmQuantity().toString() + "," + "miscAmount=" + z5.getMiscAmount().toString() + ","
				+ "miscQuantity=" + z5.getMiscQuantity().toString() + "," + "notionAmount="
				+ z5.getNotionAmount().toString() + "," + "notionQuantity=" + z5.getNotionQuantity().toString() + ","
				+ "patternAmount=" + z5.getPatternAmount().toString() + "," + "patternQuantity="
				+ z5.getPatternQuantity().toString() + "," + "patternsAmount=" + z5.getPatternsAmount().toString()
				+ "," + "patternsQuantity=" + z5.getPatternsQuantity().toString() + "," + "postageAmount="
				+ z5.getPostageAmount().toString() + "," + "postageQuantity=" + z5.getPostageQuantity().toString()
				+ "," + "saleFabricAmount=" + z5.getSaleFabricAmount().toString() + "," + "saleFabricQuantity="
				+ z5.getSaleFabricQuantity().toString() + "," + "threadsAmount=" + z5.getThreadsAmount().toString()
				+ "," + "threadsQuantity=" + z5.getThreadsQuantity().toString() + "," + "unknownDeptAmount="
				+ z5.getUnknownDeptAmount().toString() + "," + "unknownDeptQuantity="
				+ z5.getUnknownDeptQuantity().toString() + "," + "workshopAmount=" + z5.getWorkshopAmount().toString()
				+ "," + "workshopQuantity=" + z5.getWorkshopQuantity().toString() + ","  
				
				+"z05date = STR_TO_DATE('" + z5.getZ05date().toString().replaceAll("/", "-") + " " + z5.getZ05time().toString() + "' , '%d-%m-%Y %H:%i'),"

				+ "z05file='" + z5.getZ05file() + "'," + "z05machine='"
				+ z5.getZ05machine() + "'," + "z05mode='" + z5.getZ05mode() + "'," + "z05model='"
				+ z5.getZ05model() + "'," + "z05report='" + z5.getZ05report() + "'," 
				+ "z05zcounter=" + z5.getZ05zcounter() + ";";
//		System.out.println(aa);
		return aa;
	}

	public static Z005 extractZ005from(Path filePath) throws IOException {
		Z005 z05 = new Z005();
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
				z05.setZ05model(split[1]);
				break;
			}
			case "MACHINE": {
				z05.setZ05machine(split[1]);
				break;
			}
			case "REPORT": {
				z05.setZ05report(split[1]);
				break;
			}
			case "FILE": {
				z05.setZ05file(split[1]);
				break;
			}
			case "MODE": {
				z05.setZ05mode(split[1]);
				break;
			}
			case "Z COUNTER": {
				z05.setZ05zcounter(Integer.parseInt(split[1]));
				break;
			}
			case "DATE": {
				z05.setZ05date(split[1]);
				break;
			}
			case "TIME": {
				z05.setZ05time(split[1]);
				break;
			}
			// case "": {
			// }
			// case "RECORD": {
			// }

			case "0001": {
				z05.setFabricQuantity(valueOf(split[2]));
				z05.setFabricAmount(valueOf(split[3]));
				break;
			}
			case "0002": {
				z05.setWorkshopQuantity(valueOf(split[2]));
				z05.setWorkshopAmount(valueOf(split[3]));
				break;
			}
			case "0003": {
				z05.setSaleFabricQuantity(valueOf(split[2]));
				z05.setSaleFabricAmount(valueOf(split[3]));
				break;
			}
			case "0004": {
				z05.setGiftCertQuantity(valueOf(split[2]));
				z05.setGiftCertAmount(valueOf(split[3]));
				break;
			}
			case "0005": {
				z05.setUnknownDeptQuantity(valueOf(split[2]));
				// .add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]));
				// .add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0006": {
				z05.setNotionQuantity(valueOf(split[2]));
				z05.setNotionAmount(valueOf(split[3]));
				break;
			}
			case "0007": {
				z05.setBomQuantity(valueOf(split[2]));
				z05.setBomAmount(valueOf(split[3]));
				break;
			}
			case "0008": {
				z05.setThreadsQuantity(valueOf(split[2]));
				z05.setThreadsAmount(valueOf(split[3]));
				break;
			}
			case "0009": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0010": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0011": {
				z05.setBookQuantity(valueOf(split[2]));
				z05.setBookAmount(valueOf(split[3]));
				break;
			}
			case "0012": {
				z05.setPostageQuantity(valueOf(split[2]));
				z05.setPostageAmount(valueOf(split[3]));
				break;
			}
			case "0013": {
				z05.setKitsQuantity(valueOf(split[2]));
				z05.setKitsAmount(valueOf(split[3]));
				break;
			}
			case "0014": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0015": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0016": {
				z05.setClassQuantity(valueOf(split[2]));
				z05.setClassAmount(valueOf(split[3]));
				break;
			}
			case "0017": {
				z05.setLongarmQuantity(valueOf(split[2]));
				z05.setLongarmAmount(valueOf(split[3]));
				break;
			}
			case "0018": {
				z05.setPatternsQuantity(valueOf(split[2]));
				z05.setPatternsAmount(valueOf(split[3]));
				break;
			}
			case "0019": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			case "0020": {
				z05.setPatternQuantity(valueOf(split[2]));
				z05.setPatternAmount(valueOf(split[3]));
				break;
			}
			case "0021": {
				z05.setJanomeQuantity(valueOf(split[2]));
				z05.setJanomeAmount(valueOf(split[3]));
				break;
			}
			case "0022": {
				z05.setBattingQuantity(valueOf(split[2]));
				z05.setBattingAmount(valueOf(split[3]));
				break;
			}
			case "0023": {
				z05.setMiscQuantity(valueOf(split[2]));
				z05.setMiscAmount(valueOf(split[3]));
				break;
			}
			// cases 0024 through 0200 are not Department numbers that are currently used,
			// but they should be captured into the unknownDepartment quantity and amount
			case "0024":
			case "0025":
			case "0026":
			case "0027":
			case "0028":
			case "0029":
			case "0030":
			case "0031":
			case "0032":
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
			case "0051":
			case "0052":
			case "0053":
			case "0054":
			case "0055":
			case "0056":
			case "0057":
			case "0058":
			case "0059":
			case "0060":
			case "0061":
			case "0062":
			case "0063":
			case "0064":
			case "0065":
			case "0066":
			case "0067":
			case "0068":
			case "0069":
			case "0070":
			case "0071":
			case "0072":
			case "0073":
			case "0074":
			case "0075":
			case "0076":
			case "0077":
			case "0078":
			case "0079":
			case "0080":
			case "0081":
			case "0082":
			case "0083":
			case "0084":
			case "0085":
			case "0086":
			case "0087":
			case "0088":
			case "0089":
			case "0090":
			case "0091":
			case "0092":
			case "0093":
			case "0094":
			case "0095":
			case "0096":
			case "0097":
			case "0098":
			case "0099":
			case "0100":
			case "0101":
			case "0102":
			case "0103":
			case "0104":
			case "0105":
			case "0106":
			case "0107":
			case "0108":
			case "0109":
			case "0110":
			case "0111":
			case "0112":
			case "0113":
			case "0114":
			case "0115":
			case "0116":
			case "0117":
			case "0118":
			case "0119":
			case "0120":
			case "0121":
			case "0122":
			case "0123":
			case "0124":
			case "0125":
			case "0126":
			case "0127":
			case "0128":
			case "0129":
			case "0130":
			case "0131":
			case "0132":
			case "0133":
			case "0134":
			case "0135":
			case "0136":
			case "0137":
			case "0138":
			case "0139":
			case "0140":
			case "0141":
			case "0142":
			case "0143":
			case "0144":
			case "0145":
			case "0146":
			case "0147":
			case "0148":
			case "0149":
			case "0150":
			case "0151":
			case "0152":
			case "0153":
			case "0154":
			case "0155":
			case "0156":
			case "0157":
			case "0158":
			case "0159":
			case "0160":
			case "0161":
			case "0162":
			case "0163":
			case "0164":
			case "0165":
			case "0166":
			case "0167":
			case "0168":
			case "0169":
			case "0170":
			case "0171":
			case "0172":
			case "0173":
			case "0174":
			case "0175":
			case "0176":
			case "0177":
			case "0178":
			case "0179":
			case "0180":
			case "0181":
			case "0182":
			case "0183":
			case "0184":
			case "0185":
			case "0186":
			case "0187":
			case "0188":
			case "0189":
			case "0190":
			case "0191":
			case "0192":
			case "0193":
			case "0194":
			case "0195":
			case "0196":
			case "0197":
			case "0198":
			case "0199":
			case "0200": {
				z05.setUnknownDeptQuantity(valueOf(split[2]).add(z05.getUnknownDeptQuantity()));
				z05.setUnknownDeptAmount(valueOf(split[3]).add(z05.getUnknownDeptAmount()));
				break;
			}
			default: {
			}
			}
		}
		s.close();
		Z005UpdateString(z05);
		return z05;
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
