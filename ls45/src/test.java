
public class test {
	public static void main(String[] args) {
		Producer producer1 = new Producer("Toyota", "Japan");
		Producer producer2 = new Producer("Ford", "USA");
		Producer producer3 = new Producer("Vinfast", "Việt Nam");
	
				
		Plane t1 = new Plane(producer3,"A95");
		Stransportation t2 = new Bike(producer2);
		Stransportation t3 = new Car(producer2, "A92");
			
		System.out.println("Producer Name: "+t1.takeProducer());
		t1.Start();
		t1.fly();
		t1.land();
		t2.stop();
		
		System.out.println("Speed: "+t1.speed());
		System.out.println("Speed ô tô: "+t2.speed());
		System.out.println("Speed xe độp: "+t3.speed());
		
	
	}

}
