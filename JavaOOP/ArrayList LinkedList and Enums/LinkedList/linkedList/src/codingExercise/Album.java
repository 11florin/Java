package codingExercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean addSong(String title, double duration) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Song allready exist: " + title);
            return false;
            }
        }
        Song newSong = new Song(title, duration);
        this.songs.add(newSong);

        System.out.println("Added song: " + title);
        return true;
    }
    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equalsIgnoreCase(title)) {
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;

        if (index >= 0 && index < this.songs.size()) {
            Song songToAdd = this.songs.get(index);
            playList.add(songToAdd);
            System.out.println("Added to playList: " + songToAdd.getTitle());
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song foundSong = findSong(title);

        if (foundSong != null) {
            playlist.add(foundSong);
            System.out.println("Added to playlist: " + foundSong.getTitle());
            return true;
        } else {
            System.out.println("The somg " + title + " is not in this album");
            return false;
        }
    }
}
