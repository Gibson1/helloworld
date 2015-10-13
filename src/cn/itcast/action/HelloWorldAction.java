package cn.itcast.action;

public class HelloWorldAction {
	private String msg;

	public String getMessage() {
		return msg;
	}

	public String execute() {
		msg = "这是我第一个struts2应用！";
		return "success";
	}
}
