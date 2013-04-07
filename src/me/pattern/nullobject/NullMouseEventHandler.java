package me.pattern.nullobject;

/**
 * 
 * @author eason qian
 * ��null�߼��滻Ϊһ��nullobject���ṩ��ȷ��Ĭ����Ϊ����֤�ֶκͱ����ĵ�����Զ�ǰ�ȫ��
 * nullobjectʵ�ָ�������з��������ṩĬ�ϵĻ��޺�����Ϊ
 * 
 * + ����Ҫ�ظ���null�߼����Ϳ��Ա���null����
 * - ʹά��������ѣ�ӵ�г����nullobject������д���м̳е��Ĺ�������
 */
public class NullMouseEventHandler extends MouseEventHandler{

	public NullMouseEventHandler() {
		/*
		 * ����Ĭ�ϵĲ���""
		 */
		super("");
	}
	
	/*
	 * (non-Javadoc)
	 * @see me.pattern.nullobject.MouseEventHandler#printMouseName()
	 * null object������д��������з�����
	 */
	@Override
	public String printMouseName(){
		return "";
	}

}
