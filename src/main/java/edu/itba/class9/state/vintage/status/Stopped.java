package edu.itba.class9.state.vintage.status;

import edu.itba.class9.state.vintage.DiscmanContext;

import java.awt.*;

public class Stopped implements Status {
	public static final Stopped STOPPED = new Stopped();

	@Override
	public void playPressed(final DiscmanContext discmanContext) {
		discmanContext.setStatus(Playing.PLAYING);
		discmanContext.setLight(Color.GREEN);
	}

	@Override
	public void stopPressed(final DiscmanContext discmanContext) {
	}

	@Override
	public String toString() {
		return "Stopped";
	}
}
