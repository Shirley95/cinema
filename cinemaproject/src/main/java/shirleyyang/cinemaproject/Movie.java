package shirleyyang.cinemaproject;

public class Movie {
	private String title;
	private String genre;
	private int ageRating;
	
	public Movie(String title, String genre, int ageRating) {
		super();
		this.title = title;
		this.genre = genre;
		this.ageRating = ageRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	@Override
	public String toString() {
		return "Movie [title = " + title + ", genre = " + genre + ", ageRating = " + ageRating + "]";
	}
	
	
}
