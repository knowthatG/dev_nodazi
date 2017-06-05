package com.kedu.nodazi.dto;

import java.util.Date;

public class ReplyDto {
	private int		b_no;
	private int		r_no;
	private String	u_id;
	private String	r_content;
	private Date	r_regdt;
	private Date	r_updatedt;
	
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public Date getR_regdt() {
		return r_regdt;
	}
	public void setR_regdt(Date r_regdt) {
		this.r_regdt = r_regdt;
	}
	public Date getR_updatedt() {
		return r_updatedt;
	}
	public void setR_updatedt(Date r_updatedt) {
		this.r_updatedt = r_updatedt;
	}
	
	@Override
	public String toString() {
		return "ReplyDto [b_no=" + b_no + ", r_no=" + r_no + ", u_id=" + u_id + ", r_content=" + r_content
				+ ", r_regdt=" + r_regdt + ", r_updatedt=" + r_updatedt + "]";
	}
	
}
