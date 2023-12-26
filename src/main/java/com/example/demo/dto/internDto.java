package com.example.demo.dto;

public class internDto {

	
	private String Msg;
	
	private Object Data;
	
	private int status;

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public Object getData() {
		return Data;
	}

	public void setData(Object data) {
		Data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "internDto [Msg=" + Msg + ", Data=" + Data + ", status=" + status + "]";
	}

	public internDto(String msg, String data, int status) {
		super();
		Msg = msg;
		Data = data;
		this.status = status;
	}

	public internDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
