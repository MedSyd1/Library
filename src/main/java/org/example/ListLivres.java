package org.example;

import java.util.ArrayList;

public class ListLivres {

    ArrayList<Livre> livres = new ArrayList<>();
    
    ListLivres(){
        
        livres.add(new Livre(1,"livre1", "auteur1", "2010", "romatique", 0));
        livres.add(new Livre(2,"livre2", "auteur2", "2004", "romatique", 0));
        livres.add(new Livre(3,"livre3", "auteur3", "2016", "romatique", 20));
        livres.add(new Livre(4,"livre4", "auteur4", "2020", "romatique", 20));
        livres.add(new Livre(5,"livre5", "auteur5", "2011", "romatique", 11));
        livres.add(new Livre(6,"livre6", "auteur6", "2013", "romatique", 5));
        livres.add(new Livre(7,"livre7", "auteur7", "2014", "romatique", 20));
        livres.add(new Livre(8,"livre8", "auteur8", "2017", "romatique", 20));
        livres.add(new Livre(9,"livre9", "auteur9", "2018", "romatique", 0));
        livres.add(new Livre(10,"livre10", "auteur10", "2012", "romatique", 20));
    
    }
    

    public ArrayList<Livre> getLivres() {
        return livres;
    }

}
