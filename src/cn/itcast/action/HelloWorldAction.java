package cn.itcast.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class HelloWorldAction {
	private String msg;
	private String xm;
	private String username;

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXm() {
		return xm;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getMessage() {
		return msg;
	}

	public String execute() throws UnsupportedEncodingException {
		msg="这是我第一个struts2应用！";
		
		System.out.println(getXm());
		
		xm = getXm() == null ? "空" : new String(getXm().getBytes("UTF-8"),"UTF-8");
//		xm = getXm() == null ? "空" : new String(getXm().getBytes("ISO8859_1"),"UTF-8");
//		xm = getXm() == null ? "这是我第一个struts2应用！" : new String(getXm().getBytes("GB2312"),"UTF-8");
//		xm = getXm() == null ? "这是我第一个struts2应用！" : getXm();
		
		this.setUsername(URLEncoder.encode("吉布森","UTF-8"));
		
		System.out.println("username:"+username);
		System.out.println("xm:"+xm);
		return "success";
	}
}
