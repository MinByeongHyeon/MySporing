package com.sporing.app.lounge.vo;

public class LoungeVO {
	private int lounge_num;
	private String lounge_content;
	private String lounge_user;
	private String lounge_createAt;
	private String lounge_status;
	
	
	
	public LoungeVO() {;}
	public int getLounge_num() {
		return lounge_num;
	}
	public void setLounge_num(int lounge_num) {
		this.lounge_num = lounge_num;
	}
	public String getLounge_content() {
		return lounge_content;
	}
	public void setLounge_content(String lounge_content) {
		this.lounge_content = lounge_content;
	}
	public String getLounge_user() {
		return lounge_user;
	}
	public void setLounge_user(String lounge_user) {
		this.lounge_user = lounge_user;
	}
	public String getLounge_createAt() {
		return lounge_createAt;
	}
	public void setLounge_createAt(String lounge_createAt) {
		this.lounge_createAt = lounge_createAt;
	}
	public String getLounge_status() {
		return lounge_status;
	}
	public void setLounge_status(String lounge_status) {
		this.lounge_status = lounge_status;
	}
	public LoungeVO(int lounge_num, String lounge_content, String lounge_user, String lounge_createAt,
			String lounge_status) {
		super();
		this.lounge_num = lounge_num;
		this.lounge_content = lounge_content;
		this.lounge_user = lounge_user;
		this.lounge_createAt = lounge_createAt;
		this.lounge_status = lounge_status;
	}
	
	
	
	
	

}
