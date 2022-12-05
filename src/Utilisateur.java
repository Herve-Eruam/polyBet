import java.util.ArrayList;


public abstract class Utilisateur implements Parrieur {
	private String id;
	private String nom;
	private double wallet;
	private static ArrayList<String> listId = new ArrayList<String>();
	
	public  Utilisateur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.wallet = 0;
		listId.add(id);
	}
	
	protected void chatter() {
		System.out.println("Chatter");
	}
	
	public void notifEndParie(Pari pari, Double gain) {
		wallet += gain;
	}
	
	public double getWallet() {
		return wallet;
	}
	
	public void cashOut(String accountNo) {
		System.out.println("Virrement effectué sur le compte N°" + accountNo);
	}


	
	
}
