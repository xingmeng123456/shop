package com.ydx.shop.common.enums;

public enum GenderEnum {

	MALE(1,"男"),FEMALE(0,"女");
	private Integer id;
	private String desc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private GenderEnum(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}
	
	
}
