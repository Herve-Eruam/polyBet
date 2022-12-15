import java.util.ArrayList;


public abstract class Utilisateur implements Parrieur {
	//attributes
	private String id;
	private String nom;
	private double wallet;
	private static ArrayList<String> listId = new ArrayList<String>();
	
	//constructor
	public  Utilisateur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.wallet = 0;
		listId.add(id);
	}
	
	//chatter() : chat
	protected void chatter() {
		System.out.println("Chatter");
	}
	
	//notifEndParie() : 
	public void notifEndParie(Pari pari, Double gain) {
		wallet += gain;
	}
	
	//getWallet() : montre le montant de l'utilisateur
	public double getWallet() {
		return wallet;
	}
	
	//cashout(): permet de récupérer les gains
	public void cashOut(String accountNo) {
		System.out.println("Virrement effectué sur le compte N°" + accountNo);
	}


	
	
}
