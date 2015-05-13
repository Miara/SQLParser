package com.parser.persistence;

import java.util.ArrayList;
import java.util.List;

public class SQLColumn {
	
	private String name;
	private SQLColumnTypes type = SQLColumnTypes.INT;
	
	//jeœli int to value dotyczy wartoœci liczbowej,
	// jak string to dotyczy dlugosci ciagu znakow
	private int minValue;
	private int maxValue;
	
	//iloœæ generowanych wierszy
	private int rowNumber;
	
	//private List<String> restrictionList = new ArrayList<String>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SQLColumnTypes getType() {
		return type;
	}
	public void setType(SQLColumnTypes type) {
		this.type = type;
	}
	public int getMinValue() {
		return minValue;
	}
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
	
	

}
