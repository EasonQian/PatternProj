package me.pattern.nullobject;

import java.applet.Applet;
import java.awt.Event;

public class NavigationApplet extends Applet{

	private static final long serialVersionUID = 1L;
	/*
	 * 初始化属性为null object
	 */
	private MouseEventHandler mouseEventHandler = new NullMouseEventHandler();
	
	public NavigationApplet() {
		// TODO Auto-generated constructor stub
	}

	public boolean mouseMove(Event event, int x, int y){
		/*
		 * 需要大量检查非null的情况，在使用了nullobject模式之后，可以去除
		 */
//		if (mouseEventHandler != null) {
			this.mouseEventHandler.printMouseName();
//		}
		return true;
	}
}
