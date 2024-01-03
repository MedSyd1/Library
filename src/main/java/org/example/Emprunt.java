package org.example;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.Objects;

public class Emprunt implements Comparable<Emprunt>{

    private String livrename;
    private int id;
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;
    
    public Emprunt(String livrename, int id, LocalDate dateEmprunt, LocalDate dateRetour) {
        this.livrename = livrename;
        this.id = id;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public String getLivrename() {
        return livrename;
    }

    public void setLivrename(String livrename) {
        this.livrename = livrename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
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
        result = prime * result + ((livrename == null) ? 0 : livrename.hashCode());
        result = prime * result + id;
        result = prime * result + ((dateEmprunt == null) ? 0 : dateEmprunt.hashCode());
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
        Emprunt other = (Emprunt) obj;
        if (livrename == null) {
            if (other.livrename != null)
                return false;
        } else if (!livrename.equals(other.livrename))
            return false;
        if (id != other.id)
            return false;
        if (dateEmprunt == null) {
            if (other.dateEmprunt != null)
                return false;
        } else if (!dateEmprunt.equals(other.dateEmprunt))
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
        return "Emprunt [livrename=" + livrename + ", id=" + id + ", dateEmprunt=" + dateEmprunt + ", dateRetour="
                + dateRetour + "]";
    }

    @Override
    public int compareTo(Emprunt o) {
        return Integer.compare(id, o.getId());
    }
    

   
    
}
