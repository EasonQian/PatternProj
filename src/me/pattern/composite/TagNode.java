package me.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author eason qian
 *
 * 通过composite重构包含隐式树的代码逻辑
 * 基于：让客户端通过api调用来组合所需要的树形代码逻辑的思想，封装构造的内部细节
 * 
 * 
 * + 减少重复代码，封装重复的指令，如格式化、添加和删除节点
 * + 提供了处理相似逻辑增长的一般性方法
 * + 简化各户代码的构造指责，封装构造细节
 * - 如果代码逻辑本身并不复杂，会增加不必要的代码
 */
public class TagNode {
	private String name = "";
	private String value = "";
	private StringBuffer attributes;
	
	// 为构造树形结构而添加的子节点属性
	private List<TagNode> childern;
	
	public TagNode(String name) {
		this.name = name;
		this.attributes = new StringBuffer("");
	}

	// 封装添加节点属性的逻辑，供外部调用
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
		 * 利用迭代封装类似叶子节点的构造逻辑
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
