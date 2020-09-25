package com.psr;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = 6571267120426375942L;

    public Response(String responseCode, String responseMessage, Object responseData) {
	this.responseCode = responseCode;
	this.responseMessage = responseMessage;
	this.responseData = responseData;
    }

    private String responseCode;
    private String responseMessage;
    private Object responseData;

    public String getResponseCode() {
	return responseCode;
    }

    public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
    }

    public String getResponseMessage() {
	return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
	this.responseMessage = responseMessage;
    }

    public Object getResponseData() {
	return responseData;
    }

    public void setResponseData(Object responseData) {
	this.responseData = responseData;
    }
}
