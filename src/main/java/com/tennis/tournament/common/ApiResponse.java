package com.tennis.tournament.common;

import java.util.List;

public class ApiResponse<T> {

	boolean messagePresent;
	List<ApiMessage> messages;
	T data;
	
	public ApiResponse() {
        super();
    }

    public ApiResponse(List<ApiMessage> listMessage, T data) {
        this.messages = listMessage;
        this.data = data;

        if (listMessage != null && listMessage.size() > 0) {
            messagePresent = true;
        }
    }


    public ApiResponse(List<ApiMessage> listMessage) {
        this.messages = listMessage;
        if (listMessage != null && listMessage.size() > 0) {
            messagePresent = true;
        }
    }

    public ApiResponse(T data) {
        this.data = data;
        messagePresent = false;
    }

}
