package casioTransform.model;

import java.math.BigDecimal;

public class Z002 {

	private String z02model;
	private String z02machine;
	private String z02report;
	private String z02file;
	private String z02mode;
	private int z02zcounter;
	private String z02date;
	private String z02time;
	private BigDecimal cashQuantity;
	private BigDecimal subtotalQuantity;
	private BigDecimal chargeQuantity;
	private BigDecimal checkQuantity;
	private BigDecimal helpQuantity;
	private BigDecimal taxpgmQuantity;
	private BigDecimal poQuantity;
	private BigDecimal raQuantity;
	private BigDecimal signoffQuantity;
	private BigDecimal clknoQuantity;
	private BigDecimal shiftnoQuantity;
	private BigDecimal dwnQuantity;
	private BigDecimal pctdiscountQuantity;
	private BigDecimal discountQuantity;
	private BigDecimal pluQuantity;
	private BigDecimal prcQuantity;
	private BigDecimal receiptQuantity;
	private BigDecimal corrQuantity;
	private BigDecimal rfQuantity;
	private BigDecimal openQuantity;
	private BigDecimal rctQuantity;
	private BigDecimal zeroQuantity;
	private BigDecimal dotQuantity;
	private BigDecimal vatQuantity;
	private BigDecimal nsQuantity;
	private BigDecimal couponQuantity;
	private BigDecimal upQuantity;
	private BigDecimal ceQuantity;
	private BigDecimal xQuantity;
	private BigDecimal hashQuantity;
	private BigDecimal nosaleQuantity;
	private BigDecimal voidQuantity;
	private BigDecimal cashAmount;
	private BigDecimal subtotalAmount;
	private BigDecimal chargeAmount;
	private BigDecimal checkAmount;
	private BigDecimal helpAmount;
	private BigDecimal taxpgmAmount;
	private BigDecimal poAmount;
	private BigDecimal raAmount;
	private BigDecimal signoffAmount;
	private BigDecimal clknoAmount;
	private BigDecimal shiftnoAmount;
	private BigDecimal dwnAmount;
	private BigDecimal pctdiscountAmount;
	private BigDecimal discountAmount;
	private BigDecimal pluAmount;
	private BigDecimal prcAmount;
	private BigDecimal receiptAmount;
	private BigDecimal corrAmount;
	private BigDecimal rfAmount;
	private BigDecimal openAmount;
	private BigDecimal rctAmount;
	private BigDecimal zeroAmount;
	private BigDecimal dotAmount;
	private BigDecimal vatAmount;
	private BigDecimal nsAmount;
	private BigDecimal couponAmount;
	private BigDecimal upAmount;
	private BigDecimal ceAmount;
	private BigDecimal xAmount;
	private BigDecimal hashAmount;
	private BigDecimal nosaleAmount;
	private BigDecimal voidAmount;

	public String z002CreateTableString() {
		return "create table z002 ( " + "z02model varchar," + "z02machine varchar," + "z02report varchar,"
				+ "z02file varchar," + "z02mode varchar," + "z02zcounter integer," + "z02date varchar,"
				+ "z02time varchar," + "cashQuantity integer," + "subtotalQuantity integer," + "chargeQuantity integer,"
				+ "checkQuantity integer," + "helpQuantity integer," + "taxpgmQuantity integer," + "poQuantity integer,"
				+ "raQuantity integer," + "signoffQuantity integer," + "clknoQuantity integer,"
				+ "shiftnoQuantity integer," + "dwnQuantity integer," + "pctdiscountQuantity integer,"
				+ "discountQuantity integer," + "pluQuantity integer," + "prcQuantity integer,"
				+ "receiptQuantity integer," + "corrQuantity integer," + "rfQuantity integer," + "openQuantity integer,"
				+ "rctQuantity integer," + "zeroQuantity integer," + "dotQuantity integer," + "vatQuantity integer,"
				+ "nsQuantity integer," + "couponQuantity integer," + "upQuantity integer," + "ceQuantity integer,"
				+ "xQuantity integer," + "hashQuantity integer," + "nosaleQuantity integer," + "voidQuantity integer,"
				+ "cashAmount decimal(10,2)," + "subtotalAmount decimal(10,2)," + "chargeAmount decimal(10,2),"
				+ "checkAmount decimal(10,2)," + "helpAmount decimal(10,2)," + "taxpgmAmount decimal(10,2),"
				+ "poAmount decimal(10,2)," + "raAmount decimal(10,2)," + "signoffAmount decimal(10,2),"
				+ "clknoAmount decimal(10,2)," + "shiftnoAmount decimal(10,2)," + "dwnAmount decimal(10,2),"
				+ "pctdiscountAmount decimal(10,2)," + "discountAmount decimal(10,2)," + "pluAmount decimal(10,2),"
				+ "prcAmount decimal(10,2)," + "receiptAmount decimal(10,2)," + "corrAmount decimal(10,2),"
				+ "rfAmount decimal(10,2)," + "openAmount decimal(10,2)," + "rctAmount decimal(10,2),"
				+ "zeroAmount decimal(10,2)," + "dotAmount decimal(10,2)," + "vatAmount decimal(10,2),"
				+ "nsAmount decimal(10,2)," + "couponAmount decimal(10,2)," + "upAmount decimal(10,2),"
				+ "ceAmount decimal(10,2)," + "xAmount decimal(10,2)," + "hashAmount decimal(10,2),"
				+ "nosaleAmount decimal(10,2)," + "voidAmount decimal(10,2)" + " );";
	}

	public String getZ02model() {
		return z02model;
	}

	public void setZ02model(String z02model) {
		this.z02model = z02model;
	}

	public String getZ02machine() {
		return z02machine;
	}

	public void setZ02machine(String z02machine) {
		this.z02machine = z02machine;
	}

	public String getZ02report() {
		return z02report;
	}

	public void setZ02report(String z02report) {
		this.z02report = z02report;
	}

	public String getZ02file() {
		return z02file;
	}

	public void setZ02file(String z02file) {
		this.z02file = z02file;
	}

	public String getZ02mode() {
		return z02mode;
	}

	public void setZ02mode(String z02mode) {
		this.z02mode = z02mode;
	}

	public int getZ02zcounter() {
		return z02zcounter;
	}

	public void setZ02zcounter(int z02zcounter) {
		this.z02zcounter = z02zcounter;
	}

	public String getZ02date() {
		return z02date;
	}

	public void setZ02date(String z02date) {
		this.z02date = z02date;
	}

	public String getZ02time() {
		return z02time;
	}

	public void setZ02time(String z02time) {
		this.z02time = z02time;
	}

	public BigDecimal getCashQuantity() {
		return cashQuantity;
	}

	public void setCashQuantity(BigDecimal cashQuantity) {
		this.cashQuantity = cashQuantity;
	}

	public BigDecimal getSubtotalQuantity() {
		return subtotalQuantity;
	}

	public void setSubtotalQuantity(BigDecimal subtotalQuantity) {
		this.subtotalQuantity = subtotalQuantity;
	}

	public BigDecimal getChargeQuantity() {
		return chargeQuantity;
	}

	public void setChargeQuantity(BigDecimal chargeQuantity) {
		this.chargeQuantity = chargeQuantity;
	}

	public BigDecimal getCheckQuantity() {
		return checkQuantity;
	}

	public void setCheckQuantity(BigDecimal checkQuantity) {
		this.checkQuantity = checkQuantity;
	}

	public BigDecimal getHelpQuantity() {
		return helpQuantity;
	}

	public void setHelpQuantity(BigDecimal helpQuantity) {
		this.helpQuantity = helpQuantity;
	}

	public BigDecimal getTaxpgmQuantity() {
		return taxpgmQuantity;
	}

	public void setTaxpgmQuantity(BigDecimal taxpgmQuantity) {
		this.taxpgmQuantity = taxpgmQuantity;
	}

	public BigDecimal getPoQuantity() {
		return poQuantity;
	}

	public void setPoQuantity(BigDecimal poQuantity) {
		this.poQuantity = poQuantity;
	}

	public BigDecimal getRaQuantity() {
		return raQuantity;
	}

	public void setRaQuantity(BigDecimal raQuantity) {
		this.raQuantity = raQuantity;
	}

	public BigDecimal getSignoffQuantity() {
		return signoffQuantity;
	}

	public void setSignoffQuantity(BigDecimal signoffQuantity) {
		this.signoffQuantity = signoffQuantity;
	}

	public BigDecimal getClknoQuantity() {
		return clknoQuantity;
	}

	public void setClknoQuantity(BigDecimal clknoQuantity) {
		this.clknoQuantity = clknoQuantity;
	}

	public BigDecimal getShiftnoQuantity() {
		return shiftnoQuantity;
	}

	public void setShiftnoQuantity(BigDecimal shiftnoQuantity) {
		this.shiftnoQuantity = shiftnoQuantity;
	}

	public BigDecimal getDwnQuantity() {
		return dwnQuantity;
	}

	public void setDwnQuantity(BigDecimal dwnQuantity) {
		this.dwnQuantity = dwnQuantity;
	}

	public BigDecimal getPctdiscountQuantity() {
		return pctdiscountQuantity;
	}

	public void setPctdiscountQuantity(BigDecimal pctdiscountQuantity) {
		this.pctdiscountQuantity = pctdiscountQuantity;
	}

	public BigDecimal getDiscountQuantity() {
		return discountQuantity;
	}

	public void setDiscountQuantity(BigDecimal discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	public BigDecimal getPluQuantity() {
		return pluQuantity;
	}

	public void setPluQuantity(BigDecimal pluQuantity) {
		this.pluQuantity = pluQuantity;
	}

	public BigDecimal getPrcQuantity() {
		return prcQuantity;
	}

	public void setPrcQuantity(BigDecimal prcQuantity) {
		this.prcQuantity = prcQuantity;
	}

	public BigDecimal getReceiptQuantity() {
		return receiptQuantity;
	}

	public void setReceiptQuantity(BigDecimal receiptQuantity) {
		this.receiptQuantity = receiptQuantity;
	}

	public BigDecimal getCorrQuantity() {
		return corrQuantity;
	}

	public void setCorrQuantity(BigDecimal corrQuantity) {
		this.corrQuantity = corrQuantity;
	}

	public BigDecimal getRfQuantity() {
		return rfQuantity;
	}

	public void setRfQuantity(BigDecimal rfQuantity) {
		this.rfQuantity = rfQuantity;
	}

	public BigDecimal getOpenQuantity() {
		return openQuantity;
	}

	public void setOpenQuantity(BigDecimal openQuantity) {
		this.openQuantity = openQuantity;
	}

	public BigDecimal getRctQuantity() {
		return rctQuantity;
	}

	public void setRctQuantity(BigDecimal rctQuantity) {
		this.rctQuantity = rctQuantity;
	}

	public BigDecimal getZeroQuantity() {
		return zeroQuantity;
	}

	public void setZeroQuantity(BigDecimal zeroQuantity) {
		this.zeroQuantity = zeroQuantity;
	}

	public BigDecimal getDotQuantity() {
		return dotQuantity;
	}

	public void setDotQuantity(BigDecimal dotQuantity) {
		this.dotQuantity = dotQuantity;
	}

	public BigDecimal getVatQuantity() {
		return vatQuantity;
	}

	public void setVatQuantity(BigDecimal vatQuantity) {
		this.vatQuantity = vatQuantity;
	}

	public BigDecimal getNsQuantity() {
		return nsQuantity;
	}

	public void setNsQuantity(BigDecimal nsQuantity) {
		this.nsQuantity = nsQuantity;
	}

	public BigDecimal getCouponQuantity() {
		return couponQuantity;
	}

	public void setCouponQuantity(BigDecimal couponQuantity) {
		this.couponQuantity = couponQuantity;
	}

	public BigDecimal getUpQuantity() {
		return upQuantity;
	}

	public void setUpQuantity(BigDecimal upQuantity) {
		this.upQuantity = upQuantity;
	}

	public BigDecimal getCeQuantity() {
		return ceQuantity;
	}

	public void setCeQuantity(BigDecimal ceQuantity) {
		this.ceQuantity = ceQuantity;
	}

	public BigDecimal getxQuantity() {
		return xQuantity;
	}

	public void setxQuantity(BigDecimal xQuantity) {
		this.xQuantity = xQuantity;
	}

	public BigDecimal getHashQuantity() {
		return hashQuantity;
	}

	public void setHashQuantity(BigDecimal hashQuantity) {
		this.hashQuantity = hashQuantity;
	}

	public BigDecimal getNosaleQuantity() {
		return nosaleQuantity;
	}

	public void setNosaleQuantity(BigDecimal nosaleQuantity) {
		this.nosaleQuantity = nosaleQuantity;
	}

	public BigDecimal getVoidQuantity() {
		return voidQuantity;
	}

	public void setVoidQuantity(BigDecimal voidQuantity) {
		this.voidQuantity = voidQuantity;
	}

	public BigDecimal getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BigDecimal getSubtotalAmount() {
		return subtotalAmount;
	}

	public void setSubtotalAmount(BigDecimal subtotalAmount) {
		this.subtotalAmount = subtotalAmount;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public BigDecimal getCheckAmount() {
		return checkAmount;
	}

	public void setCheckAmount(BigDecimal checkAmount) {
		this.checkAmount = checkAmount;
	}

	public BigDecimal getHelpAmount() {
		return helpAmount;
	}

	public void setHelpAmount(BigDecimal helpAmount) {
		this.helpAmount = helpAmount;
	}

	public BigDecimal getTaxpgmAmount() {
		return taxpgmAmount;
	}

	public void setTaxpgmAmount(BigDecimal taxpgmAmount) {
		this.taxpgmAmount = taxpgmAmount;
	}

	public BigDecimal getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(BigDecimal poAmount) {
		this.poAmount = poAmount;
	}

	public BigDecimal getRaAmount() {
		return raAmount;
	}

	public void setRaAmount(BigDecimal raAmount) {
		this.raAmount = raAmount;
	}

	public BigDecimal getSignoffAmount() {
		return signoffAmount;
	}

	public void setSignoffAmount(BigDecimal signoffAmount) {
		this.signoffAmount = signoffAmount;
	}

	public BigDecimal getClknoAmount() {
		return clknoAmount;
	}

	public void setClknoAmount(BigDecimal clknoAmount) {
		this.clknoAmount = clknoAmount;
	}

	public BigDecimal getShiftnoAmount() {
		return shiftnoAmount;
	}

	public void setShiftnoAmount(BigDecimal shiftnoAmount) {
		this.shiftnoAmount = shiftnoAmount;
	}

	public BigDecimal getDwnAmount() {
		return dwnAmount;
	}

	public void setDwnAmount(BigDecimal dwnAmount) {
		this.dwnAmount = dwnAmount;
	}

	public BigDecimal getPctdiscountAmount() {
		return pctdiscountAmount;
	}

	public void setPctdiscountAmount(BigDecimal pctdiscountAmount) {
		this.pctdiscountAmount = pctdiscountAmount;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getPluAmount() {
		return pluAmount;
	}

	public void setPluAmount(BigDecimal pluAmount) {
		this.pluAmount = pluAmount;
	}

	public BigDecimal getPrcAmount() {
		return prcAmount;
	}

	public void setPrcAmount(BigDecimal prcAmount) {
		this.prcAmount = prcAmount;
	}

	public BigDecimal getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public BigDecimal getCorrAmount() {
		return corrAmount;
	}

	public void setCorrAmount(BigDecimal corrAmount) {
		this.corrAmount = corrAmount;
	}

	public BigDecimal getRfAmount() {
		return rfAmount;
	}

	public void setRfAmount(BigDecimal rfAmount) {
		this.rfAmount = rfAmount;
	}

	public BigDecimal getOpenAmount() {
		return openAmount;
	}

	public void setOpenAmount(BigDecimal openAmount) {
		this.openAmount = openAmount;
	}

	public BigDecimal getRctAmount() {
		return rctAmount;
	}

	public void setRctAmount(BigDecimal rctAmount) {
		this.rctAmount = rctAmount;
	}

	public BigDecimal getZeroAmount() {
		return zeroAmount;
	}

	public void setZeroAmount(BigDecimal zeroAmount) {
		this.zeroAmount = zeroAmount;
	}

	public BigDecimal getDotAmount() {
		return dotAmount;
	}

	public void setDotAmount(BigDecimal dotAmount) {
		this.dotAmount = dotAmount;
	}

	public BigDecimal getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}

	public BigDecimal getNsAmount() {
		return nsAmount;
	}

	public void setNsAmount(BigDecimal nsAmount) {
		this.nsAmount = nsAmount;
	}

	public BigDecimal getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	public BigDecimal getUpAmount() {
		return upAmount;
	}

	public void setUpAmount(BigDecimal upAmount) {
		this.upAmount = upAmount;
	}

	public BigDecimal getCeAmount() {
		return ceAmount;
	}

	public void setCeAmount(BigDecimal ceAmount) {
		this.ceAmount = ceAmount;
	}

	public BigDecimal getxAmount() {
		return xAmount;
	}

	public void setxAmount(BigDecimal xAmount) {
		this.xAmount = xAmount;
	}

	public BigDecimal getHashAmount() {
		return hashAmount;
	}

	public void setHashAmount(BigDecimal hashAmount) {
		this.hashAmount = hashAmount;
	}

	public BigDecimal getNosaleAmount() {
		return nosaleAmount;
	}

	public void setNosaleAmount(BigDecimal nosaleAmount) {
		this.nosaleAmount = nosaleAmount;
	}

	public BigDecimal getVoidAmount() {
		return voidAmount;
	}

	public void setVoidAmount(BigDecimal voidAmount) {
		this.voidAmount = voidAmount;
	}

	public Z002() {
		super();
	}
}
