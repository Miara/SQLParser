package com.parser.persistence;

import java.util.ArrayList;
import java.util.List;

public class SQLTable {
	
	private String name;
	private int rowNum;
	private String distribution;
	private int minRowSize;
	private List<SQLColumn> columns = new ArrayList<SQLColumn>();
	
		
	public void addColumn(SQLColumn column)
	{
		columns.add(column);
	}

	

	@Override
	public String toString() {
		return "SQLTable [name=" + name + ", rowNum=" + rowNum
				+ ", distribution=" + distribution + ", minRowSize="
				+ minRowSize + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public int getMinRowSize() {
		return minRowSize;
	}

	public void setMinRowSize(int minRowSize) {
		this.minRowSize = minRowSize;
	}

	public List<SQLColumn> getColumns() {
		return columns;
	}

	public void setColumns(List<SQLColumn> columns) {
		this.columns = columns;
	}
	
	
	
	
	
	
	
	
}
