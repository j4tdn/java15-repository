package bkit.java15.service;

public class ClientService {
	private static  ClientService INSTANCE = null;
	
	public ClientService() {
		// TODO Auto-generated constructor stub
	}
	public synchronized static ClientService getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ClientService();
		}
		return INSTANCE;
	}
	
	public void printClientStringId() {
		System.out.println("sdfg");
	}
}
