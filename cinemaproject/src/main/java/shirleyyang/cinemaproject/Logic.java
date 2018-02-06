package shirleyyang.cinemaproject;

import java.util.HashMap;

public class Logic {
	HashMap<Integer, Movie> hmap = new HashMap<Integer, Movie>();
	
	public void addToMap(int id, Movie movie) {
		hmap.put(id, movie);
	}
	
	public Movie getMovie(int id) {
		return hmap.get(id);
	}
	
	
}
