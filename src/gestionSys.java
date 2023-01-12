
public class gestionSys {
	public static void main(String[] args) 
	//Ce programme de dmonstration a pour objectif de montrer le fonctionnement des paris. Notre projet n'implemente pas 
	//d'interface a ce stade c'est pourquoi nous declarons les objets et réalisons les actions de façons "statique"
	
    {
		System.out.println("Creation des eleves");
		Delegue eleve1 = new Delegue("eleve1", "Florian");
		Eleve eleve2 = new Eleve("eleve2", "Dylan");
		Eleve eleve3 = new Eleve("eleve3", "Ewan");
		System.out.println("");
		System.out.print("portefeuille des eleves: ");
		System.out.print(eleve1.getName()+ ": " + eleve1.getWallet() + " points | ");
		System.out.print(eleve2.getName()+ ": " + eleve2.getWallet() + " points | ");
		System.out.println(eleve3.getName()+ ": " + eleve3.getWallet() + " points");
		System.out.println("");

		int pariId = eleve1.CreerPari("pari de demonstration");//Le delegue crée un nouveau pari de classe
		Pari pari1 = eleve1.getPari(pariId);//on recupère l'instance de ce pari
		
		System.out.println(eleve1.getName()+ " a cree un pari");

		pari1.addMise(eleve2, 10.0, 5);//les eleves 2 et 3 se positionne
		System.out.println(eleve2.getName()+ " a parie 10 points sur un score de 5");

		pari1.addMise(eleve3, 20.0, 3);
		System.out.println(eleve3.getName()+ " a parie 20 points sur un score de 3");
		System.out.println("Le pari est termine avec un bon pari a 5");

		pari1.finPari(5);//L'organisateur (eleve 1) termine le pari en indiquant la bonne valeur.
		
		System.out.println("");

		System.out.print("portefeuille des eleves: ");
		System.out.print(eleve1.getName()+ ": " + eleve1.getWallet() + " points | ");
		System.out.print(eleve2.getName()+ ": " + eleve2.getWallet() + " points | ");
		System.out.print(eleve3.getName()+ ": " + eleve3.getWallet() + " points");
		
    }
}
  