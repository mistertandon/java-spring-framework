package com.mistertandon.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("panCardObj")
public class PanCard {

	@Value("ZQROS4803A")
	private String panNumber;

	@Value("#{employeeObj.name}")
	private String panHolderName;

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPanHolderName() {
		return panHolderName;
	}

	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}

}
