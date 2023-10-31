package com.model;

public class Bill {
	private int billno;
	private float total;
	private float cgst;
	private float sgst;
	private float finaltotal;
	public Bill(int billno, float total, float cgst, float sgst, float finaltotal) {
		super();
		this.billno = billno;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finaltotal = finaltotal;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getCgst() {
		return cgst;
	}
	public void setCgst(float cgst) {
		this.cgst = cgst;
	}
	public float getSgst() {
		return sgst;
	}
	public void setSgst(float sgst) {
		this.sgst = sgst;
	}
	public float getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(float finaltotal) {
		this.finaltotal = finaltotal;
	}

}
