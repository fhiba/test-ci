package edu.itba.class9.visitor.document;

import java.util.LinkedList;
import java.util.List;

public class Document {
	public List<Node> nodes;

	public Document() {
		this.nodes = new LinkedList<>();
	}

	public void addNode(Node node) {
		this.nodes.add(node);
	}

	public void printNodeTextContent() {
		for (final Node node : this.nodes) {
			if (node instanceof TextNode) {
				System.out.println(((TextNode) node).getText());
			} else if (node instanceof ImageNode) {
				System.out.println(((ImageNode) node).getCaption());
			} else if (node instanceof TableNode tableNode) {
				for (final List<String> row : tableNode.getTable()) {
					for (final String cell : row) {
						System.out.print(cell + "\t\t");
					}
					System.out.println();
				}
			}
		}
	}
}
