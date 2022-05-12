
public class MovieProducer {
	private String movieProducerName;
	private String country;
	public MovieProducer(String movieProducerName, String country) {
		this.movieProducerName = movieProducerName;
		this.country = country;
	}
	public String getMovieProducerName() {
		return movieProducerName;
	}
	public void setMovieProducerName(String movieProducerName) {
		this.movieProducerName = movieProducerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void printMovieProducer() {
		System.out.println(this.movieProducerName);
	}
	public void printCountry() {
		System.out.println(this.country);
	}
	
		
	
	

}
