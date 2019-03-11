package com.cg.BigBowl_grocery;

import java.util.Date;

public class GrocerySchema {
	private int referenceId;
	private String gname;
	private String gtype;
	private int quantity;
	private Date date;
	
	
	public GrocerySchema(int referenceId, String gname, String gtype, int quantity) {
		super();
		this.referenceId=referenceId;
		this.gname = gname;
		this.gtype = gtype;
		this.quantity = quantity;
		//this.date = date;
	}
	
	
	public int getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGtype() {
		return gtype;
	}
	public void setGtype(String gtype) {
		this.gtype = gtype;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "[referenceId=" + referenceId + ", gname=" + gname
				+ ", gtype=" + gtype + ", quantity=" + quantity + "]";
	}
	
	
}
