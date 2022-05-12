
public abstract class Stransportation {
	protected String stransportationName;
	protected Producer producer;
	
	public Stransportation(String stransportationName, Producer producer) {
		this.stransportationName = stransportationName;
		this.producer = producer;
	}


	public String getStransportationName() {
		return stransportationName;
	}

	public void setStransportationName(String stransportationName) {
		this.stransportationName = stransportationName;
	}


	public Producer getProducer() {
		return producer;
	}


	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	public String takeProducer() {
		return this.producer.getProducerName();
	}
	public void Start() {
		System.out.println("r� r�");
	}
	public void move() {
		System.out.println("�n eng");
		
	}
	public void stop() {
		System.out.println("r� r�");
	}
	public abstract double speed();
	
	
}
