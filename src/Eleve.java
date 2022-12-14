import java.util.ArrayList;

public class Eleve extends Utilisateur implements Parrieur {
	//attributes
	protected ArrayList<Mise> listMise;
	
	//constructor
	public Eleve(String id,String nom){
		super(id,nom);
		this.listMise = new ArrayList<Mise>();
	}
	
	
	//Miser() : miser dans la liste des paris
	public void miser(Pari pari, double amount, Integer bet) {
		pari.addMise(this, amount, bet);
	}
	
	//receivedInvite() : quand l'Eleve recoit une invitation dans un pari
	public void receivedInvite(Eleve sender, Pari pari) {
		
	}
	
	//notifEndParie() : 
		public void notifEndParie(Pari pari, Double gain) {
			System.out.println(nom + " gagne " + gain);

			wallet += gain;
		}
		
	
	
	
}
