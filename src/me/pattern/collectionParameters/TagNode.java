package me.pattern.collectionParameters;

import java.util.Iterator;
import java.util.Vector;

/**
 * 
 * @author eason qian
 * collection parameter��һ�����󣬰������벻ͬ�ķ����У��Ա����Щ�������ռ���Ҫ����Ϣ��������composed methodһ��ʹ��
 * ��ʱ�����ع���ʱ�����Ҫʹ��һЩ��������������ʵ�ֲ��ֵ�ѭ������
 * 
 * + �Ѻܴ�ķ���ת���ɸ�С�ġ����򵥵Ķ��������ͨ����Щ�����������ʵ����Ӧ�Ĺ���
 * + ʹ����������еظ���
 * 
 * - �������Ӻ��в�ͬ���ݡ������в�ͬ���ݷ��ʽӿڵ����оۼ���Ϣ�Ļ������ģʽ�����ã�
 *   ��������¸��ʺ�ʹ��visitorģʽ,�����˫���ɵ�˼�룬�ܹ������׵شӲ�ͬ�����оۼ�����Ϣ
 */
public class TagNode {

	/*
	 * ����ѡ��private������Ϊ�ۼ�����
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
	 * ���һ��composed method�ĺܺõ�����
	 * ͨ�����������������buffer����ۼ������Ͼۼ���Ϣ
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
			 * �ݹ�����ӽڵ�
			 */
			it.next().appendContentTo(sb);
		}
	}
	private void writeEndTagTo(StringBuffer sb){
		// ...
	}
	
}
