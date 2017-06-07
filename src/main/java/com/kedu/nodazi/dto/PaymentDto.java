package com.kedu.nodazi.dto;

import java.util.Date;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.dto
 * PaymentDto.java
 * </pre>
 * @author	: 최진혁
 * @Date	: 2017. 6. 05.
 * @Version	: 1.0
 *****************************************************/

public class PaymentDto {
	
	private String u_id;
	private String p_dep_nm;
	private String p_dep_bank;
	private Date p_regdt;
	private Date p_depdt;
	private int p_price;
	private Date p_enddt;
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getP_dep_nm() {
		return p_dep_nm;
	}
	public void setP_dep_nm(String p_dep_nm) {
		this.p_dep_nm = p_dep_nm;
	}
	public String getP_dep_bank() {
		return p_dep_bank;
	}
	public void setP_dep_bank(String p_dep_bank) {
		this.p_dep_bank = p_dep_bank;
	}
	public Date getP_regdt() {
		return p_regdt;
	}
	public void setP_regdt(Date p_regdt) {
		this.p_regdt = p_regdt;
	}
	public Date getP_depdt() {
		return p_depdt;
	}
	public void setP_depdt(Date p_depdt) {
		this.p_depdt = p_depdt;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public Date getP_enddt() {
		return p_enddt;
	}
	public void setP_enddt(Date p_enddt) {
		this.p_enddt = p_enddt;
	}
	@Override
	public String toString() {
		return "PaymentDto [u_id=" + u_id + ", p_dep_nm=" + p_dep_nm + ", p_dep_bank=" + p_dep_bank + ", p_regdt="
				+ p_regdt + ", p_depdt=" + p_depdt + ", p_price=" + p_price + ", p_enddt=" + p_enddt + "]";
	}
	
}
