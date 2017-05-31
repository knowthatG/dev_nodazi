package com.kedu.nodazi.dto;

import java.util.Date;

public class PricesDto {
	
	private Integer	id;
	private String	last_update;
	private Date	price_date;
	private String	code;
	private	Integer	price_open;
	private Integer	price_close;
	private	Integer	price_high;
	private Integer	price_low;
	private	Integer	price_adj_close;
	private Integer volume;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	public Date getPrice_date() {
		return price_date;
	}
	public void setPrice_date(Date price_date) {
		this.price_date = price_date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getPrice_open() {
		return price_open;
	}
	public void setPrice_open(Integer price_open) {
		this.price_open = price_open;
	}
	public Integer getPrice_close() {
		return price_close;
	}
	public void setPrice_close(Integer price_close) {
		this.price_close = price_close;
	}
	public Integer getPrice_high() {
		return price_high;
	}
	public void setPrice_high(Integer price_high) {
		this.price_high = price_high;
	}
	public Integer getPrice_low() {
		return price_low;
	}
	public void setPrice_low(Integer price_low) {
		this.price_low = price_low;
	}
	public Integer getPrice_adj_close() {
		return price_adj_close;
	}
	public void setPrice_adj_close(Integer price_adj_close) {
		this.price_adj_close = price_adj_close;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	
	@Override
	public String toString() {
		return "PricesDto [id=" + id + ", last_update=" + last_update + ", price_date=" + price_date + ", code=" + code
				+ ", price_open=" + price_open + ", price_close=" + price_close + ", price_high=" + price_high
				+ ", price_low=" + price_low + ", price_adj_close=" + price_adj_close + ", volume=" + volume + "]";
	}

}
