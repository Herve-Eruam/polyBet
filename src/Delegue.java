import java.util.ArrayList;

public class Delegue extends Utilisateur {

	protected ArrayList<Pari> listPari;

	public Delegue(String id, String nom) {
		super(id, nom);
	}
	
	public void CreerPari(String desc) {
		Pari newPari = new Pari(this);
		this.listPari.add(newPari);
		newPari.setDescription(desc);
		newPari.openPari();
	}
	
	public void printListPari() {
		for(int i = 0; i < this.listPari.size(); i++) {
			System.out.println(this.listPari.get(i).getId() + ": " +this.listPari.get(i).getDescription());
		}
	}
	
	public void closePari(Integer id){
		Pari pari = getPari(id);
		if(pari != null) {
			pari.closePari();
		}
	}
	
	public void endPari(Integer pariId, Integer result) {
		Pari pari = getPari(pariId);
		if(pari != null) {
			pari.finPari(result);
		}
	}
	
	private Pari getPari(Integer Id) {
		for(int i = 0; i < this.listPari.size(); i++) {
			if(this.listPari.get(i).getId() == Id) {
				return this.listPari.get(i);
			}
		}
		return null;
	}
	
	
	
	public void receivedInvite(Eleve sender, Pari pari) {
		//Ne peux pas accepter une invitation
	};
	


	
}
