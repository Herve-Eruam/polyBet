import java.util.ArrayList;

public class Mise {
	//attributes
	private Parrieur parieur;
	private Pari parie;
	private Double amount; 
	private Integer bet; 
	
	//constructor
	public Mise(Parrieur parieur,Pari parie, Double amount, Integer bet) {
		this.parieur = parieur;
		this.amount = amount;
		this.bet = bet;
	}
	
	//getParieur() : Retourne les infos de celui qui fait la mise
	public Parrieur getParieur() {
		return parieur;
	}
	
	//getAmount() : Affiche le montant parié
	public Double getAmount() {
		return amount;
	}
	
	// getBet() : Affiche la valeur pariée (ce sur quoi on parie)
	public Integer getBet() {
		return bet;
	}
	
	//getPari(): Affiche les infos du pari
	public Pari getPari() {
		return parie;
	}
	
}
