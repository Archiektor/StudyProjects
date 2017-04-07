package com.archiektor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by Archiektor on 03.03.2017.
 */
public class Jukebox1 {

    ArrayList<Song> songList = new ArrayList<Song>();

    class ArtistComporator implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songList);

        ArtistComporator artistComporator = new ArtistComporator();

        Collections.sort(songList, artistComporator);
        System.out.println(songList + " !sorted ");

        HashSet<ArrayList<Song>> songSet = new HashSet<>();
        songSet.add(songList);
        System.out.println(songSet);
    }


    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
        //songList.add(tokens[0]);
    }
}
