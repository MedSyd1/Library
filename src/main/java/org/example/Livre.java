package org.example;

import java.util.Objects;

public class Livre implements Comparable<Livre>{
    
    private int id;
    private String titre;
    private String auteur;
    private String pubDate;
    private String genre;
    private  int quantite;

    public Livre(int id, String titre, String auteur, String pubDate, String genre, int quantite) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.pubDate = pubDate;
        this.genre = genre;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((titre == null) ? 0 : titre.hashCode());
        result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
        result = prime * result + ((pubDate == null) ? 0 : pubDate.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + quantite;
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
        Livre other = (Livre) obj;
        if (id != other.id)
            return false;
        if (titre == null) {
            if (other.titre != null)
                return false;
        } else if (!titre.equals(other.titre))
            return false;
        if (auteur == null) {
            if (other.auteur != null)
                return false;
        } else if (!auteur.equals(other.auteur))
            return false;
        if (pubDate == null) {
            if (other.pubDate != null)
                return false;
        } else if (!pubDate.equals(other.pubDate))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (quantite != other.quantite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", pubDate=" + pubDate + ", genre="
                + genre + ", quantite=" + quantite + "]";
    }

    @Override
    public int compareTo(Livre l) {
        return Integer.compare(id,l.getId());
    }

    
}
