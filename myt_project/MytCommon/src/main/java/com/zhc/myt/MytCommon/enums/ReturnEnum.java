package com.zhc.myt.MytCommon.enums;

public enum ReturnEnum {
	
	SUCCESS(200, "操作成功", true), 
	NOT_FOUND(400, "没有该资源", false),
	FAILURE(500, "系统错误", false);

	private int code;
	private String message;
	private boolean status;
	
	
	private ReturnEnum (int code, String message, boolean status){
		this.code = code;
		this.message = message;
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
