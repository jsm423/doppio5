package com.web.vo;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class DpCartVO {
	
	String  canum, pnum, id, cadate, cacount;
	public String getCanum() {
		return canum;
	}
	public void setCanum(String canum) {
		this.canum = canum;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCadate() {
		return cadate;
	}
	public void setCadate(String cadate) {
		this.cadate = cadate;
	}
	public String getCacount() {
		return cacount;
	}
	public void setCacount(String cacount) {
		this.cacount = cacount;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	int rno;
	
}