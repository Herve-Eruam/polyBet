import java.util.ArrayList;

public class Pari {
	private String description;
	private ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	private ArrayList <Mise> listMise = new ArrayList<Mise>(); // Create an ArrayList object
	private boolean openForNewBet; // indique si le parie peut recevoir de nouvelle mise. 
	
	public Pari() {
		System.out.println("Un pari a ete cree");
		openForNewBet = false;
	}
	
	public void finPari() {
		System.out.println("Fin du pari");
	}
	
	public boolean addMise(Eleve parieur, Double amount, Double bet) {
		if(this.openForNewBet) {
			listMise.add(new Mise(parieur, amount, bet));
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
