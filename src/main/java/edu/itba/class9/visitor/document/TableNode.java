package edu.itba.class9.visitor.document;

import java.util.Collections;
import java.util.List;

public class TableNode implements Node {
	private final List<List<String>> table;

	public TableNode(List<List<String>> table) {
		this.table = table;
	}

	public List<List<String>> getTable() {
		return Collections.unmodifiableList(this.table);
	}
}
