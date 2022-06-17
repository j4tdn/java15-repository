package view;

public class client {
	private int id;
	private String name ;
	private int numberphone;
	private String client;
	
	
	
	
	
	public client(int id, String name, int numberphone, String client) {
		super();
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
		this.client = client;
	}


	

	@Override
	public String toString() {
		return "client [id=" + id + ", name=" + name + ", numberphone=" + numberphone + ", client=" + client + "]";
	}




	public client() {
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberphone() {
		return numberphone;
	}



	public void setNumberphone(int numberphone) {
		this.numberphone = numberphone;
	}



	public String getClient() {
		return client;
	}



	public void setClient(String client) {
		this.client = client;
	}
	

}
