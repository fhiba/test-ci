package edu.itba.class9.visitor.document;

import java.nio.file.Path;

public class ImageNode implements Node {
	private final Path imageFile;
	private final String imageCaption;

	public ImageNode(Path imageFile, String imageCaption) {
		this.imageFile = imageFile;
		this.imageCaption = imageCaption;
	}

	public String getCaption() {
		return this.imageCaption;
	}

	public Path getImagePath() {
		return this.imageFile;
	}
}
