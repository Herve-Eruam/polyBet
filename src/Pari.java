import java.util.ArrayList;

public class Pari {
	private Utilisateur creator;
	private double commission;
	private String description;
	private ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	private ArrayList <Mise> listMise = new ArrayList<Mise>(); // Create an ArrayList object
	private boolean openForNewBet; // indique si le parie peut recevoir de nouvelle mise. 
	private Integer Id;
	private static Integer id_counter = 0;
	
	
	public Pari(Utilisateur creator) {
		this.Id = id_counter;
		id_counter ++;
		System.out.println("Un pari a ete cree");
		openForNewBet = false;
		this.creator = creator;
		commission = 10.0;//commisison recup par le createur du pari (en %)
	}
	
	public void miser(Mise mise) {
		listMise.add(mise);
	}
	
	public void finPari(Integer goodBet) {
		System.out.println("Fin du pari envoie des montants aux parrieurs et benefice a l'organisateur");
		double totalAmount = this.getTotalAmout(); //Le montant total parié
		double totalAmountWinner = this.getTotalAmoutFromWinner(goodBet);// Le montant qu'il faut pour rendre a tous les gagnant au minimum ce qu'ils ont misé
		double amountToRedistribute = totalAmount - totalAmountWinner;
		amountToRedistribute = amountToRedistribute - (commission/100 * amountToRedistribute);
		creator.notifEndParie(null, commission/100 * amountToRedistribute);// Donne au createur ca commission
		for(int i = 0; i <this.listMise.size(); i ++) {
			if(this.listMise.get(i).getBet() == goodBet) {
				double parieurMise = this.listMise.get(i).getAmount();
				double gain = parieurMise /(totalAmountWinner) * amountToRedistribute;
				this.listMise.get(i).getParieur().notifEndParie(this, gain);
			}
		}
		this.closePari();
		listMise.clear();
	}
	
	public void openPari() {
		openForNewBet = true;
	}
	
	public void closePari() {
		openForNewBet = false;
	}
	
	public boolean addMise(Parrieur parieur, Double amount, Integer bet) {
		if(this.openForNewBet) {
			listMise.add(new Mise(parieur, this,  amount, bet));
			return true;
		}else {
			return false;
		}
	}
	
	private Double getTotalAmout(){
		Double total = 0.0;
		for(int i = 0; i <this.listMise.size(); i ++) {
			total += this.listMise.get(i).getAmount();
			}
		return total;
	}
	
	
	private Double getTotalAmoutFromWinner(Integer goodBet){
		Double total = 0.0;
		for(int i = 0; i <this.listMise.size(); i ++) {
			if(this.listMise.get(i).getBet() == goodBet) {
				total += this.listMise.get(i).getAmount();
			}
		}
		return total;
	}
	
	public void setDescription(String descrition) {
		this.description = descrition;
	}
	public String getDescription() {
		return description;
	}
	
	public Integer getId() {
		return Id;
	}
	
	
}
