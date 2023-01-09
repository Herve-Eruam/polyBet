
public class gestionSys {
	public static void main(String[] args) 
    {
		System.out.println("Création des eleves");

		Eleve eleve1 = new Eleve("eleve1", "Florian");
		Eleve eleve2 = new Eleve("eleve2", "Dylan");
		Eleve eleve3 = new Eleve("eleve3", "Ewan");
		System.out.println("");
		System.out.print("portefeuille des eleves: ");
		System.out.print(eleve1.getName()+ ": " + eleve1.getWallet() + " points | ");
		System.out.print(eleve2.getName()+ ": " + eleve2.getWallet() + " points | ");
		System.out.println(eleve3.getName()+ ": " + eleve3.getWallet() + " points");
		System.out.println("");


		Pari pari1 = new Pari(eleve1);
		System.out.println(eleve1.getName()+ " a crée un pari");

		pari1.addMise(eleve2, 10.0, 5);
		System.out.println(eleve2.getName()+ " a parié 10 points sur un score de 5");

		pari1.addMise(eleve3, 20.0, 3);
		System.out.println(eleve3.getName()+ " a parié 20 points sur un score de 3");
		System.out.println("Le pari est terminé avec un bon pari à 5");

		pari1.finPari(5);
		
		System.out.println("");

		System.out.print("portefeuille des eleves: ");
		System.out.print(eleve1.getName()+ ": " + eleve1.getWallet() + " points | ");
		System.out.print(eleve2.getName()+ ": " + eleve2.getWallet() + " points | ");
		System.out.print(eleve3.getName()+ ": " + eleve3.getWallet() + " points");
		
    }
}
