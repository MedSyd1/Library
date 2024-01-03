package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListEmprunts {

    ArrayList<Emprunt> emprunts = new ArrayList<>();

    ListEmprunts(){
        emprunts.add(new Emprunt("livre1",1,LocalDate.of(2024,12,30),LocalDate.of(2024,1,20)));
        emprunts.add(new Emprunt("livre2",2,LocalDate.of(2024,12,16),LocalDate.of(2024,1,19)));
        emprunts.add(new Emprunt("livre3",1,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));
        emprunts.add(new Emprunt("livre4",4,LocalDate.of(2024,12,20),LocalDate.of(2024,1,20)));
        emprunts.add(new Emprunt("livre5",5,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));
        emprunts.add(new Emprunt("livre1",2,LocalDate.of(2024,12,31),LocalDate.of(2024,1,31)));
    }

    public ArrayList<Emprunt> getEmprunts() {
        return emprunts;
    }

}
