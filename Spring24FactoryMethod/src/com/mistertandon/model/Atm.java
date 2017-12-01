package com.mistertandon.model;

public class Atm {

	private Printer printerObj;

	public Printer getPrinterObj() {
		return printerObj;
	}

	public void setPrinterObj(Printer printerObj) {
		this.printerObj = printerObj;
	}

	public void balanceInformation(String accountNumber) {

		getPrinterObj().printBalanceInformation(accountNumber);
	}
}
