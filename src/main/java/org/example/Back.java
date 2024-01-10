package org.example;

import java.time.LocalDate;

public class Back implements Comparable<Back>{

    private Loan emprunt;
    private LocalDate dateRetour;
    
    public Back(Loan emprunt, LocalDate dateRetour) {
        this.emprunt = emprunt;
        this.dateRetour = dateRetour;
    }

    public Loan getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Loan emprunt) {
        this.emprunt = emprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emprunt == null) ? 0 : emprunt.hashCode());
        result = prime * result + ((dateRetour == null) ? 0 : dateRetour.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Back other = (Back) obj;
        if (emprunt == null) {
            if (other.emprunt != null)
                return false;
        } else if (!emprunt.equals(other.emprunt))
            return false;
        if (dateRetour == null) {
            if (other.dateRetour != null)
                return false;
        } else if (!dateRetour.equals(other.dateRetour))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Retour [emprunt=" + emprunt + ", dateRetour=" + dateRetour + "]";
    }

    @Override
    public int compareTo(Back o){
        return Integer.compare(emprunt.getId(), o.getEmprunt().getId());
    }
   
}
