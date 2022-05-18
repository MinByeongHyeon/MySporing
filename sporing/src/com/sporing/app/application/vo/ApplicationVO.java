package com.sporing.app.application.vo;

public class ApplicationVO {
	private int application_num;
	private String application_board;
	private String application_user;
	private String application_highlight;
	private String application_creat;
	private String application_status;
	public ApplicationVO() {;}
	public int getApplication_num() {
		return application_num;
	}
	public void setApplication_num(int application_num) {
		this.application_num = application_num;
	}
	public String getApplication_board() {
		return application_board;
	}
	public void setApplication_board(String application_board) {
		this.application_board = application_board;
	}
	public String getApplication_user() {
		return application_user;
	}
	public void setApplication_user(String application_user) {
		this.application_user = application_user;
	}
	public String getApplication_highlight() {
		return application_highlight;
	}
	public void setApplication_highlight(String application_highlight) {
		this.application_highlight = application_highlight;
	}
	public String getApplication_creat() {
		return application_creat;
	}
	public void setApplication_creat(String application_creat) {
		this.application_creat = application_creat;
	}
	public String getApplication_status() {
		return application_status;
	}
	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}
	public ApplicationVO(int application_num, String application_board, String application_user,
			String application_highlight, String application_creat, String application_status) {
		super();
		this.application_num = application_num;
		this.application_board = application_board;
		this.application_user = application_user;
		this.application_highlight = application_highlight;
		this.application_creat = application_creat;
		this.application_status = application_status;
	}
	
	

}
