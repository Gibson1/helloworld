package cn.itcast.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import cn.itcast.bean.Person;

public class HelloWorldAction {
	private String msg;
	private String xm;
	private String username;
	private int id;
	private String name;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		msg = "这是我第一个struts2应用！";

		System.out.println(getXm());

		xm = getXm() == null ? "空" : new String(getXm().getBytes("UTF-8"), "UTF-8");
		// xm = getXm() == null ? "空" : new
		// String(getXm().getBytes("ISO8859_1"),"UTF-8");
		// xm = getXm() == null ? "这是我第一个struts2应用！" : new
		// String(getXm().getBytes("GB2312"),"UTF-8");
		// xm = getXm() == null ? "这是我第一个struts2应用！" : getXm();

		this.setUsername(URLEncoder.encode("吉布森", "UTF-8"));

		System.out.println("username:" + username);
		System.out.println("xm:" + xm);
		return "success";
	}

	public String display() {
		msg = "动态方法调用display";
		return "message";
	}

	public String addUI() {
		msg = "动态方法调用addUI";
		return "message";
	}
}
