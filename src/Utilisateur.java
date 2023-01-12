import java.util.ArrayList;


public abstract class Utilisateur  {
	//attributes
	protected String id;
	protected String nom;
	protected double wallet;
	private static ArrayList<String> listId = new ArrayList<String>();
	
	//constructor
	public  Utilisateur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.wallet = 0;
		listId.add(id);
	}
	
	public String getName() {
		return nom;
	}
	
	//getWallet() : montre le montant de l'utilisateur
	public double getWallet() {
		return wallet;
	}
	
	//cashout(): permet de récupérer les gains
	public void cashOut(String accountNo) {
		//realiser le transfert (non implementé)
		this.wallet = 0;
		System.out.println("Virrement effectué sur le compte N°" + accountNo);
		
	}


	
	
}
