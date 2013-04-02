package me.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author eason qian
 *
 * ͨ��composite�ع�������ʽ���Ĵ����߼�
 * ���ڣ��ÿͻ���ͨ��api�������������Ҫ�����δ����߼���˼�룬��װ������ڲ�ϸ��
 * 
 * 
 * + �����ظ����룬��װ�ظ���ָ����ʽ������Ӻ�ɾ���ڵ�
 * + �ṩ�˴��������߼�������һ���Է���
 * + �򻯸�������Ĺ���ָ�𣬷�װ����ϸ��
 * - ��������߼����������ӣ������Ӳ���Ҫ�Ĵ���
 */
public class TagNode {
	private String name = "";
	private String value = "";
	private StringBuffer attributes;
	
	// Ϊ�������νṹ����ӵ��ӽڵ�����
	private List<TagNode> childern;
	
	public TagNode(String name) {
		this.name = name;
		this.attributes = new StringBuffer("");
	}

	// ��װ��ӽڵ����Ե��߼������ⲿ����
	public void addAttribute(String attribute, String value){
		attributes.append(" ");
		attributes.append(attribute);
		attributes.append("='");
		attributes.append(value);
		attributes.append("'");
	}
	
	public void addValue(String value) {
		this.value = value;
	}

	public void addChild(TagNode child){
		this.childern().add(child);
	}
	
	public String toString(){
		String result;
		result = "<" + name + attributes + ">";
		Iterator<TagNode> iterator = this.childern().iterator();
		/*
		 * ���õ�����װ����Ҷ�ӽڵ�Ĺ����߼�
		 */
		while (iterator.hasNext()) {
			TagNode node = iterator.next();
			result += node.toString();
		}
		result += value;
		result += "</" + name + ">";
		return result;
	}
	
	
	
	
	private List<TagNode> childern(){
		if (childern == null) {
			childern = new ArrayList<TagNode>();
		}
		return childern;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public StringBuffer getAttributes() {
		return attributes;
	}

	public void setAttributes(StringBuffer attributes) {
		this.attributes = attributes;
	}
	
	

}
