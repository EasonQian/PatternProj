package me.pattern.extractComposite;

public class FormTag extends CompositeTag{

	public FormTag(int tagBegin, int tagEnd, String tagContents, String tagLine) {
		super(tagBegin, tagEnd, tagContents, tagLine);
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see me.pattern.extractComposite.CompositeTag#toHTML()
	 * ÖØÐ´¸¸ÀàµÄtemplate method
	 */
	public String toHTML(){
		// ...
		return null;
	}
}
