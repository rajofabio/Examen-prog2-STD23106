package com.plateformeStreamingMusical;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String id;
    private String nom;
    private List<Chanson> chansons;
    private int likes;

    public Playlist(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.chansons = new ArrayList<>();
        this.likes = 0;
    }


    public void addToPlaylist(Chanson chanson) {
        chansons.add(chanson);
    }

    public void removeById(String idChanson) {
        chansons.removeIf(chanson -> chanson.getId().equals(idChanson));
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0) likes--;
    }

    public Playlist exclude(List<String> genresExclus) {
        Playlist nouvellePlaylist = new Playlist(this.id + "excluded", this.nom + " (Exclu)");
        for (Chanson chanson : chansons) {
            boolean exclure = false;
            for (String genre : chanson.getGenres()) {
                if (genresExclus.contains(genre)) {
                    exclure = true;
                    break;
                }
            }
            if (!exclure) {
                nouvellePlaylist.addToPlaylist(chanson);
            }
        }
        return nouvellePlaylist;
    }

    public int getTotalLikes() {
        return likes;
    }

    public List<Chanson> getChansons() {
        return chansons;
    }
}
