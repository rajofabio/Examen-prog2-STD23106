package com.plateformeStreamingMusical;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private String id;
    private String nom;
    private LocalDate dateDeSortie;
    private List<Chanson> chansons;
    private Artiste artiste;

    public Album(String id, String nom, LocalDate dateDeSortie, List<Chanson> chansons, Artiste artiste) {
        this.id = id;
        this.nom = nom;
        this.dateDeSortie = dateDeSortie;
        this.chansons = chansons;
        this.artiste = artiste;
    }


    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public List<Chanson> getChansons() {
        return chansons;
    }

    public Artiste getArtiste() {
        return artiste;
    }
}
