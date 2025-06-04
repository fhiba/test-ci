package edu.itba.class9.visitor.document.main;

import edu.itba.class9.visitor.document.Document;
import edu.itba.class9.visitor.document.ImageNode;
import edu.itba.class9.visitor.document.TableNode;
import edu.itba.class9.visitor.document.TextNode;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		final var document = new Document();
		final var text = new TextNode("Some text from text node");
		final var text2 = new TextNode("I'm another text node");
		final var image = new ImageNode(Paths.get("dogImage.jpeg"), "Cute dog image caption");
		final var table = new TableNode(crateTable());
		document.addNode(text);
		document.addNode(text2);
		document.addNode(image);
		document.addNode(table);

		document.printNodeTextContent();
	}

	private static List<List<String>> crateTable() {
		final List<List<String>> table = new LinkedList<>();
		final var row = Arrays.asList("Name", "Address", "Phone");
		table.add(row);
		final var row2 = Arrays.asList("John", "Doe", "321-276-8535");
		table.add(row2);
		final var row3 = Arrays.asList("Peter", "Coe", "342-3421-4421");
		table.add(row3);
		return table;
	}
}
