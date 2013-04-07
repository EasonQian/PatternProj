package me.pattern.nullobject;

public class MouseEventHandler {
	
	private String mouseName = "miky mouse";
	
	public MouseEventHandler(String name) {
		this.setMouseName(name);
	}
	
	public String printMouseName(){
		return mouseName;
	}
	

	public String getMouseName() {
		return mouseName;
	}

	public void setMouseName(String mouseName) {
		this.mouseName = mouseName;
	}
}
