package com.sporing.app.intro.vo;

public class IntroVO {
	private int intro_num;
	private String intro_category;
	private String intro_state;
	private String intro_date;
	private String intro_start_time;
	private String intro_end_time;
	private String intro_grade;
	private String intro_phone;
	private String intro_highlight;
	private String intro_user;
	private String intro_createAt;
	private String intro_status;
	public int getIntro_num() {
		return intro_num;
	}
	public void setIntro_num(int intro_num) {
		this.intro_num = intro_num;
	}
	public String getIntro_category() {
		return intro_category;
	}
	public void setIntro_category(String intro_category) {
		this.intro_category = intro_category;
	}
	public String getIntro_state() {
		return intro_state;
	}
	public void setIntro_state(String intro_state) {
		this.intro_state = intro_state;
	}
	public String getIntro_date() {
		return intro_date;
	}
	public void setIntro_date(String intro_date) {
		this.intro_date = intro_date;
	}
	public String getIntro_start_time() {
		return intro_start_time;
	}
	public void setIntro_start_time(String intro_start_time) {
		this.intro_start_time = intro_start_time;
	}
	public String getIntro_end_time() {
		return intro_end_time;
	}
	public void setIntro_end_time(String intro_end_time) {
		this.intro_end_time = intro_end_time;
	}
	public String getIntro_grade() {
		return intro_grade;
	}
	public void setIntro_grade(String intro_grade) {
		this.intro_grade = intro_grade;
	}
	public String getIntro_phone() {
		return intro_phone;
	}
	public void setIntro_phone(String intro_phone) {
		this.intro_phone = intro_phone;
	}
	public String getIntro_highlight() {
		return intro_highlight;
	}
	public void setIntro_highlight(String intro_highlight) {
		this.intro_highlight = intro_highlight;
	}
	public String getIntro_user() {
		return intro_user;
	}
	public void setIntro_user(String intro_user) {
		this.intro_user = intro_user;
	}
	public String getIntro_createAt() {
		return intro_createAt;
	}
	public void setIntro_createAt(String intro_createAt) {
		this.intro_createAt = intro_createAt;
	}
	public String getIntro_status() {
		return intro_status;
	}
	public void setIntro_status(String intro_status) {
		this.intro_status = intro_status;
	}
	public IntroVO(int intro_num, String intro_category, String intro_state, String intro_date, String intro_start_time,
			String intro_end_time, String intro_grade, String intro_phone, String intro_highlight, String intro_user,
			String intro_createAt, String intro_status) {
		super();
		this.intro_num = intro_num;
		this.intro_category = intro_category;
		this.intro_state = intro_state;
		this.intro_date = intro_date;
		this.intro_start_time = intro_start_time;
		this.intro_end_time = intro_end_time;
		this.intro_grade = intro_grade;
		this.intro_phone = intro_phone;
		this.intro_highlight = intro_highlight;
		this.intro_user = intro_user;
		this.intro_createAt = intro_createAt;
		this.intro_status = intro_status;
	}
	
	
	

}
