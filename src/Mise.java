import java.util.ArrayList;

public class Mise {
	private Eleve parieur; // Create an ArrayList object
	private Double amount; // Create an ArrayList object
	private Double bet; // Create an ArrayList object
	
	public Mise(Eleve parieur, Double amount, Double bet) {
		super();
		this.parieur = parieur;
		this.amount = amount;
		this.bet = bet;
	}

	public Eleve getParieur() {
		return parieur;
	}

	public Double getAmount() {
		return amount;
	}

	public Integer getBet() {
		return bet;
	}
	
}
