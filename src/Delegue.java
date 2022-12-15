import java.util.ArrayList;

public class Delegue extends Eleve {
	//attributes
	protected ArrayList<Pari> listPari;
	
	//constructor
	public Delegue(String id, String nom) {
		super(id, nom);
	}
	
	//CreerPari() : crée un pari
	public void CreerPari(String desc) {
		Pari newPari = new Pari(this);
		this.listPari.add(newPari);
		newPari.setDescription(desc);
		newPari.openPari();
	}
	
	//printListPari() : affiche la liste des paris
	public void printListPari() {
		for(int i = 0; i < this.listPari.size(); i++) {
			System.out.println(this.listPari.get(i).getId() + ": " +this.listPari.get(i).getDescription());
		}
	}
	
	//closePari() : ferme un pari -- method exclusive 
	public void closePari(Integer id){
		Pari pari = getPari(id);
		if(pari != null) {
			pari.closePari();
		}
	}
	
	// endPari() : termine le pari  --- method exclusive
	public void endPari(Integer pariId, Integer result) {
		Pari pari = getPari(pariId);
		if(pari != null) {
			pari.finPari(result);
		}
	}
	
	// getPari() : affiche un pari specific a partir de son ID 
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
