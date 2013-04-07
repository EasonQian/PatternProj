package me.pattern.nullobject;

/**
 * 
 * @author eason qian
 * 将null逻辑替换为一个nullobject，提供正确的默认行为，保证字段和变量的调用永远是安全的
 * nullobject实现父类的所有方法，并提供默认的或无害的行为
 * 
 * + 不需要重复的null逻辑检查就可以避免null错误
 * - 使维护变得困难，拥有超类的nullobject必须重写所有继承到的公共方法
 */
public class NullMouseEventHandler extends MouseEventHandler{

	public NullMouseEventHandler() {
		/*
		 * 定义默认的参数""
		 */
		super("");
	}
	
	/*
	 * (non-Javadoc)
	 * @see me.pattern.nullobject.MouseEventHandler#printMouseName()
	 * null object必须重写父类的所有方法！
	 */
	@Override
	public String printMouseName(){
		return "";
	}

}
