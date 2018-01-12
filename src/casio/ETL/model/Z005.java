package casio.ETL.model;

import java.math.BigDecimal;

public class Z005 {

	private String z05model;
	private String z05machine;
	private String z05report;
	private String z05file;
	private String z05mode;
	private int z05zcounter;
	private String z05date;
	private String z05time;
	private BigDecimal fabricQuantity;
	private BigDecimal workshopQuantity;
	private BigDecimal saleFabricQuantity;
	private BigDecimal giftCertQuantity;
	private BigDecimal unknownDeptQuantity;
	private BigDecimal notionQuantity;
	private BigDecimal bomQuantity;
	private BigDecimal threadsQuantity;
	private BigDecimal bookQuantity;
	private BigDecimal postageQuantity;
	private BigDecimal kitsQuantity;
	private BigDecimal classQuantity;
	private BigDecimal longarmQuantity;
	private BigDecimal patternsQuantity;
	private BigDecimal patternQuantity;
	private BigDecimal janomeQuantity;
	private BigDecimal battingQuantity;
	private BigDecimal miscQuantity;

	private BigDecimal fabricAmount;
	private BigDecimal workshopAmount;
	private BigDecimal saleFabricAmount;
	private BigDecimal giftCertAmount;
	private BigDecimal unknownDeptAmount;
	private BigDecimal notionAmount;
	private BigDecimal bomAmount;
	private BigDecimal threadsAmount;
	private BigDecimal bookAmount;
	private BigDecimal postageAmount;
	private BigDecimal kitsAmount;
	private BigDecimal classAmount;
	private BigDecimal longarmAmount;
	private BigDecimal patternsAmount;
	private BigDecimal patternAmount;
	private BigDecimal janomeAmount;
	private BigDecimal battingAmount;
	private BigDecimal miscAmount;


	public String z005CreateTableString() {
		return "create table z005 ( " + "z05model varchar," + "z05machine varchar," + "z05report varchar,"
				+ "z05file varchar," + "z05mode varchar," + "z05zcounter integer," + "z05date varchar,"
				+ "z05time varchar," + "fabricQuantity decimal(10,2)," + "workshopQuantity decimal(10,2),"
				+ "salefabricQuantity decimal(10,2)," + "giftcertQuantity decimal(10,2),"
				+ "dept005Quantity decimal(10,2)," + "notionQuantity decimal(10,2)," + "bomQuantity decimal(10,2),"
				+ "threadsQuantity decimal(10,2)," + "dept009Quantity decimal(10,2)," + "dept010Quantity decimal(10,2),"
				+ "bookQuantity decimal(10,2)," + "postageQuantity decimal(10,2)," + "kitsQuantity decimal(10,2),"
				+ "dept014Quantity decimal(10,2)," + "dept015Quantity decimal(10,2)," + "classQuantity decimal(10,2),"
				+ "longarmQuantity decimal(10,2)," + "patternsQuantity decimal(10,2),"
				+ "dept019Quantity decimal(10,2)," + "patternQuantity decimal(10,2)," + "janomeQuantity decimal(10,2),"
				+ "battingQuantity decimal(10,2)," + "miscQuantity decimal(10,2)," + "dept024Quantity decimal(10,2),"
				+ "dept025Quantity decimal(10,2)," + "dept026Quantity decimal(10,2)," + "dept027Quantity decimal(10,2),"
				+ "dept028Quantity decimal(10,2)," + "dept029Quantity decimal(10,2)," + "dept030Quantity decimal(10,2),"
				+ "dept031Quantity decimal(10,2)," + "dept032Quantity decimal(10,2)," + "dept033Quantity decimal(10,2),"
				+ "dept034Quantity decimal(10,2)," + "dept035Quantity decimal(10,2)," + "dept036Quantity decimal(10,2),"
				+ "dept037Quantity decimal(10,2)," + "dept038Quantity decimal(10,2)," + "dept039Quantity decimal(10,2),"
				+ "dept040Quantity decimal(10,2)," + "dept041Quantity decimal(10,2)," + "dept042Quantity decimal(10,2),"
				+ "dept043Quantity decimal(10,2)," + "dept044Quantity decimal(10,2)," + "dept045Quantity decimal(10,2),"
				+ "dept046Quantity decimal(10,2)," + "dept047Quantity decimal(10,2)," + "dept048Quantity decimal(10,2),"
				+ "dept049Quantity decimal(10,2)," + "dept050Quantity decimal(10,2)," + "dept051Quantity decimal(10,2),"
				+ "dept052Quantity decimal(10,2)," + "dept053Quantity decimal(10,2)," + "dept054Quantity decimal(10,2),"
				+ "dept055Quantity decimal(10,2)," + "dept056Quantity decimal(10,2)," + "dept057Quantity decimal(10,2),"
				+ "dept058Quantity decimal(10,2)," + "dept059Quantity decimal(10,2)," + "dept060Quantity decimal(10,2),"
				+ "dept061Quantity decimal(10,2)," + "dept062Quantity decimal(10,2)," + "dept063Quantity decimal(10,2),"
				+ "dept064Quantity decimal(10,2)," + "dept065Quantity decimal(10,2)," + "dept066Quantity decimal(10,2),"
				+ "dept067Quantity decimal(10,2)," + "dept068Quantity decimal(10,2)," + "dept069Quantity decimal(10,2),"
				+ "dept070Quantity decimal(10,2)," + "dept071Quantity decimal(10,2)," + "dept072Quantity decimal(10,2),"
				+ "dept073Quantity decimal(10,2)," + "dept074Quantity decimal(10,2)," + "dept075Quantity decimal(10,2),"
				+ "dept076Quantity decimal(10,2)," + "dept077Quantity decimal(10,2)," + "dept078Quantity decimal(10,2),"
				+ "dept079Quantity decimal(10,2)," + "dept080Quantity decimal(10,2)," + "dept081Quantity decimal(10,2),"
				+ "dept082Quantity decimal(10,2)," + "dept083Quantity decimal(10,2)," + "dept084Quantity decimal(10,2),"
				+ "dept085Quantity decimal(10,2)," + "dept086Quantity decimal(10,2)," + "dept087Quantity decimal(10,2),"
				+ "dept088Quantity decimal(10,2)," + "dept089Quantity decimal(10,2)," + "dept090Quantity decimal(10,2),"
				+ "dept091Quantity decimal(10,2)," + "dept092Quantity decimal(10,2)," + "dept093Quantity decimal(10,2),"
				+ "dept094Quantity decimal(10,2)," + "dept095Quantity decimal(10,2)," + "dept096Quantity decimal(10,2),"
				+ "dept097Quantity decimal(10,2)," + "dept098Quantity decimal(10,2)," + "dept099Quantity decimal(10,2),"
				+ "dept100Quantity decimal(10,2)," + "dept101Quantity decimal(10,2)," + "dept102Quantity decimal(10,2),"
				+ "dept103Quantity decimal(10,2)," + "dept104Quantity decimal(10,2)," + "dept105Quantity decimal(10,2),"
				+ "dept106Quantity decimal(10,2)," + "dept107Quantity decimal(10,2)," + "dept108Quantity decimal(10,2),"
				+ "dept109Quantity decimal(10,2)," + "dept110Quantity decimal(10,2)," + "dept111Quantity decimal(10,2),"
				+ "dept112Quantity decimal(10,2)," + "dept113Quantity decimal(10,2)," + "dept114Quantity decimal(10,2),"
				+ "dept115Quantity decimal(10,2)," + "dept116Quantity decimal(10,2)," + "dept117Quantity decimal(10,2),"
				+ "dept118Quantity decimal(10,2)," + "dept119Quantity decimal(10,2)," + "dept120Quantity decimal(10,2),"
				+ "dept121Quantity decimal(10,2)," + "dept122Quantity decimal(10,2)," + "dept123Quantity decimal(10,2),"
				+ "dept124Quantity decimal(10,2)," + "dept125Quantity decimal(10,2)," + "dept126Quantity decimal(10,2),"
				+ "dept127Quantity decimal(10,2)," + "dept128Quantity decimal(10,2)," + "dept129Quantity decimal(10,2),"
				+ "dept130Quantity decimal(10,2)," + "dept131Quantity decimal(10,2)," + "dept132Quantity decimal(10,2),"
				+ "dept133Quantity decimal(10,2)," + "dept134Quantity decimal(10,2)," + "dept135Quantity decimal(10,2),"
				+ "dept136Quantity decimal(10,2)," + "dept137Quantity decimal(10,2)," + "dept138Quantity decimal(10,2),"
				+ "dept139Quantity decimal(10,2)," + "dept140Quantity decimal(10,2)," + "dept141Quantity decimal(10,2),"
				+ "dept142Quantity decimal(10,2)," + "dept143Quantity decimal(10,2)," + "dept144Quantity decimal(10,2),"
				+ "dept145Quantity decimal(10,2)," + "dept146Quantity decimal(10,2)," + "dept147Quantity decimal(10,2),"
				+ "dept148Quantity decimal(10,2)," + "dept149Quantity decimal(10,2)," + "dept150Quantity decimal(10,2),"
				+ "dept151Quantity decimal(10,2)," + "dept152Quantity decimal(10,2)," + "dept153Quantity decimal(10,2),"
				+ "dept154Quantity decimal(10,2)," + "dept155Quantity decimal(10,2)," + "dept156Quantity decimal(10,2),"
				+ "dept157Quantity decimal(10,2)," + "dept158Quantity decimal(10,2)," + "dept159Quantity decimal(10,2),"
				+ "dept160Quantity decimal(10,2)," + "dept161Quantity decimal(10,2)," + "dept162Quantity decimal(10,2),"
				+ "dept163Quantity decimal(10,2)," + "dept164Quantity decimal(10,2)," + "dept165Quantity decimal(10,2),"
				+ "dept166Quantity decimal(10,2)," + "dept167Quantity decimal(10,2)," + "dept168Quantity decimal(10,2),"
				+ "dept169Quantity decimal(10,2)," + "dept170Quantity decimal(10,2)," + "dept171Quantity decimal(10,2),"
				+ "dept172Quantity decimal(10,2)," + "dept173Quantity decimal(10,2)," + "dept174Quantity decimal(10,2),"
				+ "dept175Quantity decimal(10,2)," + "dept176Quantity decimal(10,2)," + "dept177Quantity decimal(10,2),"
				+ "dept178Quantity decimal(10,2)," + "dept179Quantity decimal(10,2)," + "dept180Quantity decimal(10,2),"
				+ "dept181Quantity decimal(10,2)," + "dept182Quantity decimal(10,2)," + "dept183Quantity decimal(10,2),"
				+ "dept184Quantity decimal(10,2)," + "dept185Quantity decimal(10,2)," + "dept186Quantity decimal(10,2),"
				+ "dept187Quantity decimal(10,2)," + "dept188Quantity decimal(10,2)," + "dept189Quantity decimal(10,2),"
				+ "dept190Quantity decimal(10,2)," + "dept191Quantity decimal(10,2)," + "dept192Quantity decimal(10,2),"
				+ "dept193Quantity decimal(10,2)," + "dept194Quantity decimal(10,2)," + "dept195Quantity decimal(10,2),"
				+ "dept196Quantity decimal(10,2)," + "dept197Quantity decimal(10,2)," + "dept198Quantity decimal(10,2),"
				+ "dept199Quantity decimal(10,2)," + "dept200Quantity decimal(10,2)," + "fabricAmount decimal(10,2),"
				+ "workshopAmount decimal(10,2)," + "salefabricAmount decimal(10,2)," + "giftcertAmount decimal(10,2),"
				+ "dept005Amount decimal(10,2)," + "notionAmount decimal(10,2)," + "bomAmount decimal(10,2),"
				+ "threadsAmount decimal(10,2)," + "dept009Amount decimal(10,2)," + "dept010Amount decimal(10,2),"
				+ "bookAmount decimal(10,2)," + "postageAmount decimal(10,2)," + "kitsAmount decimal(10,2),"
				+ "dept014Amount decimal(10,2)," + "dept015Amount decimal(10,2)," + "classAmount decimal(10,2),"
				+ "long armAmount decimal(10,2)," + "patternsAmount decimal(10,2)," + "dept019Amount decimal(10,2),"
				+ "patternAmount decimal(10,2)," + "janomeAmount decimal(10,2)," + "battingAmount decimal(10,2),"
				+ "miscAmount decimal(10,2)," + "dept024Amount decimal(10,2)," + "dept025Amount decimal(10,2),"
				+ "dept026Amount decimal(10,2)," + "dept027Amount decimal(10,2)," + "dept028Amount decimal(10,2),"
				+ "dept029Amount decimal(10,2)," + "dept030Amount decimal(10,2)," + "dept031Amount decimal(10,2),"
				+ "dept032Amount decimal(10,2)," + "dept033Amount decimal(10,2)," + "dept034Amount decimal(10,2),"
				+ "dept035Amount decimal(10,2)," + "dept036Amount decimal(10,2)," + "dept037Amount decimal(10,2),"
				+ "dept038Amount decimal(10,2)," + "dept039Amount decimal(10,2)," + "dept040Amount decimal(10,2),"
				+ "dept041Amount decimal(10,2)," + "dept042Amount decimal(10,2)," + "dept043Amount decimal(10,2),"
				+ "dept044Amount decimal(10,2)," + "dept045Amount decimal(10,2)," + "dept046Amount decimal(10,2),"
				+ "dept047Amount decimal(10,2)," + "dept048Amount decimal(10,2)," + "dept049Amount decimal(10,2),"
				+ "dept050Amount decimal(10,2)," + "dept051Amount decimal(10,2)," + "dept052Amount decimal(10,2),"
				+ "dept053Amount decimal(10,2)," + "dept054Amount decimal(10,2)," + "dept055Amount decimal(10,2),"
				+ "dept056Amount decimal(10,2)," + "dept057Amount decimal(10,2)," + "dept058Amount decimal(10,2),"
				+ "dept059Amount decimal(10,2)," + "dept060Amount decimal(10,2)," + "dept061Amount decimal(10,2),"
				+ "dept062Amount decimal(10,2)," + "dept063Amount decimal(10,2)," + "dept064Amount decimal(10,2),"
				+ "dept065Amount decimal(10,2)," + "dept066Amount decimal(10,2)," + "dept067Amount decimal(10,2),"
				+ "dept068Amount decimal(10,2)," + "dept069Amount decimal(10,2)," + "dept070Amount decimal(10,2),"
				+ "dept071Amount decimal(10,2)," + "dept072Amount decimal(10,2)," + "dept073Amount decimal(10,2),"
				+ "dept074Amount decimal(10,2)," + "dept075Amount decimal(10,2)," + "dept076Amount decimal(10,2),"
				+ "dept077Amount decimal(10,2)," + "dept078Amount decimal(10,2)," + "dept079Amount decimal(10,2),"
				+ "dept080Amount decimal(10,2)," + "dept081Amount decimal(10,2)," + "dept082Amount decimal(10,2),"
				+ "dept083Amount decimal(10,2)," + "dept084Amount decimal(10,2)," + "dept085Amount decimal(10,2),"
				+ "dept086Amount decimal(10,2)," + "dept087Amount decimal(10,2)," + "dept088Amount decimal(10,2),"
				+ "dept089Amount decimal(10,2)," + "dept090Amount decimal(10,2)," + "dept091Amount decimal(10,2),"
				+ "dept092Amount decimal(10,2)," + "dept093Amount decimal(10,2)," + "dept094Amount decimal(10,2),"
				+ "dept095Amount decimal(10,2)," + "dept096Amount decimal(10,2)," + "dept097Amount decimal(10,2),"
				+ "dept098Amount decimal(10,2)," + "dept099Amount decimal(10,2)," + "dept100Amount decimal(10,2),"
				+ "dept101Amount decimal(10,2)," + "dept102Amount decimal(10,2)," + "dept103Amount decimal(10,2),"
				+ "dept104Amount decimal(10,2)," + "dept105Amount decimal(10,2)," + "dept106Amount decimal(10,2),"
				+ "dept107Amount decimal(10,2)," + "dept108Amount decimal(10,2)," + "dept109Amount decimal(10,2),"
				+ "dept110Amount decimal(10,2)," + "dept111Amount decimal(10,2)," + "dept112Amount decimal(10,2),"
				+ "dept113Amount decimal(10,2)," + "dept114Amount decimal(10,2)," + "dept115Amount decimal(10,2),"
				+ "dept116Amount decimal(10,2)," + "dept117Amount decimal(10,2)," + "dept118Amount decimal(10,2),"
				+ "dept119Amount decimal(10,2)," + "dept120Amount decimal(10,2)," + "dept121Amount decimal(10,2),"
				+ "dept122Amount decimal(10,2)," + "dept123Amount decimal(10,2)," + "dept124Amount decimal(10,2),"
				+ "dept125Amount decimal(10,2)," + "dept126Amount decimal(10,2)," + "dept127Amount decimal(10,2),"
				+ "dept128Amount decimal(10,2)," + "dept129Amount decimal(10,2)," + "dept130Amount decimal(10,2),"
				+ "dept131Amount decimal(10,2)," + "dept132Amount decimal(10,2)," + "dept133Amount decimal(10,2),"
				+ "dept134Amount decimal(10,2)," + "dept135Amount decimal(10,2)," + "dept136Amount decimal(10,2),"
				+ "dept137Amount decimal(10,2)," + "dept138Amount decimal(10,2)," + "dept139Amount decimal(10,2),"
				+ "dept140Amount decimal(10,2)," + "dept141Amount decimal(10,2)," + "dept142Amount decimal(10,2),"
				+ "dept143Amount decimal(10,2)," + "dept144Amount decimal(10,2)," + "dept145Amount decimal(10,2),"
				+ "dept146Amount decimal(10,2)," + "dept147Amount decimal(10,2)," + "dept148Amount decimal(10,2),"
				+ "dept149Amount decimal(10,2)," + "dept150Amount decimal(10,2)," + "dept151Amount decimal(10,2),"
				+ "dept152Amount decimal(10,2)," + "dept153Amount decimal(10,2)," + "dept154Amount decimal(10,2),"
				+ "dept155Amount decimal(10,2)," + "dept156Amount decimal(10,2)," + "dept157Amount decimal(10,2),"
				+ "dept158Amount decimal(10,2)," + "dept159Amount decimal(10,2)," + "dept160Amount decimal(10,2),"
				+ "dept161Amount decimal(10,2)," + "dept162Amount decimal(10,2)," + "dept163Amount decimal(10,2),"
				+ "dept164Amount decimal(10,2)," + "dept165Amount decimal(10,2)," + "dept166Amount decimal(10,2),"
				+ "dept167Amount decimal(10,2)," + "dept168Amount decimal(10,2)," + "dept169Amount decimal(10,2),"
				+ "dept170Amount decimal(10,2)," + "dept171Amount decimal(10,2)," + "dept172Amount decimal(10,2),"
				+ "dept173Amount decimal(10,2)," + "dept174Amount decimal(10,2)," + "dept175Amount decimal(10,2),"
				+ "dept176Amount decimal(10,2)," + "dept177Amount decimal(10,2)," + "dept178Amount decimal(10,2),"
				+ "dept179Amount decimal(10,2)," + "dept180Amount decimal(10,2)," + "dept181Amount decimal(10,2),"
				+ "dept182Amount decimal(10,2)," + "dept183Amount decimal(10,2)," + "dept184Amount decimal(10,2),"
				+ "dept185Amount decimal(10,2)," + "dept186Amount decimal(10,2)," + "dept187Amount decimal(10,2),"
				+ "dept188Amount decimal(10,2)," + "dept189Amount decimal(10,2)," + "dept190Amount decimal(10,2),"
				+ "dept191Amount decimal(10,2)," + "dept192Amount decimal(10,2)," + "dept193Amount decimal(10,2),"
				+ "dept194Amount decimal(10,2)," + "dept195Amount decimal(10,2)," + "dept196Amount decimal(10,2),"
				+ "dept197Amount decimal(10,2)," + "dept198Amount decimal(10,2)," + "dept199Amount decimal(10,2),"
				+ "dept200Amount decimal(10,2)" + " );";
	}


	public String getZ05model() {
		return z05model;
	}


	public void setZ05model(String z05model) {
		this.z05model = z05model;
	}


	public String getZ05machine() {
		return z05machine;
	}


	public void setZ05machine(String z05machine) {
		this.z05machine = z05machine;
	}


	public String getZ05report() {
		return z05report;
	}


	public void setZ05report(String z05report) {
		this.z05report = z05report;
	}


	public String getZ05file() {
		return z05file;
	}


	public void setZ05file(String z05file) {
		this.z05file = z05file;
	}


	public String getZ05mode() {
		return z05mode;
	}


	public void setZ05mode(String z05mode) {
		this.z05mode = z05mode;
	}


	public int getZ05zcounter() {
		return z05zcounter;
	}


	public void setZ05zcounter(int z05zcounter) {
		this.z05zcounter = z05zcounter;
	}


	public String getZ05date() {
		return z05date;
	}


	public void setZ05date(String z05date) {
		this.z05date = z05date;
	}


	public String getZ05time() {
		return z05time;
	}


	public void setZ05time(String z05time) {
		this.z05time = z05time;
	}


	public BigDecimal getFabricQuantity() {
		return fabricQuantity;
	}


	public void setFabricQuantity(BigDecimal fabricQuantity) {
		this.fabricQuantity = fabricQuantity;
	}


	public BigDecimal getWorkshopQuantity() {
		return workshopQuantity;
	}


	public void setWorkshopQuantity(BigDecimal workshopQuantity) {
		this.workshopQuantity = workshopQuantity;
	}


	public BigDecimal getSaleFabricQuantity() {
		return saleFabricQuantity;
	}


	public void setSaleFabricQuantity(BigDecimal saleFabricQuantity) {
		this.saleFabricQuantity = saleFabricQuantity;
	}


	public BigDecimal getGiftCertQuantity() {
		return giftCertQuantity;
	}


	public void setGiftCertQuantity(BigDecimal giftCertQuantity) {
		this.giftCertQuantity = giftCertQuantity;
	}


	public BigDecimal getUnknownDeptQuantity() {
		return unknownDeptQuantity;
	}


	public void setUnknownDeptQuantity(BigDecimal unknownDeptQuantity) {
		this.unknownDeptQuantity = unknownDeptQuantity;
	}


	public BigDecimal getNotionQuantity() {
		return notionQuantity;
	}


	public void setNotionQuantity(BigDecimal notionQuantity) {
		this.notionQuantity = notionQuantity;
	}


	public BigDecimal getBomQuantity() {
		return bomQuantity;
	}


	public void setBomQuantity(BigDecimal bomQuantity) {
		this.bomQuantity = bomQuantity;
	}


	public BigDecimal getThreadsQuantity() {
		return threadsQuantity;
	}


	public void setThreadsQuantity(BigDecimal threadsQuantity) {
		this.threadsQuantity = threadsQuantity;
	}


	public BigDecimal getBookQuantity() {
		return bookQuantity;
	}


	public void setBookQuantity(BigDecimal bookQuantity) {
		this.bookQuantity = bookQuantity;
	}


	public BigDecimal getPostageQuantity() {
		return postageQuantity;
	}


	public void setPostageQuantity(BigDecimal postageQuantity) {
		this.postageQuantity = postageQuantity;
	}


	public BigDecimal getKitsQuantity() {
		return kitsQuantity;
	}


	public void setKitsQuantity(BigDecimal kitsQuantity) {
		this.kitsQuantity = kitsQuantity;
	}


	public BigDecimal getClassQuantity() {
		return classQuantity;
	}


	public void setClassQuantity(BigDecimal classQuantity) {
		this.classQuantity = classQuantity;
	}


	public BigDecimal getLongarmQuantity() {
		return longarmQuantity;
	}


	public void setLongarmQuantity(BigDecimal longarmQuantity) {
		this.longarmQuantity = longarmQuantity;
	}


	public BigDecimal getPatternsQuantity() {
		return patternsQuantity;
	}


	public void setPatternsQuantity(BigDecimal patternsQuantity) {
		this.patternsQuantity = patternsQuantity;
	}


	public BigDecimal getPatternQuantity() {
		return patternQuantity;
	}


	public void setPatternQuantity(BigDecimal patternQuantity) {
		this.patternQuantity = patternQuantity;
	}


	public BigDecimal getJanomeQuantity() {
		return janomeQuantity;
	}


	public void setJanomeQuantity(BigDecimal janomeQuantity) {
		this.janomeQuantity = janomeQuantity;
	}


	public BigDecimal getBattingQuantity() {
		return battingQuantity;
	}


	public void setBattingQuantity(BigDecimal battingQuantity) {
		this.battingQuantity = battingQuantity;
	}


	public BigDecimal getMiscQuantity() {
		return miscQuantity;
	}


	public void setMiscQuantity(BigDecimal miscQuantity) {
		this.miscQuantity = miscQuantity;
	}


	public BigDecimal getFabricAmount() {
		return fabricAmount;
	}


	public void setFabricAmount(BigDecimal fabricAmount) {
		this.fabricAmount = fabricAmount;
	}


	public BigDecimal getWorkshopAmount() {
		return workshopAmount;
	}


	public void setWorkshopAmount(BigDecimal workshopAmount) {
		this.workshopAmount = workshopAmount;
	}


	public BigDecimal getSaleFabricAmount() {
		return saleFabricAmount;
	}


	public void setSaleFabricAmount(BigDecimal saleFabricAmount) {
		this.saleFabricAmount = saleFabricAmount;
	}


	public BigDecimal getGiftCertAmount() {
		return giftCertAmount;
	}


	public void setGiftCertAmount(BigDecimal giftCertAmount) {
		this.giftCertAmount = giftCertAmount;
	}


	public BigDecimal getUnknownDeptAmount() {
		return unknownDeptAmount;
	}


	public void setUnknownDeptAmount(BigDecimal unknownDeptAmount) {
		this.unknownDeptAmount = unknownDeptAmount;
	}


	public BigDecimal getNotionAmount() {
		return notionAmount;
	}


	public void setNotionAmount(BigDecimal notionAmount) {
		this.notionAmount = notionAmount;
	}


	public BigDecimal getBomAmount() {
		return bomAmount;
	}


	public void setBomAmount(BigDecimal bomAmount) {
		this.bomAmount = bomAmount;
	}


	public BigDecimal getThreadsAmount() {
		return threadsAmount;
	}


	public void setThreadsAmount(BigDecimal threadsAmount) {
		this.threadsAmount = threadsAmount;
	}


	public BigDecimal getBookAmount() {
		return bookAmount;
	}


	public void setBookAmount(BigDecimal bookAmount) {
		this.bookAmount = bookAmount;
	}


	public BigDecimal getPostageAmount() {
		return postageAmount;
	}


	public void setPostageAmount(BigDecimal postageAmount) {
		this.postageAmount = postageAmount;
	}


	public BigDecimal getKitsAmount() {
		return kitsAmount;
	}


	public void setKitsAmount(BigDecimal kitsAmount) {
		this.kitsAmount = kitsAmount;
	}


	public BigDecimal getClassAmount() {
		return classAmount;
	}


	public void setClassAmount(BigDecimal classAmount) {
		this.classAmount = classAmount;
	}


	public BigDecimal getLongarmAmount() {
		return longarmAmount;
	}


	public void setLongarmAmount(BigDecimal longarmAmount) {
		this.longarmAmount = longarmAmount;
	}


	public BigDecimal getPatternsAmount() {
		return patternsAmount;
	}


	public void setPatternsAmount(BigDecimal patternsAmount) {
		this.patternsAmount = patternsAmount;
	}


	public BigDecimal getPatternAmount() {
		return patternAmount;
	}


	public void setPatternAmount(BigDecimal patternAmount) {
		this.patternAmount = patternAmount;
	}


	public BigDecimal getJanomeAmount() {
		return janomeAmount;
	}


	public void setJanomeAmount(BigDecimal janomeAmount) {
		this.janomeAmount = janomeAmount;
	}


	public BigDecimal getBattingAmount() {
		return battingAmount;
	}


	public void setBattingAmount(BigDecimal battingAmount) {
		this.battingAmount = battingAmount;
	}


	public BigDecimal getMiscAmount() {
		return miscAmount;
	}


	public void setMiscAmount(BigDecimal miscAmount) {
		this.miscAmount = miscAmount;
	}

}
