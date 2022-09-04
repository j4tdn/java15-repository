package Ex02;

import java.util.List;

public class CdManage {
	public static void main(String[] args) {
		List<Cd> cds = ModelData.getModelData();
		
		System.out.println(utils.totalPrice(cds));
		
		utils.Des(cds);
		System.out.println(utils.getAmount(cds));
		
		System.out.println(cds);
	
	}
	
	
	
}
