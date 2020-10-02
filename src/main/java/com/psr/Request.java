package com.psr;

import java.io.Serializable;

public class Request implements Serializable {

    private static final long serialVersionUID = 5414772190010136993L;

    private String input;

    public String getInput() {
	return input;
    }

    public void setInput(String input) {
	this.input = input;
    }

}
