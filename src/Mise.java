import java.util.ArrayList;

public class Mise {
	private Parrieur parieur; // Create an ArrayList object
	private Pari parie;
	private Double amount; // Create an ArrayList object
	private Integer bet; // Create an ArrayList object
	
	public Mise(Parrieur parieur,Pari parie, Double amount, Integer bet) {
		super();
		this.parieur = parieur;
		this.amount = amount;
		this.bet = bet;
	}

	public Parrieur getParieur() {
		return parieur;
	}

	public Double getAmount() {
		return amount;
	}

	public Integer getBet() {
		return bet;
	}
	
	public Pari getPari() {
		return parie;
	}
	
}
