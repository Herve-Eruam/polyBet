public class Eleve {
    private String id_E;
    private String nom;
    private double wallet;
    private Pari Array listPari;


    public Eleve (String id_E, String nom, double wallet, Pari Array listPari){
            this.id_E = id_E;
            this.nom = nom;
            this.wallet = wallet;
            this.listPari = listPari;

    }
    public void Chatter (String msg, int id_E){


    }

    public void Parier (int argent, int id_P){
        for (i = 0; i<listPari.length();i++){
            if (listPari.get(i) == id_P);
                listPari.get(i).set.ammount(argent);
                listPari.get(i).set.parieur.append(nom);
        }
        

    }

    public void CashOut (){

    }

    public void CreerPariPerso (){

    }

}