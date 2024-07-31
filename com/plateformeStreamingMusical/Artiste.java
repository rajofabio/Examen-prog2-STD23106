package com.plateformeStreamingMusical;

public abstract class Artiste {
    protected String id;
    protected String nomDeScene;
    protected int anneeDebut;
    protected String nationalite;

    public Artiste(String id, String nomDeScene, int anneeDebut, String nationalite) {
        this.id = id;
        this.nomDeScene = nomDeScene;
        this.anneeDebut = anneeDebut;
        this.nationalite = nationalite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomDeScene() {
        return nomDeScene;
    }

    public void setNomDeScene(String nomDeScene) {
        this.nomDeScene = nomDeScene;
    }

    public int getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(int anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
