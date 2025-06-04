package edu.itba.class9.visitor.document;

public class TextNode implements Node {
	private final StringBuilder text;

	public TextNode(String text) {
		this.text = new StringBuilder(text);
	}

	public void append(String t) {
		this.text.append(t);
	}

	public String getText() {
		return this.text.toString();
	}
}
