package me.pattern.extractComposite;

/**
 * 
 * @author eason qian
 *
 */
/*
 * ʹ���еĺ����ӽڵ���඼�̳��½���CompositeTag��
 */
public class LinkTag extends CompositeTag{

	public LinkTag(int tagBegin, int tagEnd, String tagContents, String tagLine) {
		super(tagBegin, tagEnd, tagContents, tagLine);
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see me.pattern.extractComposite.CompositeTag#toHTML()
	 * ��д�����template method
	 */
	public String toHTML(){
		// ...
		return null;
	}
}
