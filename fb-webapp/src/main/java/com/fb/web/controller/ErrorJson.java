package com.fb.web.controller;

import java.util.Map;
public class ErrorJson {
	private int status;
	private String error;
	private String message;
	private String trace;
	
	public ErrorJson(int status,Map<String,Object> errorAttributes){
		this.status=status;
		this.error=(String) errorAttributes.get("error");
		this.message=(String) errorAttributes.get("message");
		this.trace=(String) errorAttributes.get("trace");
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	
}
