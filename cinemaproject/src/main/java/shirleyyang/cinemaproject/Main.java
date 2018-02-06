package shirleyyang.cinemaproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic l1 = new Logic();
		Movie harryPotter = new Movie("Harry Potter", "adventure", 15);
		Movie minion = new Movie("Minion", "animation", 12);
		Movie JurassicWorld = new Movie("Jurassic World", "Sci-fi", 15);
		l1.addToMap(1, harryPotter);
		l1.addToMap(2, minion);
		l1.addToMap(3, JurassicWorld);
		
		System.out.println(l1.getMovie(1));
		System.out.println(l1.getMovie(2));
		System.out.println(l1.getMovie(3));
	}

}
