package shirleyyang.cinemaproject;

import java.util.HashMap;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Logic {
	HashMap<Integer, Movie> hmap = new HashMap<Integer, Movie>();
	ObjectMapper objectMapper = new ObjectMapper();
	
	public void addToMap(int id, Movie movie) {
		hmap.put(id, movie);
	}
	
	public Movie getMovie(int id) {
		return hmap.get(id);
	}
	
	public String getMoviesAsJSON() {
		try {
			return objectMapper.writeValueAsString(hmap);
		} catch (JsonProcessingException e) {
			return "null";
		}
	}
	
	public String getIndividualMovieAsJSON(int id) {
		try {
			return objectMapper.writeValueAsString(getMovie(id));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "null";
		}
	}
	
	public int countGenre(String genre) {
		int counter = 0;
		for (Movie m : hmap.values()) {
			if (m.getGenre().equals(genre)) {
				counter++;
			}				
		}
		return counter;
	}

	
	
	
}

