package cn.itcast.action;

import java.io.UnsupportedEncodingException;

public class HelloWorldAction {
	private String msg;
	private String xm;

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXm() {
		return xm;
	}

	public String getMessage() {
		return msg;
	}

	public String execute() throws UnsupportedEncodingException {
//		msg = getXm() == null ? "这是我第一个struts2应用！" : new String(getXm().getBytes("ISO8859_1"),"UTF-8");
//		msg = getXm() == null ? "这是我第一个struts2应用！" : new String(getXm().getBytes("GB2312"),"UTF-8");
		msg = getXm() == null ? "这是我第一个struts2应用！" : getXm();
		return "success";
	}
}
