package com.plateformeStreamingMusical;

import java.time.Duration;
import java.util.List;

public class Chanson {
    private String id;
    private String titre;
    private Duration duree;
    private List<String> genres;
    private Artiste artiste;
    private Album album;

    public Chanson(String id, String titre, Duration duree, List<String> genres, Artiste artiste, Album album) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genres = genres;
        this.artiste = artiste;
        this.album = album;
    }


    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Duration getDuree() {
        return duree;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public Album getAlbum() {
        return album;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }
}
