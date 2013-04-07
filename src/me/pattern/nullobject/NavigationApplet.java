package me.pattern.nullobject;

import java.applet.Applet;
import java.awt.Event;

public class NavigationApplet extends Applet{

	private static final long serialVersionUID = 1L;
	/*
	 * ��ʼ������Ϊnull object
	 */
	private MouseEventHandler mouseEventHandler = new NullMouseEventHandler();
	
	public NavigationApplet() {
		// TODO Auto-generated constructor stub
	}

	public boolean mouseMove(Event event, int x, int y){
		/*
		 * ��Ҫ��������null���������ʹ����nullobjectģʽ֮�󣬿���ȥ��
		 */
//		if (mouseEventHandler != null) {
			this.mouseEventHandler.printMouseName();
//		}
		return true;
	}
}
