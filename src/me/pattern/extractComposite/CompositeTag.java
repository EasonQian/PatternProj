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
	 * ��������Ĺ�ͬ����
	 */
	//private Vector<Tag> nodeVector;
	private Vector<Tag> childern;
	
	public CompositeTag(int tagBegin, int tagEnd, String tagContents, String tagLine) {
		super(tagBegin, tagEnd, tagContents, tagLine);
	}

	/*
	 * ��д����CompositeTag�ӽڵ��ͳһ������ʹlinktag��formtag��ʵ��������������������Ƶ�compositetag��
	 */
	public Enumeration<Tag> childern(){
		return this.childern.elements();
	}
	
	/*
	 * ��ԭ����linktag��formtag��ͬʱ���ֵ���ϸ�Ĵ������Ƶ�������ʵ��
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
	 * ���ڲ�����ͬ��������룬��Ҫ�ڸ����й������Ʋ��ֵķ���������Ȼ��ͨ����������������ϻ�����д��Щ������ʵ�����Ƶ�Ŀ��
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
