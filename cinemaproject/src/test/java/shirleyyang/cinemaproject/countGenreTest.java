package shirleyyang.cinemaproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class countGenreTest {

	@Test
	public void evaluateGenreCont() {
		Logic l1 = new Logic();
		assertEquals(1, countGenre());
	}

}
