
public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(15, 7, 2022);
		Date date2 = new Date(30, 6, 2023);
		Date date3 = new Date(24, 10, 2022);
		MovieProducer movieProducer1 = new MovieProducer("MARVEL", "America");
		MovieProducer movieProducer2 =new MovieProducer("Phương Nam", "Việt Nam");
		MovieProducer movieProducer3 = new MovieProducer("HOllyWOOD", "Englang");
		Movie movie1 =new Movie("Captain America", 1999, movieProducer1, 25.5, date1);
		Movie movie2 = new Movie("Siêu Nhân Gao", 1998, movieProducer2, 19.3, date2);
		Movie movie3 = new Movie("Avater", 2018, movieProducer3, 37.3, date3);	
		
		
		System.out.println("Movie 1 and Movie 2: "+movie1.TestTicketPrice(movie2));
		System.out.println("Movie 1 and Movie 3: "+movie1.TestTicketPrice(movie3));
		System.out.println("Movie 2 and Movie 3: "+movie1.TestTicketPrice(movie3));
		
		movieProducer1.printMovieProducer();
		movieProducer2.printMovieProducer();
		movieProducer3.printMovieProducer();
		
		
		System.out.println("After Discout Movie 1: "+movie1.discout(12));
		System.out.println("Affter Discout Movie 2: "+movie2.discout(7));
		System.out.println("After Discout Movie 3: "+movie3.discout(19));
		
		
		movieProducer1.printCountry();
		movieProducer2.printCountry();
		movieProducer3.printCountry();
		
	}

	

}
