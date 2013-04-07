package me.pattern.extractComposite;

/**
 * 
 * @author eason qian
 *
 */
/*
 * 使所有的含有子节点的类都继承新建的CompositeTag类
 */
public class LinkTag extends CompositeTag{

	public LinkTag(int tagBegin, int tagEnd, String tagContents, String tagLine) {
		super(tagBegin, tagEnd, tagContents, tagLine);
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see me.pattern.extractComposite.CompositeTag#toHTML()
	 * 重写父类的template method
	 */
	public String toHTML(){
		// ...
		return null;
	}
}
