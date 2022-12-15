import java.util.ArrayList;

public class PariPersonnel extends Pari{
	
	String description;
	ArrayList <String> chatbox = new ArrayList<String>(); // Create an ArrayList object
	ArrayList <Eleve> parieur = new ArrayList<Eleve>(); // Create an ArrayList object
	ArrayList <Double> amount = new ArrayList<Double>(); // Create an ArrayList object
	ArrayList <Integer> bet = new ArrayList<Integer>(); // Create an ArrayList object
	
	public PariPersonnel() {
		System.out.println("Un pari personnel a ete cree");
	}
	
	private void inviteEleve() {
		System.out.println("Method InviteEleve");
	}
}
