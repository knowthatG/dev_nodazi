package com.kedu.nodazi.dto;

import java.util.Date;

/*****************************************************
 * <pre>
 * com.kedu.nodazi.dto
 * RecStockDto.java
 * </pre>
 * @author	: 오윤진
 * @Date	: 2017. 5. 25.
 * @Version	: 1.0
 *****************************************************/
public class RecStockDto {
	
	private String	r_regdt;
	private String	r_recdt;
	private int		r_seq;
	private String	code;
	private	float	r_change;
	
	
	public String getR_regdt() {
		return r_regdt;
	}
	public void setR_regdt(String r_regdt) {
		this.r_regdt = r_regdt;
	}
	public String getR_recdt() {
		return r_recdt;
	}
	public void setR_recdt(String r_recdt) {
		this.r_recdt = r_recdt;
	}
	public int getR_seq() {
		return r_seq;
	}
	public void setR_seq(int r_seq) {
		this.r_seq = r_seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getR_change() {
		return r_change;
	}
	public void setR_change(float r_change) {
		this.r_change = r_change;
	}

	
	@Override
	public String toString() {
		return "RecStockDto [r_regdt=" + r_regdt + ", r_recdt=" + r_recdt + ", r_seq=" + r_seq + ", code=" + code
				+ ", r_change=" + r_change + "]";
	}
	
	
}
