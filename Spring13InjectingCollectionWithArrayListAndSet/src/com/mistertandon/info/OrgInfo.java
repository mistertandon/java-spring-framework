package com.mistertandon.info;

import java.util.List;
import java.util.Set;

public class OrgInfo {

	private String nameArr[] = new String[5];

	private List<String> empNameList;

	private Set<Integer> empIdSet;

	public String[] getNameArr() {
		return nameArr;
	}

	public void setNameArr(String[] nameArr) {
		this.nameArr = nameArr;
	}

	public List<String> getEmpNameList() {
		return empNameList;
	}

	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}

	public Set<Integer> getEmpIdSet() {
		return empIdSet;
	}

	public void setEmpIdSet(Set<Integer> empIdSet) {
		this.empIdSet = empIdSet;
	}

}
