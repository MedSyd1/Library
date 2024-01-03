package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListRetours {
    
    ArrayList<Retour> retours  = new ArrayList<>();

    ListRetours(){

        retours.add(new Retour(new ListEmprunts().getEmprunts().get(0), LocalDate.of(2024,1,20)));
        retours.add(new Retour(new ListEmprunts().getEmprunts().get(1), LocalDate.of(2024,3,2)));
        retours.add(new Retour(new ListEmprunts().getEmprunts().get(2), LocalDate.of(2024,1,31)));
        retours.add(new Retour(new ListEmprunts().getEmprunts().get(3), LocalDate.of(2024,2,20)));
        retours.add(new Retour(new ListEmprunts().getEmprunts().get(4), LocalDate.of(2024,1,31)));

    }

    public ArrayList<Retour> getRetours() {
        return retours;
    }
}
