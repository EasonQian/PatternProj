package me.pattern.extractComposite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author eason qian
 *
 */
public abstract class CompositeTag extends Tag{
	
	/*
	 * 上移子类的共同属性
	 */
	//private Vector<Tag> nodeVector;
	private Vector<Tag> childern;
	
	public CompositeTag(int tagBegin, int tagEnd, String tagContents, String tagLine) {
		super(tagBegin, tagEnd, tagContents, tagLine);
	}

	/*
	 * 编写访问CompositeTag子节点的统一方法，使linktag和formtag都实现这个方法，并把他上移到compositetag中
	 */
	public Enumeration<Tag> childern(){
		return this.childern.elements();
	}
	
	/*
	 * 将原本在linktag和formtag中同时出现的详细的代码上移到超类中实现
	 */
	public String toPlainText(){
		StringBuffer sb = new StringBuffer();
		CompositeTag tag;
		for (Enumeration<Tag> e = this.childern(); e.hasMoreElements();) {
			tag = (CompositeTag)e.nextElement();
			sb.append(tag.toPlainText());
		}
		return sb.toString();
	}
	
	/*
	 * 对于部分相同的子类代码，需要在父类中构造相似部分的泛化函数，然后通过在子类中重新组合或者重写这些函数来实现上移的目的
	 * template method
	 */
	public String toHTML(){
		StringBuffer sb = new StringBuffer();
		this.putStartTagInfo(sb);
		this.putChildernTagInfo(sb);
		this.putEndTagInfo(sb);
		return sb.toString();
	}
	
	public void putStartTagInfo(StringBuffer sb){
		// ...
	}
	public void putChildernTagInfo(StringBuffer sb){
		// ...
	}
	public void putEndTagInfo(StringBuffer sb){
		// ...
	}
	
}
