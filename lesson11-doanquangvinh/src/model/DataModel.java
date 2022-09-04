package model;

import java.util.ArrayList;

import bean.CDDetail;

public class DataModel {
   public static ArrayList<CDDetail> getCD(){
	   ArrayList<CDDetail> model = new ArrayList<>();
	   model.add(new CDDetail(1, "CD1", "Vinh Andrew", 999, 1999.999f));
	   model.add(new CDDetail(2, "CD2", "Booker", 3, 190.2f));
	   model.add(new CDDetail(3, "CD3", "LadyGaGa", 10, 100.0f));
	   model.add(new CDDetail(4, "CD4", "Chris Paul", 4, 50.05f));
	   model.add(new CDDetail(5, "CD5", "Chris Brown", 1, 2000.05f));
	   return model;
   }
}
