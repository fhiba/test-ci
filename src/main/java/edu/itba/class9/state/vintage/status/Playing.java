package edu.itba.class9.state.vintage.status;

import edu.itba.class9.state.vintage.DiscmanContext;

import java.awt.*;

public class Playing implements Status {
	static Playing PLAYING = new Playing();

	@Override
	public void playPressed(final DiscmanContext discmanContext) {
		discmanContext.setStatus(Paused.PAUSED);
		discmanContext.setLight(Color.YELLOW);
	}

	@Override
	public void stopPressed(final DiscmanContext discmanContext) {
		discmanContext.setStatus(Stopped.STOPPED);
		discmanContext.setLight(Color.RED);
	}

	@Override
	public String toString() {
		return "Playing";
	}
}
