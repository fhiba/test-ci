package edu.itba.class9.state.vintage.status;

import edu.itba.class9.state.vintage.DiscmanContext;

import java.awt.*;

public class Paused implements Status {
	public static Paused PAUSED = new Paused();

	@Override
	public void playPressed(final DiscmanContext discmanContext) {
		discmanContext.setStatus(Playing.PLAYING);
		discmanContext.setLight(Color.GREEN);
	}

	@Override
	public void stopPressed(final DiscmanContext discmanContext) {
		discmanContext.setStatus(Stopped.STOPPED);
		discmanContext.setLight(Color.RED);
	}

	@Override
	public String toString() {
		return "Paused";
	}
}
