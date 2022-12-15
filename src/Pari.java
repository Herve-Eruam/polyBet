import java.util.ArrayList;

public class Pari {
	//attributes
	private Utilisateur creator;
	private double commission;
	private String description;
	private ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	private ArrayList <Mise> listMise = new ArrayList<Mise>(); // Create an ArrayList object
	private boolean openForNewBet; // indique si le parie peut recevoir de nouvelle mise. 
	private Integer Id;
	private static Integer id_counter = 0;
	
	//constructor
	public Pari(Utilisateur creator) {
		this.Id = id_counter;
		id_counter ++;
		System.out.println("Un pari a ete cree");
		openForNewBet = false;
		this.creator = creator;
		commission = 10.0;//commisison recup par le createur du pari (en %)
	}

	
	//findPari() : close the bet + redistribute earns => to winner,au commissionnaire et 
	public void finPari(Integer goodBet) {
		System.out.println("Fin du pari envoie des montants aux parrieurs et benefice a l'organisateur");
		
		double totalAmount = this.getTotalAmout(); //Le montant total parié
		double totalAmountWinner = this.getTotalAmoutFromWinner(goodBet);// Le montant qu'il faut pour rendre a tous les gagnant au minimum ce qu'ils ont misé
		double amountToRedistribute = totalAmount - totalAmountWinner;
		creator.notifEndParie(null, (commission/100) * amountToRedistribute);// Donne au createur ca commission
		amountToRedistribute = amountToRedistribute - (commission/100 * amountToRedistribute);
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
	
	//openPari() : open Bet
	public void openPari() {
		openForNewBet = true;
	}
	
	//closePari() : close Bet
	public void closePari() {
		openForNewBet = false;
	}
	
	public boolean getPariOpenForNewBetState() {
		return openForNewBet;
	}
  
	//addMise(): Ajoute une mise dans le pari
	public boolean addMise(Parrieur parieur, Double amount, Integer bet) {
		if(this.openForNewBet) {
			listMise.add(new Mise(parieur, this,  amount, bet));
			return true;
		}else {
			return false;
		}
	}
	
	public Integer getNbMise() {
		return this.listMise.size();
	}

	//getTotalAmout() : Returns the sum collected by the bet
	private Double getTotalAmout(){
		Double total = 0.0;
		for(int i = 0; i <this.listMise.size(); i ++) {
			total += this.listMise.get(i).getAmount();
			}
		return total;
	}

	//getTotalAmoutFromWinner() : having the amount of the winner or the one who has the good bet
	private Double getTotalAmoutFromWinner(Integer goodBet){
		Double total = 0.0;
		for(int i = 0; i <this.listMise.size(); i ++) {
			if(this.listMise.get(i).getBet() == goodBet) 
				total += this.listMise.get(i).getAmount();
		}
		
		return total;
	}
	
	//setDescription() : write a description on the Bet
	public void setDescription(String descrition) {
		this.description = descrition;
	}
	

	//getDescription() : read the description of a Bet
	public String getDescription() {
		return description;
	}
	
	//getId() : return ID
	public Integer getId() {
		return Id;
	}
	
	public Double getComission() {
		return commission;
	}
	public static Integer getIdCounter() {
		return id_counter;
	}
	
}
