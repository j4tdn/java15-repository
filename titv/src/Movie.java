
public class Movie {
	private String movieName;
	private int producYear;
	private MovieProducer movieProducer;
	private double ticketPrice;
	private Date releaseDate;
	public Movie(String movieName, int producYear, MovieProducer movieProducer, double ticketPrice, Date releaseDate ) {
		this.movieName = movieName;
		this.producYear = producYear;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.releaseDate = releaseDate;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getProducYear() {
		return producYear;
	}
	public void setProducYear(int producYear) {
		this.producYear = producYear;
	}
	public MovieProducer getMovieProducer() {
		return movieProducer;
	}
	public void setMovieProducer(MovieProducer movieProducer) {
		this.movieProducer = movieProducer;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean TestTicketPrice(Movie otherMovie) {
		return this.ticketPrice > otherMovie.ticketPrice;
	}
	public double discout(double x) {
		return this.ticketPrice*(1-x/100);
	}
	
}
