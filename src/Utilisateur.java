import java.util.ArrayList;


public abstract class Utilisateur {
	private String id;
	private String nom;
	private double wallet;
	private ArrayList<Pari> listPari;
	private static ArrayList<String> listId = new ArrayList<String>();
	
	private  Utilisateur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.wallet = 0;
		this.listPari = new ArrayList<Pari>();
		listId.add(id);
	}
	
	
	

	
	
}
