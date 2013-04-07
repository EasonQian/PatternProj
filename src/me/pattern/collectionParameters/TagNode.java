package me.pattern.collectionParameters;

import java.util.Iterator;
import java.util.Vector;

/**
 * 
 * @author eason qian
 * collection parameter是一个对象，把他传入不同的方法中，以便从这些方法中收集需要的信息，经常与composed method一起使用
 * 有时候在重构的时候会需要使用一些辅助方法来帮助实现部分的循环调用
 * 
 * + 把很大的方法转化成更小的、更简单的多个方法，通过这些方法的组合来实现相应的功能
 * + 使结果代码运行地更快
 * 
 * - 如果必须从含有不同数据、并具有不同数据访问接口的类中聚集信息的话，这个模式不适用，
 *   这种情况下更适合使用visitor模式,其基于双分派的思想，能够更容易地从不同的类中聚集到信息
 */
public class TagNode {

	/*
	 * 可以选用private属性作为聚集变量
	 */
	private StringBuffer sb = new StringBuffer();
	private Vector<TagNode> childernNodes;
	
	public TagNode() {
	}
	
	public String toString(){
		appendContentTo(sb);
		return this.sb.toString();
	}
	
	/*
	 * 这个一个composed method的很好的例子
	 * 通过组合其他方法来往buffer这个聚集变量上聚集信息
	 */
	private void appendContentTo(StringBuffer buffer){
		this.writeOpenTagTo(buffer);
		this.writeChildernTo(buffer);
		this.writeEndTagTo(buffer);
	}
	
	private void writeOpenTagTo(StringBuffer sb){
		// ...
	}
	private void writeChildernTo(StringBuffer sb){
		// ...
		Iterator<TagNode> it = childernNodes.iterator();
		while (it.hasNext()) {
			/*
			 * 递归添加子节点
			 */
			it.next().appendContentTo(sb);
		}
	}
	private void writeEndTagTo(StringBuffer sb){
		// ...
	}
	
}
