package Ex02;

import java.util.ArrayList;
import java.util.List;

public class ModelData {
	private ModelData() {
		
	}
	
	public static List<Cd> getModelData(){
		List<Cd> cds = new ArrayList<>();
		cds.add(new Cd(10, "classic", "Hawwaii", 8, 19.3d));
		cds.add(new Cd(13, "Pob", "Micheal Jackson", 15, 30.2d));
		cds.add(new Cd(19, "R&B", "Justatee", 19, 22.6d));
		cds.add(new Cd(11, "Rock", "The Wall band", 10, 11.8d));
		cds.add(new Cd(22, "Opera", "Christan", 6, 41.1d));
		cds.add(new Cd(15, "country", "Taylor Swift", 24, 29.8));
		cds.add(new Cd(20, "K-pop", "Black Pink", 11, 50.1d));
		
		return cds;
	}
}
