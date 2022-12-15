import java.util.ArrayList;

public class Eleve extends Utilisateur {
	
	protected ArrayList<Mise> listMise;

	public Eleve(String id,String nom){
		super(id,nom);
		this.listMise = new ArrayList<Mise>();
	}

	public void miser(Pari pari, double amount, Integer bet) {
		pari.addMise(this, amount, bet);
		
	}
	public void receivedInvite(Eleve sender, Pari pari) {
		
	}
}
