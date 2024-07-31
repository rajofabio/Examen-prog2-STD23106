package com.plateformeStreamingMusical;

import java.time.LocalDate;

public class ArtisteSolo extends Artiste {
    private String prenom;
    private String nom;
    private LocalDate dateDeNaissance;

    public ArtisteSolo(String id, String nomDeScene, int anneeDebut, String nationalite, String prenom, String nom, LocalDate dateDeNaissance) {
        super(id, nomDeScene, anneeDebut, nationalite);
        this.prenom = prenom;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}
