package com.plateformeStreamingMusical;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String id;
    private String nom;
    private List<Playlist> playlists;
    private List<Playlist> favoris;

    public Utilisateur(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.playlists = new ArrayList<>();
        this.favoris = new ArrayList<>();
    }


    public void like(Playlist playlist) {
        if (favoris.contains(playlist)) {
            favoris.remove(playlist);
            playlist.unlike();
        } else {
            favoris.add(playlist);
            playlist.like();
        }
    }


    public int countPlaylist(String idChanson) {
        int count = 0;
        for (Playlist playlist : playlists) {
            for (Chanson chanson : playlist.getChansons()) {
                if (chanson.getId().equals(idChanson)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Playlist> getFavoris() {
        return favoris;
    }
}
