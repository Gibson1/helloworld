package cn.itcast.action;

public class HelloWorldAction {
	private String msg;

	public String getMessage() {
		return msg;
	}

	public String execute() {
		msg = "我的第一个struts应用！";
		return "success";
	}
}
