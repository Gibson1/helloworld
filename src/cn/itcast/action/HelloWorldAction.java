package cn.itcast.action;

public class HelloWorldAction {
	private String msg;

	public String getMessage() {
		return msg;
	}

	public String execute() {
		msg = "�ҵĵ�һ��strutsӦ�ã�";
		return "success";
	}
}
