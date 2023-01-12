import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PariTest {

	@Test
	public void testPari() {
		Delegue testUser = new Delegue("0", "testEleve");
		int old_id_counter = Pari.getIdCounter();
		Pari pariTest = new Pari(testUser);
		int new_id_counter = Pari.getIdCounter();
		assertTrue(new_id_counter == old_id_counter + 1);
	}

	@Test
	public void testFinPari() {
		Delegue userTestOrga = new Delegue("0", "testEleveOrganisateur");
		Pari pariTest = new Pari(userTestOrga);
		pariTest.openPari();
		
		Eleve userTest1 = new Eleve("1", "testEleve1");
		Double amountUser1 = 20.0;
		Integer bet = 10;
		pariTest.addMise(userTest1, amountUser1, bet);
		
		Eleve userTest2 = new Eleve("2", "testEleve2");
		Double amountUser2 = 10.0;
		bet = 13;
		pariTest.addMise(userTest2, amountUser2, bet);
		
		Eleve userTest3 = new Eleve("3", "testEleve3");
		Double amountUser3 = 10.0;
		bet = 13;
		pariTest.addMise(userTest3, amountUser3, bet);
		
		Double walletUserOrga = userTestOrga.getWallet();
		Double walletUser1 = userTest1.getWallet();
		Double walletUser2 = userTest2.getWallet();
		Double walletUser3 = userTest3.getWallet();

		pariTest.finPari(13);

		Double gainUserOrga = userTestOrga.getWallet() - walletUserOrga;
		Double gainUser1 = userTest1.getWallet() - walletUser1;
		Double gainUser2 = userTest2.getWallet() - walletUser2;
		Double gainUser3 = userTest3.getWallet() - walletUser3;

		double comission = pariTest.getComission();
		double toRedistribute = 20 - 20*comission/100;
		assertTrue(20*(comission/100) == gainUserOrga, "Le gain de l'organisateur n'est pas cohérant");
		assertTrue(gainUser1 == 0, "Le gain des perdant n'est pas cohérant");
		assertTrue(gainUser2 == toRedistribute/2 + amountUser2, "Le gain des gagnant n'est pas cohérant");
		assertTrue(gainUser3 == toRedistribute/2 + amountUser3, "Le gain des gagnant n'est pas cohérant");	
	}

	@Test
	public void testOpenPari() {
		Delegue userTestOrga = new Delegue("0", "testEleveOrganisateur");
		Pari pariTest = new Pari(userTestOrga);	
		pariTest.openPari();
		boolean state = pariTest.getPariOpenForNewBetState();
		assertTrue(state);
	}

	@Test
	public void testClosePari() {
		Delegue userTestOrga = new Delegue("0", "testEleveOrganisateur");
		Pari pariTest = new Pari(userTestOrga);	
		pariTest.closePari();
		boolean state = pariTest.getPariOpenForNewBetState();
		assertTrue(!state);
	}

	@Test
	public void testAddMise() {
		Delegue userTestOrga = new Delegue("0", "testEleveOrganisateur");
		Pari pariTest = new Pari(userTestOrga);	
		int nbMise = pariTest.getNbMise();
		pariTest.closePari();
		pariTest.addMise(userTestOrga, 10.0, 10);
		assertTrue(nbMise == pariTest.getNbMise());
		pariTest.openPari();
		pariTest.addMise(userTestOrga, 10.0, 10);
		assertTrue(nbMise+1 == pariTest.getNbMise());
	
		
	}

	@Test
	public void testSetDescription() {
		Delegue userTestOrga = new Delegue("0", "testEleveOrganisateur");
		Pari pariTest = new Pari(userTestOrga);
		String desc = "test 1234";
		pariTest.setDescription(desc);
		String desc1 = pariTest.getDescription();	
		assertEquals(desc1, desc);
	}

	

}
