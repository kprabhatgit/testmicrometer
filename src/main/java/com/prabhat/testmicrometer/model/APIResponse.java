package com.prabhat.testmicrometer.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class APIResponse<T> {
	public static final String STATUS_SUCCESS = "SUCCESS";
	public static final String STATUS_ERROR = "ERROR";
	private String status;
	private String errorMessage;
	private Object errorDetails;
	private T response;
	private String version;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(Object errorDetails) {
		this.errorDetails = errorDetails;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
		return objectMapper.writeValueAsString(objectMapper);
	}catch(JsonProcessingException jpe) {
		jpe.printStackTrace();
	}
	
		return "";
	
}
}
