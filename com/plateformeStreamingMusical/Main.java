package com.plateformeStreamingMusical;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArtisteSolo artiste = new ArtisteSolo("1", "romance", 2019, "Madagascar", "reko fy ", "Rasolofoniaina", LocalDate.of(2000, 5, 20));


        Chanson chanson = new Chanson("1", "Hafa mintsy", Duration.ofMinutes(3).plusSeconds(45), List.of("classique"), artiste, null);

        Playlist playlist = new Playlist("1", "Ma Playlist");
        playlist.addToPlaylist(chanson);


        Utilisateur utilisateur = new Utilisateur("1", "Rakoto");
        utilisateur.like(playlist);


        System.out.println("Nombre de likes: " + playlist.getTotalLikes());


        System.out.println("Date de naissance de l'artiste: " + artiste.getDateDeNaissance());


        Playlist playlistSansClassique = playlist.exclude(List.of("classique"));
        System.out.println("Nombre de chansons après exclusion: " + playlistSansClassique.getChansons().size());
    }
}
