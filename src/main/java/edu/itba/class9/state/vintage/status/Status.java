package edu.itba.class9.state.vintage.status;

import edu.itba.class9.state.vintage.DiscmanContext;

public interface Status {
	void playPressed(DiscmanContext discmanContext);
	void stopPressed(DiscmanContext discmanContext);
}
