package com.to;

import java.util.Date;

public class user {
	private String udate;
	private String ufrom;
	private String uto;
	private int uperson;
	@Override
	public String toString() {
		return "user [udate=" + udate + ", ufrom=" + ufrom + ", uto=" + uto + ", uperson=" + uperson + "]";
	}
	public user(String udate, String ufrom, String uto, int uperson) {
		super();
		this.udate = udate;
		this.ufrom = ufrom;
		this.uto = uto;
		this.uperson = uperson;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getUfrom() {
		return ufrom;
	}
	public void setUfrom(String ufrom) {
		this.ufrom = ufrom;
	}
	public String getUto() {
		return uto;
	}
	public void setUto(String uto) {
		this.uto = uto;
	}
	public int getUperson() {
		return uperson;
	}
	public void setUperson(int uperson) {
		this.uperson = uperson;
	}
	

}
