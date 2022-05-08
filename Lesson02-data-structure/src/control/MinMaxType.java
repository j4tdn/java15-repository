package control;

public class MinMaxType {
   public int min;
   public int max;
   
   public MinMaxType(int min , int max) {
	   this.min = min;
	   this.max = max;
   }
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return min + "is min " + max + " is max ";
	}
}
