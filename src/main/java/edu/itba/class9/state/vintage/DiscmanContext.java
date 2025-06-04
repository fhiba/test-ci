package edu.itba.class9.state.vintage;

import edu.itba.class9.state.vintage.status.Status;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

import static edu.itba.class9.state.vintage.status.Stopped.STOPPED;

@Setter
public class DiscmanContext {

	private Status status = STOPPED;

	@Getter
	private Color light = Color.RED;

	public String status() {
		return this.status.toString();
	}

	public void playPressed() {
		this.status.playPressed(this);
	}

	public void stopPressed() {
		this.status.stopPressed(this);
	}
}
