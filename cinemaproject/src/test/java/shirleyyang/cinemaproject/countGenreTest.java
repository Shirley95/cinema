package shirleyyang.cinemaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class countGenreTest {

	Logic l1 = new Logic();
	
	@Before
	public void setUp() {
		Movie harryPotter = new Movie("Harry Potter", "adventure", 15);
		Movie minion = new Movie("Minion", "animation", 12);
		Movie JurassicWorld = new Movie("Jurassic World", "Sci-fi", 15);
		l1.addToMap(1, harryPotter);
		l1.addToMap(2, minion);
		l1.addToMap(3, JurassicWorld);
	}
	
	@Test
	public void evaluateGenreCont() {		
		assertEquals(1, l1.countGenre("adventure"));
		assertEquals(1, l1.countGenre("animation"));
		assertEquals(1, l1.countGenre("Sci-fi"));
		assertEquals(0, l1.countGenre("horror"));
	}

}
