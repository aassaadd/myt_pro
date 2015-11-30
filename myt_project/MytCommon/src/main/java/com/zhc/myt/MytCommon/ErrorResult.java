package com.zhc.myt.MytCommon;

/**
 * 错误的返回结果
 */
public final class ErrorResult extends Result {
	private String errorCode;

	public ErrorResult(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
