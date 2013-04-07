package me.pattern.extractInterface;

public abstract class AbstractNode {

	public AbstractNode() {
	}
	
	public void accept(String text){
		// 将子类含有而超类没有的函数统一到父类中，执行默认的空行为
	}
}
