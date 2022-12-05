import java.util.ArrayList;

public class Pari {
	String description;
	ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	ArrayList <Eleve> parieur = new ArrayList<Eleve>(); // Create an ArrayList object
	ArrayList <Double> amount = new ArrayList<Double>(); // Create an ArrayList object
	ArrayList <Integer> bet = new ArrayList<Integer>(); // Create an ArrayList object
	
	public Pari() {
		System.out.println("Un pari a ete cree");
	}
	
	protected void finPari() {
		System.out.println("Fin du pari");
	}
	
	
	
}
