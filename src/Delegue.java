import java.util.ArrayList;

public class Delegue extends Eleve {
	//attributes
		protected ArrayList<Pari> listPari;
	//constructor
	public Delegue(String id, String nom) {
		super(id, nom);
		listPari = new ArrayList<Pari>();
	}
	
	//CreerPari() : crée un pari
	public int CreerPari(String desc) {
		Pari newPari = new Pari(this);
		this.listPari.add(newPari);//on ajoute le pari a la liste de ceux crees par le delegue
		newPari.setDescription(desc);
		newPari.openPari();
		return newPari.getId();
	}
	
	//removePari(): supprime le pari de la liste des paris du delegue
	public void removePari(Integer id) {
		Pari pari = this.getPari(id);
		if(pari != null) {
			this.listPari.remove(pari);
		}
	}
	

	//printListPari() : affiche la liste des paris
	public void printListPari() {
		for(int i = 0; i < this.listPari.size(); i++) {
			System.out.println(this.listPari.get(i).getId() + ": " +this.listPari.get(i).getDescription());
		}
	}
	
	// getPari() : renvoie le pari dont l'id est passé en parmaetre 
	public Pari getPari(Integer Id) {
		for(int i = 0; i < this.listPari.size(); i++) {
			if(this.listPari.get(i).getId() == Id) {
				return this.listPari.get(i);
			}
		}
		return null;
	}
	
	
	
	public void receivedInvite(Eleve sender, Pari pari) {
		//...
	};
	


	
}
