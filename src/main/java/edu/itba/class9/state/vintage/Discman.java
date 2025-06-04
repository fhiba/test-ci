package edu.itba.class9.state.vintage;

public class Discman {

	private final DiscmanContext context = new DiscmanContext();

	public void play() {
		this.context.playPressed();
	}

	public void stop() {
		this.context.stopPressed();
	}

	public String status() {
		return this.context.status();
	}

}
