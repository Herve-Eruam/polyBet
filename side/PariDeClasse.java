import java.util.ArrayList;

public class PariDeClasse extends Pari{
	//attributes
	String description;
	ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	ArrayList <Eleve> parieur = new ArrayList<Eleve>(); // Create an ArrayList object
	ArrayList <Double> amount = new ArrayList<Double>(); // Create an ArrayList object
	ArrayList <Integer> bet = new ArrayList<Integer>(); // Create an ArrayList object
		
	//constructor
	public PariDeClasse() {
		super(); // mise en attendant héritage concret
		System.out.println("Un pari de classe a ete cree");
	}
}
