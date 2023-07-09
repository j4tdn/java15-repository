package bkit.java15.service;

public class ClientService {
	
	private static ClientService INSTANCE = null;
	
	public ClientService() {
		
	}
	
	public synchronized static ClientService getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ClientService();
		} 
		return INSTANCE;
	}
	
	public void printClientStringId() {
		System.out.println("Client 17821xz71");
	}
	
}
