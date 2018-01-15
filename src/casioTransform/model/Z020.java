package casioTransform.model;

import java.math.BigDecimal;

public class Z020 {

	private String z20model;
	private String z20machine;
	private String z20file;
	private String z20mode;
	private int z20zcounter;
	private String z20date;
	private String z20time;
	private BigDecimal grandTotal;
	private BigDecimal prevGrandTotal;

	public String z020CreateTableString() {
		return "create table z020 ( " + "z20model varchar," + "z20machine varchar," + "z20file varchar,"
				+ "z20mode varchar," + "z20zcounter decimal(10)," + "z20date integer," + "z20time varchar,"
				+ "grandTotal decimal(10,2)," + "prevGrandTotal decimal(10,2)" + ");";
	}

	public Z020() {
		super();
	}

	public String getZ20model() {
		return z20model;
	}

	public void setZ20model(String z20model) {
		this.z20model = z20model;
	}

	public String getZ20machine() {
		return z20machine;
	}

	public void setZ20machine(String z20machine) {
		this.z20machine = z20machine;
	}

	public String getZ20file() {
		return z20file;
	}

	public void setZ20file(String z20file) {
		this.z20file = z20file;
	}

	public String getZ20mode() {
		return z20mode;
	}

	public void setZ20mode(String z20mode) {
		this.z20mode = z20mode;
	}

	public int getZ20zcounter() {
		return z20zcounter;
	}

	public void setZ20zcounter(int z20zcounter) {
		this.z20zcounter = z20zcounter;
	}

	public String getZ20date() {
		return z20date;
	}

	public void setZ20date(String z20date) {
		this.z20date = z20date;
	}

	public String getZ20time() {
		return z20time;
	}

	public void setZ20time(String z20time) {
		this.z20time = z20time;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public BigDecimal getPrevGrandTotal() {
		return prevGrandTotal;
	}

	public void setPrevGrandTotal(BigDecimal prevGrandTotal) {
		this.prevGrandTotal = prevGrandTotal;
	}
}
