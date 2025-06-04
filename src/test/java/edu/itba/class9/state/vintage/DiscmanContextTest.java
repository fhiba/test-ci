package edu.itba.class9.state.vintage;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DiscmanContextTest {

	@Test
	void testDiscmanIsStoppedWhenCreated() {
		final var discman = new DiscmanContext();
		assertThat(discman.status(), is("Stopped"));
	}

	@Test
	void testDiscmanIsPlayingWhenPlayPressed() {
		final var discman = new DiscmanContext();
		discman.playPressed();
		assertThat(discman.status(), is("Playing"));
		assertThat(discman.getLight(), is(Color.GREEN));
	}

	@Test
	void testDiscmanIsStoppedWhenPlayingAndStopPressed() {
		final var discman = new DiscmanContext();
		discman.playPressed();
		discman.stopPressed();
		assertThat(discman.status(), is("Stopped"));
	}

	@Test
	void testDiscmanIsPausedWhenPlayingAndPlayPressed() {
		final var discman = new DiscmanContext();
		discman.playPressed();
		discman.playPressed();
		assertThat(discman.status(), is("Paused"));
	}
}
