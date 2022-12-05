import java.util.ArrayList;

public class Eleve extends Utilisateur {
	
	protected ArrayList<Mise> listMise;

	public Eleve(String id,String nom){
		super(id,nom);s
		this.listMise = new ArrayList<Mise>();
	}

	public void miser(Pari pari, double amount, Integer bet) {
		Mise mise = new Mise(this, pari, amount, bet);
		pari.miser(mise);
		
	}
	public void receivedInvite(Eleve sender, Pari pari) {
		
	}
}
